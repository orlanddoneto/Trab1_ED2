package MenuPrincipal;

import java.util.Scanner;

import Servicos.TratarValores;

public class Menu {
	
	public static int metodo(Scanner sc) { 
		boolean tratar = false;
		String temp = null;
		
		System.out.printf("\nEscolha o método de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - "
				+ "InsertSort\n(5) - QuickSort\n(6) - MergeSort\n(7) - HeapSort\n\nSua escolha: ");
		
		while (!tratar) {
			temp = sc.nextLine(); //
			tratar = TratarValores.tratarMetodo(temp);
		}
		int metodo = Integer.parseInt(temp);
		return metodo;

	}
	
	public static int criterio(Scanner sc) {
		boolean tratar = false;
		String temp = null;

		System.out.printf("Escolha o atributo que deseja usar na ordenacao:"
				+ "\n(1) - Valor1 (Integer)\n(2) - Valor2 (Double)\n(3) - Valor3 (String)" +
                "\n\nSua Escolha: ");
		
		while (!tratar) {
			temp = sc.nextLine();
			tratar = TratarValores.tratarCriterio(temp);
		}
		int criterio = Integer.parseInt(temp);
		return criterio;

	}
	
	
	public static int ordem(Scanner sc) {
		boolean tratar = false;
		
		String temp = null;
		
		System.out.printf("\nEscolha a ordem da ordenação:\n(1) - Crescente \n(-1) - Decrescente\n\nSua escolha: ");
		
		while (!tratar) {
			temp = sc.nextLine();
			tratar = TratarValores.tratarOrdem(temp);
			
		}
		int ordem = Integer.parseInt(temp);
		return ordem;

	}

}
