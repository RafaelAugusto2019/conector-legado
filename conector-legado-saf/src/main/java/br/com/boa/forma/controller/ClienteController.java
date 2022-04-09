package br.com.boa.forma.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.boa.forma.service.ConsultaBdSAFService;
import br.com.boa.forma.service.EnviaMensagemSqsService;


@RestController
public class ClienteController {
	
	Logger logger = Logger.getLogger("ClienteController");
	
	@Autowired 
	private ConsultaBdSAFService consultaBdSAFService;
	
	@Autowired
	private EnviaMensagemSqsService enviaMensagemSqsService;
		
	@RequestMapping("/enviar/clientes")
	public String enviaListaDeClientesBDSAFParaSQS(){
								
		try {

			enviaMensagemSqsService.enviarMensagemParaSQS(
					consultaBdSAFService.getListaClientesDBSAF());

			return "Lista de clientes enviada com sucesso";

		} catch (Exception e) {
			
			logger.log(Level.WARNING, e.getMessage());
			return "Erro ao enviar a lista de clientes";
			
		}		
		
	}

}
