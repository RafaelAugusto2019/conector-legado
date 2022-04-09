package br.com.boa.forma.service;

import java.util.List;

import br.com.boa.forma.entity.Cliente;

public interface ConsultaBdSAFService {
	
	public List<Cliente> getListaClientesDBSAF() throws Exception;

}
