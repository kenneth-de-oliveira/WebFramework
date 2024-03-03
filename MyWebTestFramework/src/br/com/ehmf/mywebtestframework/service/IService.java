package br.com.ehmf.mywebtestframework.service;

import br.com.ehmf.mywebtestframework.model.ProdutoDTO;

public interface IService {
	public String chamadaCustom(String mensagem);
	public ProdutoDTO atualizaProduto(Integer id, ProdutoDTO updateProduto) throws Exception;
	public String deletarProduto(Integer id);
}
