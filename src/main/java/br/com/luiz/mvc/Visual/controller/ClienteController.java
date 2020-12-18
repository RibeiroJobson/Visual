package br.com.luiz.mvc.Visual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.luiz.mvc.Visual.dto.RequisicaoNovoCliente;
import br.com.luiz.mvc.Visual.model.Cliente;
import br.com.luiz.mvc.Visual.model.Produto;
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
	
	@GetMapping("listarcliente")
	public String home(Model model) {
		List<Cliente> cliente = clienteRepository.findAll();
		model.addAttribute("clientes", cliente);
		return "cliente/listacliente"; 
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoCliente requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "cliente/formulario";
		}
		
		Cliente cliente = requisicao.toCliente();
		clienteRepository.save(cliente);
		
		return "redirect:/cliente/listarcliente";
	}
}
