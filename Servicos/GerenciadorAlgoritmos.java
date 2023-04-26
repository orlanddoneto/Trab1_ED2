package Servicos;
import java.util.List;

import AlgoritmosOrdenacao.HeapSort;
import AlgoritmosOrdenacao.InsertSort;
import AlgoritmosOrdenacao.MergeSort;
import AlgoritmosOrdenacao.QuickSort;
import AlgoritmosOrdenacao.SelectSort;
import AlgoritmosOrdenacao.Sort;
import Entidade.Cliente;
import MenuPrincipal.TemplateMain;


public class GerenciadorAlgoritmos extends TemplateMain{
	private long comparacoes;
	private long trocas;
	@Override
	public void gerenciarAlgoritmo(int metodo, BifCompare cmp, List<Cliente> temp, int ordem) {
		
		switch (metodo){
	        case 1:
	           // QM_Sort();
	            break;
	        case 2:
	           // SI_Sort();
	            break;
	        case 3:
	        	Sort select = new SelectSort();
	        	select.ordenar(cmp, temp,0,temp.size(), ordem);
	        	comparacoes = select.getComparacoes();
	        	trocas = select.getTrocas();
	            break;
	        case 4:
	        	Sort insert = new InsertSort();
	        	insert.ordenar(cmp, temp,1,temp.size()-1, ordem);
	        	comparacoes = insert.getComparacoes();
	        	trocas = insert.getTrocas();
	            break;
	        case 5:
	        	Sort quick = new QuickSort();
	        	quick.ordenar(cmp,temp,0,temp.size()-1,ordem);
	        	comparacoes = quick.getComparacoes();
	        	trocas = quick.getTrocas();
	            break;
	        case 6:
	        	Sort merge = new MergeSort();
	        	merge.ordenar(cmp, temp,0,temp.size(), ordem);
	        	comparacoes = merge.getComparacoes();
	        	trocas = merge.getTrocas();
	            break;
	        case 7:
	        	Sort heap = new HeapSort();
	        	heap.ordenar(cmp,temp,0,temp.size()-1,ordem);
	        	comparacoes = heap.getComparacoes();
	        	trocas = heap.getTrocas();
	            break;
        
		}
	}
	
	
	
	
	public long getComparacoes() {
		return comparacoes;
	}




	public long getTrocas() {
		return trocas;
	}




	@Override
	public int metodo() {
		return 0;
	}

	@Override
	public int criterio() {
		return 0;
	}

	@Override
	public int ordem() {
		return 0;
	}

	@Override
	public int numExecucoes() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
