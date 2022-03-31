package br.com.boa.forma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.boa.forma.entity.Cliente;
import br.com.boa.forma.service.ConsultaBdSAFService;


@RestController
public class ClienteController {
	
	@Autowired 
	private ConsultaBdSAFService consultaBdSAFService;
		
	@RequestMapping("/clientes")
	public List<Cliente> retornaAllClientesBDSAF(){

		return consultaBdSAFService.getAllClientesDBSAF();
		
	}

}
