package MenuPrincipal;

import java.util.List;
import java.util.Scanner;

import Entidade.Cliente;
import Servicos.BifCompare;
import Servicos.TratarValores;

public class Menu extends TemplateMain{
	
	@Override
	public int metodo() { 
		boolean tratar = false;
		String temp = null;
		
		System.out.printf("\nEscolha o m�todo de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - "
				+ "InsertSort\n(5) - QuickSort\n(6) - MergeSort\n(7) - HeapSort\n\nSua escolha: ");
		
		while (!tratar) {
			temp = sc.nextLine(); //
			tratar = TratarValores.tratarMetodo(temp);
		}
		int metodo = Integer.parseInt(temp);
		return metodo;

	}
	
	@Override
	public int criterio() {
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
	
	@Override
	public int ordem() {
		boolean tratar = false;
		
		String temp = null;
		
		System.out.printf("\nEscolha a ordem da ordena��o:\n(1) - Crescente \n(-1) - Decrescente\n\nSua escolha: ");
		
		while (!tratar) {
			temp = sc.nextLine();
			tratar = TratarValores.tratarOrdem(temp);
			
		}
		int ordem = Integer.parseInt(temp);
		return ordem;

	}

	@Override
	public int numExecucoes() {
		System.out.println("Quantas vezes o algoritmo deve ser executado?");
		String temp = null;
		boolean tratar = false;
		
		while (!tratar) {
			temp = sc.nextLine();
			tratar = TratarValores.tratarNumExecucoes(temp);
			
		}
		int numExecucoes = Integer.parseInt(temp);
		return numExecucoes;
		
	}

	

	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarAlgoritmo(BifCompare cmp, List<Cliente> lista, int ini, int fim, int ordem) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
