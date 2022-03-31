package br.com.boa.forma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.boa.forma.service.ConsultaBdSAFService;
import br.com.boa.forma.service.EnviaMensagemSqsService;


@RestController
public class ClienteController {
	
	@Autowired 
	private ConsultaBdSAFService consultaBdSAFService;
	
	@Autowired
	private EnviaMensagemSqsService enviaMensagemSqsService;
		
	@RequestMapping("/clientes")
	public Boolean retornaAllClientesBDSAF(){
		
		try {
			
			enviaMensagemSqsService.enviaMensagem(
					consultaBdSAFService.getAllClientesDBSAF());
			return true;

		} catch (Exception e) {
			return false;
		}		
		
	}

}
