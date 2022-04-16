package br.com.boa.forma.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boa.forma.entity.Clientes;
import br.com.boa.forma.repository.ClienteRepository;
import br.com.boa.forma.service.ConsultaBdSAFService;

@Service
public class ConsultaBdSAFServiceImpl implements ConsultaBdSAFService{
	
	@Autowired ClienteRepository clienteRepository;
	
	@Override
	public Clientes getListaClientesDBSAF() throws Exception {
		
		try {
			
			Clientes clientes = new Clientes();
			clientes.setListaClientes(clienteRepository.findAll());
			
			return clientes;
		}
		catch (Exception e) {		
			throw new Exception("ConsultaBdSAFService: " + e.getMessage());
		}
						
	}

}
