package AlgoritmosOrdenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;


public class QMSort<T> extends Sort<T> {
	private static final int TamLimite_Quick = 10;
	private long comparacoes = 0L;
	private long movimentacoes = 0L;

	@Override
	public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
		if(ini<fim) {
			if(fim-ini+1 <= TamLimite_Quick) {
				QuickSort quicksort = new QuickSort();
				quicksort.ordenar(cmp, list, ini, fim, ordem, porcentagem);
				comparacoes = quicksort.getComparacoes();
				movimentacoes = quicksort.getMovimentacoes();
			}
			else {
				int posMeio = (ini+fim)/2;
				ordenar(cmp,list,ini,posMeio,ordem,porcentagem);
				ordenar(cmp,list,posMeio+1,fim,ordem,porcentagem);
				MergeSort mergesort = new MergeSort();
				mergesort.ordenar(cmp, list, ini, fim, ordem, porcentagem);
				comparacoes = mergesort.getComparacoes();
				movimentacoes = mergesort.getMovimentacoes();
			}
		}
	}

	@Override
	public long getComparacoes() {
		
		return comparacoes;
	}

	@Override
	public long getMovimentacoes() {
		return movimentacoes;
	}

	@Override
	public void ordenar(Comparator<T> cmp, List<T> list) {
		// TODO Auto-generated method stub
		
	}

}

/*
 
 */
	
	
	
	
	
	
	
	
/*
 if (fim - ini + 1 <= TAMANHO_LIMITE_QUICKSORT ) {
	        // Usa o MergeSort para ordenar a lista se o tamanho for menor ou igual ao tamanho máximo
			MergeSort mergeSort = new MergeSort();
	        mergeSort.ordenar(cmp, list, ini, fim, ordem,0);
	        comparacoes = mergeSort.getComparacoes();
	        movimentacoes = mergeSort.getMovimentacoes();
	    } else {
	        // Usa o QuickSort para particionar a lista
	        int pivotIndex = partition(cmp, list, ini, fim, ordem);
	        
	        // Ordena os subvetores recursivamente com o QM-Sort
	        ordenar(cmp, list, ini, pivotIndex - 1, ordem, 0);
	        ordenar(cmp, list, pivotIndex + 1, fim, ordem, 0);
	    }

		
	}
	// função do QuickSort
	private int partition (BiFunction<T,T,Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        T pivot = list.get(fim);
       
        int i = ini - 1;
        
        for (int j = ini; j<fim;j++) {
            comparacoes++;
            if(cmp.apply(list.get(j),pivot)*ordem<0) {
                i++;
                movimentacoes++;
                Collections.swap(list, i, j);
            }
        }
        movimentacoes++;
        Collections.swap(list, i+1, fim);
        return i+1;
    }*/
