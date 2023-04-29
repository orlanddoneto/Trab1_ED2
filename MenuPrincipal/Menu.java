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
		
		System.out.printf("\nEscolha o método de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - "
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

		System.out.printf("\nEscolha o atributo que deseja usar na ordenacao:"
				+ "\n(1) - IDFatura - (Integer)\n(2) - IDCliente - (Integer)\n(3) - Sexo - (String)\n(4) - Idade - (Integer)"
				+ "\n(5) - Categoria - (String)\n(6) - Quantidade - (Integer)\n(7) - Preço - (Double)\n(8) - Forma de pagamento - (String)"
				+ "\n(9) - Shopping - (String)"+
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
		
		System.out.printf("\nEscolha a ordem da ordenação:\n(1) - Crescente \n(-1) - Decrescente\n\nSua escolha: ");
		
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
	
	public double porcentagem() {
		System.out.println("Digite a porcentagem para ordenar as extremidades: ");
		String temp = null;
		boolean tratar = false;
		
		while (!tratar) {
			temp = sc.nextLine();
			tratar = TratarValores.tratarPorcentagem(temp);
		}
		
		double porcentagem = Double.parseDouble(temp);
		return porcentagem;
		
	}

	

	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarAlgoritmo(BifCompare cmp, List<Cliente> lista, int ini, int fim, int ordem, double porcentagem) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
