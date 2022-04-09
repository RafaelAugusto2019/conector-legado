package br.com.boa.forma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boa.forma.entity.Cliente;
import br.com.boa.forma.repository.ClienteRepository;
import br.com.boa.forma.service.ConsultaBdSAFService;

@Service
public class ConsultaBdSAFServiceImpl implements ConsultaBdSAFService{
	
	@Autowired ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> getListaClientesDBSAF() throws Exception {
		
		try {
			
			return clienteRepository.findAll();
		}
		catch (Exception e) {		
			throw new Exception("ConsultaBdSAFService: " + e.getMessage());
		}
						
	}

}
