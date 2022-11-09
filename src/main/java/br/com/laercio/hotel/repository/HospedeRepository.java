package br.com.laercio.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.laercio.hotel.model.HospedeModel;

@Repository
public interface HospedeRepository extends JpaRepository<HospedeModel, Long>{

}
