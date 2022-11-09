package br.com.laercio.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HospedesController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hospedes")
	public String listHospedes() {
		return "page/hospede/lista";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cadastro/hospede")
	public String cadastroHospede() {
		return "page/hospede/cadastro";
	}
}
