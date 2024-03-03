package br.com.ehmf.mywebtestframework.controller;

import br.com.ehmf.mywebtestframework.model.Produto;
import br.com.ehmf.mywebtestframework.model.ProdutoDTO;
import br.com.ehmf.mywebtestframework.service.IService;
import br.com.ehmf.webframework.annotations.WebframeworkBody;
import br.com.ehmf.webframework.annotations.WebframeworkController;
import br.com.ehmf.webframework.annotations.WebframeworkDeleteMethod;
import br.com.ehmf.webframework.annotations.WebframeworkGetMethod;
import br.com.ehmf.webframework.annotations.WebframeworkInject;
import br.com.ehmf.webframework.annotations.WebframeworkPathVariable;
import br.com.ehmf.webframework.annotations.WebframeworkPostMethod;
import br.com.ehmf.webframework.annotations.WebframeworkPutMethod;

@WebframeworkController
public class HelloController {

	@WebframeworkInject
	private IService iService;
	
	@WebframeworkGetMethod("/hello")
	public String returnHelloWorld() {
		return "Return Hello world!!!";
	}	
	
	@WebframeworkGetMethod("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto(1,"Nome1",5432.1,"teste.jpg");
		return p;
	}
	
	@WebframeworkPostMethod("/produto")
	public Produto cadastrarProduto(@WebframeworkBody Produto produtoNovo) {
		System.out.println(produtoNovo);
		return produtoNovo;
	}
	
	@WebframeworkGetMethod("/teste")
	public String teste() {
		return "Testes";
	}
	
	@WebframeworkGetMethod("/injected")
	public String chamadaCustom() {
		return iService.chamadaCustom("Hello injected");
	}
	
	//http://localhost:8080/retornavalor/OI == Retornando o valor de parametro: 22222
	@WebframeworkGetMethod("/retornavalor/{valor}")
	public String retornoValor(@WebframeworkPathVariable Double valor) {
		return "Retornando o valor de parametro: " + valor;
	}

	@WebframeworkDeleteMethod("/produto/{id}")
	public String deletarProduto(@WebframeworkPathVariable Integer id) {
		return iService.deletarProduto(id);
	}

	@WebframeworkPutMethod("/produto/{id}")
	public ProdutoDTO atualizaProduto(
			
			@WebframeworkPathVariable Integer    id, 
			@WebframeworkBody 		  ProdutoDTO updateProduto ) throws Exception {
		
		return iService.atualizaProduto(id, updateProduto);
	
	}
	
}
