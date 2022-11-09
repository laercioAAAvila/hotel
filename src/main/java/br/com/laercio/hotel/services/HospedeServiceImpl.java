package br.com.laercio.hotel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.laercio.hotel.model.HospedeModel;
import br.com.laercio.hotel.repository.HospedeRepository;

@Service
public class HospedeServiceImpl implements HospedeService {
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	@Override
	public void save(HospedeModel hospedeModel) {
		this.hospedeRepository.save(hospedeModel);
		
	}
}
