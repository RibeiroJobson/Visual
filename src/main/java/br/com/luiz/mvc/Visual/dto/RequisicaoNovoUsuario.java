package br.com.luiz.mvc.Visual.dto;
import javax.validation.constraints.NotBlank;

import br.com.luiz.mvc.Visual.model.Usuario;

public class RequisicaoNovoUsuario {
	@NotBlank //NotBlank.requisicaoNovoPedido.nomeProduto=não pode estar em branco
	private String nomeusuario;
	@NotBlank
	private String apelidousuario;
	@NotBlank
	private String email;
	
	
	public String getNomeusuario() {
		return nomeusuario;
	}
	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}
	public String getApelidousuario() {
		return apelidousuario;
	}
	public void setApelidousuario(String apelidousuario) {
		this.apelidousuario = apelidousuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario toUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(nomeusuario);
		usuario.setApelido(apelidousuario);
		usuario.setEmail(email);
		
		return usuario;
	}
	
}
