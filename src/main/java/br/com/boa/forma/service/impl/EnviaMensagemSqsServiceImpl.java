package br.com.boa.forma.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import br.com.boa.forma.entity.Clientes;
import br.com.boa.forma.service.EnviaMensagemSqsService;

@Service
public class EnviaMensagemSqsServiceImpl implements EnviaMensagemSqsService{
		
	@Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String endpoint;
	
    @Override
	public void enviarMensagemParaSQS(Clientes listaClientes) throws Exception {
		
		try {
			queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(listaClientes).build());
		}catch (Exception e) {
			throw new Exception("EnviaMensagemSqsService: " + e.getMessage());
		}
		
	}

}
