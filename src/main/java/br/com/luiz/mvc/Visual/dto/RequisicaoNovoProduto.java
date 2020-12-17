package br.com.luiz.mvc.Visual.dto;

import javax.validation.constraints.NotBlank;

import br.com.luiz.mvc.Visual.model.Produto;

public class RequisicaoNovoProduto {
	@NotBlank //NotBlank.requisicaoNovoPedido.nomeProduto=não pode estar em branco
	private String nomeproduto;
	@NotBlank
	private String urlimagem;
	private Double preco;
	private String descricao;
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public String getUrlimagem() {
		return urlimagem;
	}
	public void setUrlimagem(String urlimagem) {
		this.urlimagem = urlimagem;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Produto toProduto() {
		Produto produto = new Produto();
		produto.setNome(nomeproduto);
		produto.setDescricao(descricao);
		produto.setUrlimagem(urlimagem);
		produto.setPreco(preco);
		
		
		return produto;
	}
	
}
