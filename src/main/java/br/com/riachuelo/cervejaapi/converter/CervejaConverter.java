package br.com.riachuelo.cervejaapi.converter;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.riachuelo.cervejaapi.dto.CervejaDTO;
import br.com.riachuelo.cervejaapi.model.Cerveja;

@Service
public class CervejaConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Cerveja dtoToEntity(CervejaDTO cervejaDTO) {
		return modelMapper.map(cervejaDTO, Cerveja.class);
	}
	

	public Cerveja[] dtoToEntity(CervejaDTO[] cervejaDTOs) {
		return modelMapper.map(cervejaDTOs, Cerveja[].class);
	}


	public CervejaDTO[] entityToDto(List<Cerveja> cervejasCriadas) {
		return modelMapper.map(cervejasCriadas, CervejaDTO[].class);
	}


	public CervejaDTO entityToDto(Cerveja cervejaAtualizada) {
		return modelMapper.map(cervejaAtualizada, CervejaDTO.class);
	}
}
