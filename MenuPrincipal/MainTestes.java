package MenuPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import AlgoritmosOrdenacao.HeapSort;
import AlgoritmosOrdenacao.InsertSort;
import AlgoritmosOrdenacao.MergeSort;
import AlgoritmosOrdenacao.QuickSort;
import AlgoritmosOrdenacao.SelectSort;
import Entidade.Cliente;
import GerenciadorCSV.LeitorCSV;
import Servicos.BifCompare;
import Servicos.Gerenciador;

public class MainTestes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeitorCSV csv = new LeitorCSV();
        csv.lerCSV();
        
       
		int metodo = Menu.metodo(sc);
		int criterio = Menu.criterio(sc);
		int ordem = Menu.ordem(sc);
		
		System.out.println("Quantas vezes o algoritmo deve ser executado?");
		int numExecucoes = sc.nextInt();
		
		int cont = 0;
		Math.abs(numExecucoes);
		long inicioRelogio = System.currentTimeMillis();
		
		long comparacoes = 0L;
        long atribuicoes = 0L;
        
        Gerenciador gerenciador = new Gerenciador();
        BifCompare cmp = new BifCompare(criterio);
		while(cont<numExecucoes) {
	        cont++;
	        List<Cliente> temp = new ArrayList<>(csv.getLines());
	        
	        switch (metodo){
	            case 1:
	               // QM_Sort();
	                break;
	            case 2:
	               // SI_Sort();
	                break;
	            case 3:
	                SelectSort selectSort = gerenciador.selectSort();
	                selectSort.ordenar(cmp, temp,0,temp.size(), ordem);
	                comparacoes+=selectSort.getComparacoes();
	                atribuicoes+=selectSort.getAtribuicoes();
	                break;
	            case 4:
	                InsertSort insertSort = gerenciador.insertSort();
	                insertSort.ordenar(cmp, temp,1,temp.size()-1, ordem);
	                comparacoes+=insertSort.getComparacoes();
	                atribuicoes+=insertSort.getAtribuicoes();
	                break;
	            case 5:
	                QuickSort quickSort = gerenciador.quickSort();
	                quickSort.ordenar(cmp, temp,0,temp.size()-1, ordem);
	                comparacoes+=quickSort.getComparacoes();
	                atribuicoes+=quickSort.getAtribuicoes();
	                break;
	            case 6:
	            	MergeSort mergeSort = gerenciador.mergeSort();
	                mergeSort.ordenar(cmp, temp,0,temp.size(), ordem);
	                comparacoes+=mergeSort.getComparacoes();
	                atribuicoes+=mergeSort.getAtribuicoes();
	                break;
	            case 7:
	                HeapSort heapSort = gerenciador.heapSort();
	                heapSort.ordenar(cmp, temp,0,temp.size()-1, ordem);
	                comparacoes+=heapSort.getComparacoes();
	                atribuicoes+=heapSort.getAtribuicoes();
	                break; 
	        }
	       
		}
		long fimRelogio = System.currentTimeMillis();
		long tempoProcessamento = (fimRelogio - inicioRelogio);
		double tempoMedio = tempoMedio(tempoProcessamento,cont);
		
		double atribuicoesMedia = atribuicoesMedio(atribuicoes,cont);
		double comparacoesMedia = comparacoesMedio(comparacoes,cont);
		
		System.out.printf("\nO tempo médio de processamento foi: %.3f\n",tempoMedio);
		System.out.printf("O número médio de atribuições foi: %.3f\n",atribuicoesMedia);
		System.out.printf("O número médio de comparações foi: %.3f\n",comparacoesMedia);		

	}
	
	private static double tempoMedio(long tempo, int cont) {
		double resultado = (double) (tempo/cont);
		return resultado;
	}
	
	private static double atribuicoesMedio(long atribuicoes, int cont) {
		double resultado = (double) (atribuicoes/cont);
		return resultado;
	}
	
	private static double comparacoesMedio(long comparacoes, int cont) {
		double resultado = (double) (comparacoes/cont);
		return resultado;
	}
	
	

}
