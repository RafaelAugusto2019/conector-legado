package br.com.boa.forma.service;

import br.com.boa.forma.entity.Clientes;

public interface EnviaMensagemSqsService {
	
	public void enviarMensagemParaSQS(Clientes listaClientes) throws Exception;

}
