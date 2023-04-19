package MenuPrincipal;

import java.util.Scanner;

import Services.TratarValores;

public class Menu {
	
	public static int metodo(Scanner sc) {
		boolean tratar = false;
		int metodo = 0;
		
		System.out.printf("\nEscolha o método de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - "
				+ "InsertSort\n(5) - QuickSort\n(6) - MergeSort\n(7) - HeapSort\n\nSua escolha: ");
		
		while (!tratar) {
			metodo = sc.nextInt();
			tratar = TratarValores.tratarMetodo(metodo);
		}
		return metodo;

	}
	
	public static int criterio(Scanner sc) {
		boolean tratar = false;
		int criterio = 0;
		
		System.out.printf("Escolha o atributo que deseja usar na ordenacao:"
				+ "\n(1) - Valor1 (Integer)\n(2) - Valor2 (Double)\n(3) - Valor3 (String)" +
                "\n\nSua Escolha: ");
		
		while (!tratar) {
			criterio = sc.nextInt();
			tratar = TratarValores.tratarCriterio(criterio);
			
		}
		return criterio;

	}
	
	
	public static int ordem(Scanner sc) {
		boolean tratar = false;
		int ordem = 0;
		
		System.out.printf("\nEscolha a ordem da ordenação:\n(1) - Crescente \n(-1) - Decrescente\n\nSua escolha: ");
		
		while (!tratar) {
			ordem = sc.nextInt();
			tratar = TratarValores.tratarOrdem(ordem);
			
		}
		return ordem;

	}

}
