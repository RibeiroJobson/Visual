package br.com.luiz.mvc.Visual.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.luiz.mvc.Visual.dto.RequisicaoNovoCliente;
import br.com.luiz.mvc.Visual.model.Cliente;
import br.com.luiz.mvc.Visual.repository.ClienteRepository;


@Controller
@RequestMapping("cliente")
public class ClienteController {
 
	// anotação para informar o repositorio para o spring
		@Autowired
		private ClienteRepository clienteRepository;
	
	@GetMapping 
	public String formulario(RequisicaoNovoCliente requisicao) {
		return "cliente/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoCliente requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "cliente/formulario";
		}
		
		Cliente cliente = requisicao.toCliente();
		clienteRepository.save(cliente);
		
		return "redirect:/home";
	}
}
