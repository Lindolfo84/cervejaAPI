package br.com.riachuelo.cervejaapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.riachuelo.cervejaapi.converter.CervejaConverter;
import br.com.riachuelo.cervejaapi.dto.CervejaDTO;
import br.com.riachuelo.cervejaapi.form.DescricaoForm;
import br.com.riachuelo.cervejaapi.model.Cerveja;
import br.com.riachuelo.cervejaapi.repository.CervejaRepository;

@RestController
@RequestMapping("/cerveja")
public class CervejaController {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private CervejaConverter cervejaConverter;	
	@Autowired
	private CervejaRepository repository;
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * Mapping para retornar a lista de cervejas.
	 * @return
	 */
	@GetMapping("/lista")
	public ResponseEntity<CervejaDTO[]> get(){
		
	    final String uri = "https://api.punkapi.com/v2/beers";
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<CervejaDTO[]> result = restTemplate.exchange(uri, HttpMethod.GET, entity, CervejaDTO[].class);

	    CervejaDTO[] cervejaDTOs = result.getBody();
		
	    List<Cerveja> cervejasCriadas = repository.saveAll(Arrays.asList(cervejaConverter.dtoToEntity(cervejaDTOs)));
	    
	    String ipAddress = request.getHeader("x-forwarded-for");
	    if (ipAddress == null) {
	        ipAddress = request.getHeader("X_FORWARDED_FOR");
	        if (ipAddress == null){
	            ipAddress = request.getRemoteAddr();
	        }
	    }
	    List<Cerveja> cervejasCriadasAlteradas = new ArrayList<Cerveja>();
	    
	    for (Cerveja cerveja : cervejasCriadas) {
			cerveja.setVersao(1);
			cerveja.setIpAlteracao(ipAddress);
			cervejasCriadasAlteradas.add(cerveja);
		}
	    
	    CervejaDTO[] entityToDto = cervejaConverter.entityToDto(cervejasCriadasAlteradas);
	    
  	    return ResponseEntity.ok(entityToDto);
	}
	
	/**
	 * Mapping para retornar detalhes de uma cerveja através de um ID
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<CervejaDTO[]> detail(@PathVariable Long id){
		
	    String uri = "https://api.punkapi.com/v2/beers/".concat(String.valueOf(id));
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    return restTemplate.exchange(uri, HttpMethod.GET, entity, CervejaDTO[].class);
	}
	
	/**
	 * Mapping para alterar a descrição de uma cerveja.
	 * @param id
	 * @param descricaoDTO
	 * @return
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody DescricaoForm descricaoDTO) {
		Optional<Cerveja> optional = repository.findById(id);
		
		if (optional.isPresent()) {
			Cerveja cerveja = optional.get();
			cerveja.setDescription(descricaoDTO.getDescricao());
			cerveja.setVersao(cerveja.getVersao()+1);
			return ResponseEntity.ok(cervejaConverter.entityToDto(cerveja));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}

}
