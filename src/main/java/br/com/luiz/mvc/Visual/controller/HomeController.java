package br.com.luiz.mvc.Visual.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.luiz.mvc.Visual.model.Usuario;
import br.com.luiz.mvc.Visual.repository.UsuarioRepository;


// anota para o spring 
@Controller
// anota para toda requisição get em home ser feita nessa class
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@GetMapping
	public String home(Model model) {
		List<Usuario> usuario = usuarioRepository.findAll();
		model.addAttribute("usuarios", usuario);
		return "home"; 
	}
		
	

}
