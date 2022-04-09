package br.com.boa.forma.service;

import java.util.List;

import br.com.boa.forma.entity.Cliente;

public interface EnviaMensagemSqsService {
	
	public void enviarMensagemParaSQS(List<Cliente> listaClientes) throws Exception;


}
