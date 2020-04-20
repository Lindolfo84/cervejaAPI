package br.com.riachuelo.cervejaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.riachuelo.cervejaapi.model.Cerveja;

@Repository
@Transactional
public interface CervejaRepository extends JpaRepository<Cerveja, Long> {

}
