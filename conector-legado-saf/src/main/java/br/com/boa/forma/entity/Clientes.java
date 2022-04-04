package br.com.boa.forma.entity;

import java.io.Serializable;
import java.util.List;

public class Clientes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1756152837010033485L;
	
	private List<Cliente> listaClientes;

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}	

}
