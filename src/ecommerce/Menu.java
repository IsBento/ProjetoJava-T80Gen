package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.produzido;
import ecommerce.controller.EcommerceController;
import ecommerce.model.disco;
import ecommerce.model.ecommerce;

public class Menu {
	
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Menu loja ecommerce - projeto final java
		EcommerceController ecommerce = new EcommerceController();
		
		Scanner leia = new Scanner(System.in);
		int opcao, sku;
		
		// herança: disco e produzido
		String titulo, genero, tipo, disco, produzido, nome;
		
		
		/*
		 *Teste da classe ecommerce
		 (String titulo, String genero, String tipo, int sku)
		 
		ecommerce a1 = new ecommerce("Legião Urbana", "Rock", "Vinil", 1);
		a1.visualizar();
		*/
		
		/*
		 *Teste da classe disco (herança)
		 (String titulo, String genero, String tipo, int sku, String disco)
		 
		disco a1 = new disco("Legião Urbana", "Rock", "Vinil", ecommerce.gerarSku(), "Legião Urbana");
		disco a2 = new disco("Júpiter", "MPB", "CD", ecommerce.gerarSku(), "Silva");
		*/
		ecommerce.adicionar(new disco("Legião Urbana", "Rock", "Vinil", ecommerce.gerarSku(), "Legião Urbana"));
		
		ecommerce.adicionar(new disco("Júpiter", "MPB", "CD", ecommerce.gerarSku(), "Silva"));

		/*
		 *Teste da classe produzido (herança)
		 (String titulo, String genero, String tipo, int sku, String produzido)
		
		produzido p1 = new produzido("Donnie Darko", "Ficção cientifíca", "DVD", ecommerce.gerarSku(), "Richard Kelly");
		produzido p2 = new produzido("Interestelar", "Ficção cientifíca", "DVD", ecommerce.gerarSku(), "Christopher Nolan");
		*/ 
		ecommerce.adicionar(new disco("Donnie Darko", "Ficção cientifíca", "DVD", ecommerce.gerarSku(), "Richard Kelly"));
				
		ecommerce.adicionar(new disco("Interestelar", "Ficção cientifíca", "DVD", ecommerce.gerarSku(), "Christopher Nolan"));
	
		
			
				
		// Entrada e saída de dados, laço condicional e laço de repetição
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   DISC BENTO                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar                            ");
			System.out.println("            2 - Listar                               ");
			System.out.println("            3 - Pesquisar                            ");
			System.out.println("            4 - Atualizar                            ");
			System.out.println("            5 - Apagar                               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite títulos existentes!");
				leia.nextLine();
				opcao=0;
			}
	
			
			
			if (opcao == 0) {
				System.out.println("\nDisc Bento - Onde você disca e adquire seu disco!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Adicionar disco \n\n");
				
				//título
				System.out.println("Digite o título do disco: ");
				titulo =leia.next();
				//gênero
				System.out.println("Digite o gênero: ");
				leia.skip("\\R?");
				genero = leia.nextLine();				
									
				
				//tipo define qual herança é
				System.out.println("Digite o tipo de disco (Vinil, CD ou DVD): ");
				tipo = leia.next();
				
				switch(tipo) {
				case "Vinil" -> {
					System.out.println("Digite quem é o cantor ou a banda: ");
					disco = leia.next();
					ecommerce.adicionar(new disco(titulo, genero, tipo, ecommerce.gerarSku(), disco));
					}
				
				case "CD" -> {
					System.out.println("Digite quem é o cantor ou a banda: ");
					disco = leia.next();
					ecommerce.adicionar(new disco(titulo, genero, tipo, ecommerce.gerarSku(), disco));
					}
				
				case "DVD" -> {
					System.out.println("Digite quem é o diretor: ");
					produzido = leia.next();
					ecommerce.adicionar(new produzido(titulo, genero, tipo, ecommerce.gerarSku(), produzido));
				}
			}
					
				keyPress ();
				break;

				
			case 2:
				System.out.println("Listar todos titulos\n\n");
				ecommerce.listar();
				keyPress();
				
				break;
				
			case 3:
				System.out.println("Pesquisar");
				
				System.out.println("Digite o título: ");
				nome = leia.next();
				
				ecommerce.pesquisar(nome);
				
					
				break;
			
			case 4:
				System.out.println("Atualizar dados do disco\n\n");
				
				System.out.println("Digite o título que quer atualizar: ");
				nome = leia.next();
				
				var buscarTitulos = ecommerce.buscarNaCollection(nome);
				
				if(buscarTitulos != null) {
					
					tipo = buscarTitulos.getTitulo();
					
					leia.nextLine();
					System.out.println("Digite o novo título: ");
					titulo = leia.nextLine();
					System.out.println("Digite o novo gênero: ");
					leia.skip("\\R?");
					genero = leia.nextLine();
					
					System.out.println("Digite o novo tipo: ");
					tipo = leia.nextLine();
					
					switch(tipo) {
					case "Vinil" -> {
						System.out.println("Digite quem é o novo cantor ou a banda: ");
						disco = leia.nextLine();
						ecommerce.atualizar(new disco(titulo, genero, tipo, ecommerce.gerarSku(), disco));
						}
					
					case "CD" -> {
						System.out.println("Digite quem é o novo cantor ou a banda: ");
						disco = leia.nextLine();
						ecommerce.atualizar(new disco(titulo, genero, tipo, ecommerce.gerarSku(), disco));
						}
					
					case "DVD" -> {
						System.out.println("Digite quem é o novo diretor: ");
						produzido = leia.nextLine();
						ecommerce.atualizar(new produzido(titulo, genero, tipo, ecommerce.gerarSku(), produzido));
					}
					default -> {
						System.out.println("Tipo de disco inválido!");
					}
				}
			}else {
				System.out.println("Disco não encontrado!");
			}
				
				
				break;
				
			case 5:
				System.out.println("Apagar disco");
				
				System.out.println("Digite o título: ");
				nome = leia.next();
				
				ecommerce.apagar(nome);
				
				break;
				
			default:
				System.out.println("Opção inválida!!!");
			}

		}
}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto desenvolvido por: Isabella Bento ");
		System.out.println("Generation Brasil - isabellab@generation.org");
		System.out.println("github.com/isbento");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione enter para continuar...");
			System.in.read();
		}catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
