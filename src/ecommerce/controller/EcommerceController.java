package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.ecommerce;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository{

	private ArrayList<ecommerce> listaTitulos = new ArrayList<ecommerce>();
	int sku = 0;
	
	
	
	@Override
	public void pesquisar(String nome) {
		var ecommerce = buscarNaCollection(nome);
		
		if (ecommerce != null)
			ecommerce.visualizar();
		else
			System.out.println("\nO título " + nome + " não foi encontrado!");
	}
		
	@Override
	public void listar() {
		for (var ecommerce : listaTitulos) {
			ecommerce.visualizar();
		}
		
	}

	@Override
	public void adicionar(ecommerce ecommerce) {
		listaTitulos.add(ecommerce);
		System.out.println("\nO disco: " + ecommerce.getSku() + " foi criado com sucesso!");
		
	}

	@Override
	public void atualizar(ecommerce ecommerce) {
		var buscarTitulos = buscarNaCollection(ecommerce.getTitulo());
		
		if (buscarTitulos != null) {
			listaTitulos.set(listaTitulos.indexOf(buscarTitulos), ecommerce);
			System.out.println("\nO título: " + ecommerce.getTitulo() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO título: " + ecommerce.getTitulo() + " não foi encontrado!");
		}
		

	@Override
	public void apagar(String nome) {
		var ecommerce = buscarNaCollection(nome);
		
		if (ecommerce != null) {
			if (listaTitulos.remove (ecommerce) == true);
				System.out.println("\nO título: " + ecommerce.getTitulo() + " foi deletada com sucesso!");
		} else
			System.out.println("\nO título: " + ecommerce.getTitulo() + " não foi encontrado!");
		}
	
	public int gerarSku() {
	return ++ sku;

	}
	
	public ecommerce buscarNaCollection (String nome) {
		for (var ecommerce : listaTitulos) {
			return ecommerce;
		}
	
	
	return null;

	}
	}
