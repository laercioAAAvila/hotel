package br.com.laercio.hotel.services;

import org.springframework.stereotype.Service;

import br.com.laercio.hotel.model.HospedeModel;

@Service
public interface HospedeService {
	void save(HospedeModel hospedeModel);
}
