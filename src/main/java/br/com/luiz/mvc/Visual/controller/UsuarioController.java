package br.com.luiz.mvc.Visual.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.luiz.mvc.Visual.dto.RequisicaoNovoUsuario;
import br.com.luiz.mvc.Visual.model.Usuario;
import br.com.luiz.mvc.Visual.repository.UsuarioRepository;
// Avisa para o spring que ele 
@Controller
// anotação para direcionar rota
@RequestMapping("usuario")
public class UsuarioController {

	// anotação para informar o repositorio para o spring
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping 
	public String formulario(RequisicaoNovoUsuario requisicao) {
		return "usuario/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoUsuario requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "usuario/formulario";
		}
		
		Usuario usuario = requisicao.toUsuario();
		usuarioRepository.save(usuario);
		
		return "redirect:/home";
	}
	
}
