package br.com.ehmf.mywebtestframework.service;

import br.com.ehmf.mywebtestframework.model.Produto;
import br.com.ehmf.mywebtestframework.model.ProdutoDTO;
import br.com.ehmf.webframework.annotations.WebframeworkService;
import br.com.ehmf.webframework.util.WebFrameworkLogger;

@WebframeworkService
public class ServiceImplementation implements IService {

	@Override
	public String chamadaCustom(String mensagem) {
		return "Teste chamada servico: " + mensagem;
	}

	@Override
	public ProdutoDTO atualizaProduto(Integer id, ProdutoDTO updateProduto) throws Exception {
		
		// produto recuperado da base de dados
		Produto p = new Produto(1,"Nome1",5432.1,"teste.jpg");
		ProdutoDTO produtoAtualizado = new ProdutoDTO();
		
		
		// verificando se existe produto
		if ( p.getId() == id ) {
		
			// atualiza produto
			produtoAtualizado.setId(p.getId());
			produtoAtualizado.setNome(updateProduto.getNome());
			produtoAtualizado.setValor(updateProduto.getValor());
			produtoAtualizado.setLinkFoto(updateProduto.getLinkFoto());
			
		} else {
			
			WebFrameworkLogger.log("HelloController", "produto ID: " + id + " inexistente!");	
			throw new Exception("produto ID: " + id + " inexistente!");
			
		}
		
		return produtoAtualizado;
	}

	@Override
	public String deletarProduto(Integer id) {
		return "Produto deletado com sucesso, ID : " + id;
	}

}
