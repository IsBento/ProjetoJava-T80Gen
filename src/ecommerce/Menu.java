package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu loja ecommerce - projeto final java
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   DISC BENTO                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Discos                               ");
			System.out.println("            2 - Acessórios                           ");
			System.out.println("            3 - Gênero                               ");
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
				System.out.println("Discos");
				
				break;
				
			case 2:
				System.out.println("Acessórios");
				
				break;
				
			case 3:
				System.out.println("Gênero");
				
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