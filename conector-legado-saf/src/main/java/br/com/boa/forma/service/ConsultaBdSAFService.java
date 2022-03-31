package br.com.boa.forma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boa.forma.entity.Cliente;
import br.com.boa.forma.repository.ClienteRepository;

@Service
public class ConsultaBdSAFService {
	
	@Autowired ClienteRepository clienteRepository;
	
	
	public List<Cliente> getAllClientesDBSAF() {
				
		return clienteRepository.findAll();
	}

}
