package br.com.laercio.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.laercio.hotel.model.HospedeModel;
import br.com.laercio.hotel.services.HospedeServiceImpl;

@Controller
public class HospedesController {
	
	@Autowired
	private HospedeServiceImpl hospedeServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET, value = "/hospedes")
	public String listHospedes() {
		return "page/hospede/lista";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cadastro/hospede")
	public String cadastroHospede() {
		return "page/hospede/cadastro";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cadastro/hospede/create")
	public String form(@ModelAttribute("hospedeModel") HospedeModel hospedeModel) {
		this.hospedeServiceImpl.save(hospedeModel);
		
		return "page/hospede/lista";
	}
}
