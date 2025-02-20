package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu loja ecommerce - projeto final java
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
			System.out.println("            3 - Pesquisar  		                     ");
			System.out.println("            4 - Atualizar  		                     ");
			System.out.println("            5 - Apagar                               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nDisc Bento - Onde você disca e reserva seu disco!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Adicionar");
				
				break;
				
			case 2:
				System.out.println("Listar");
				
				break;
				
			case 3:
				System.out.println("Pesquisar");
				
				break;
			
			case 4:
				System.out.println("Atualizar");
				
				break;
				
			case 5:
				System.out.println("Apagar");
				
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
}