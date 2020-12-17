package br.com.luiz.mvc.Visual.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.luiz.mvc.Visual.dto.RequisicaoNovoProduto;
import br.com.luiz.mvc.Visual.model.Produto;
import br.com.luiz.mvc.Visual.repository.ProdutoRepository;

@Controller
@RequestMapping("produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository; 
	
	@GetMapping 
	public String formulario(RequisicaoNovoProduto requisicao) {
		return "produto/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoProduto requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "produto/formulario";
		}
		
		Produto produto = requisicao.toProduto();
		produtoRepository.save(produto);
		
		return "redirect:/home";
	}
	
}
