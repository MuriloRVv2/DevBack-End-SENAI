package br.com.suporteSenai.suporte.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class formTecnicoController {

	@GetMapping(value = "/formTecnico")
	public String formTecnico() {
		return "formTecnico";
	}
	
}
