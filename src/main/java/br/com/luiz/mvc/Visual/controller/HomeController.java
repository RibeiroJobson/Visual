package br.com.luiz.mvc.Visual.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// anota para o spring 
@Controller
// anota para toda requisição get em home ser feita nessa class
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String home(Model model) {
	//	List<Pedido> pedidos = pedidoRepository.findAll();
		//model.addAttribute("pedidos", pedidos);
		return "home"; 
	}
		
	

}
