package ecommerce.repository;

import ecommerce.model.ecommerce;

public interface EcommerceRepository {
	
	// CRUD do ecommerce
	
	public void pesquisar(String nome);
	public void listar();
	public void adicionar(ecommerce ecommerce);
	public void atualizar(ecommerce ecommerce);
	public void apagar(String nome);

}
