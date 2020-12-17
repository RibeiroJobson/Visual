package br.com.luiz.mvc.Visual.dto;

import javax.validation.constraints.NotBlank;

import br.com.luiz.mvc.Visual.model.Cliente;

public class RequisicaoNovoCliente {
	@NotBlank //NotBlank.requisicaoNovoPedido.nomeProduto=não pode estar em branco
	private String nomecliente;
	@NotBlank
	private String email;
	
	private String numero;
	private String enderecocliente;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getEnderecocliente() {
		return enderecocliente;
	}
	public void setEnderecocliente(String enderecocliente) {
		this.enderecocliente = enderecocliente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Cliente toCliente() {
		Cliente cliente = new Cliente();
		cliente.setNome(nomecliente);
		cliente.setEmail(email);
		cliente.setEndereco(enderecocliente);
		cliente.setNumero(numero);
		cliente.setBairro(bairro);
		cliente.setCidade(cidade);
		cliente.setCep(cep);
		cliente.setComplemento(complemento);
	
		
		return cliente;
	}
	
}
