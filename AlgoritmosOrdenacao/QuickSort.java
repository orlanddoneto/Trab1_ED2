package AlgoritmosOrdenacao;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class QuickSort implements Sort {
	private long atribuicoes;
	private long comparacoes;
	
	@Override
	public <T> void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        if (ini < fim) {
            int pivot = partition(cmp, list, ini, fim, ordem);
            ordenar(cmp, list, ini, pivot - 1, ordem);
            ordenar(cmp, list, pivot + 1, fim, ordem);
        }
	}
	    
	private <T> int partition (BiFunction<T,T,Integer> cmp, List<T> list, int ini, int fim, int ordem) {
		T pivot = list.get(fim);
		int i = ini - 1;
		for (int j = ini; j<fim;j++) {
			if(cmp.apply(list.get(j),pivot)*ordem<0) {
				i++;
				Collections.swap(list, i, j);
			}
		}
		Collections.swap(list, i+1, fim);
		return i+1;
	}
	
	    

}
