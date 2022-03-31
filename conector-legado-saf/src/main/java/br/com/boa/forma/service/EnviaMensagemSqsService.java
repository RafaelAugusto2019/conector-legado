package br.com.boa.forma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import br.com.boa.forma.entity.Cliente;

@Service
public class EnviaMensagemSqsService {
	
	 @Autowired
	    private QueueMessagingTemplate queueMessagingTemplate;

	    @Value("${cloud.aws.end-point.uri}")
	    private String endpoint;
	
	public void enviaMensagem(List<Cliente> listaClientes) {
		queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(listaClientes).build());
	}

}
