package br.com.boa.forma.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 3262725538575824946L;
	@Id
    @Column(name = "carteirinhaId")
	private int carteirinhaId;
	
    @Column(name = "nome")
	private String nome;
    
    @Column(name = "cpf")
    private int cpf;
    
    @Column(name = "dataNascimento" )
    private String dataNascimento;
    
	public int getCarteirinhaId() {
		return carteirinhaId;
	}
	public void setCarteirinhaId(int carteirinhaId) {
		this.carteirinhaId = carteirinhaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "{\"carteirinhaId\": \"" + carteirinhaId + "\","
				+ "\"nome\": \"" + nome + "\","
				+ "\"cpf\": \"" + cpf + "\","
				+ "\"dataNascimento\": \""+ dataNascimento+"\"}";
	}
	
	
       
}
