package AlgoritmosOrdenacao;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class QuickSort<T> extends Sort<T> {

	private static long movimentacoes = 0L;
    private static long comparacoes = 0L;

    @Override
    public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
        comparacoes++;
        if (ini < fim) {
            int pivot = partition(cmp, list, ini, fim, ordem);
            
            ordenar(cmp, list, ini, pivot - 1, ordem, porcentagem);
            ordenar(cmp, list, pivot + 1, fim, ordem, porcentagem);
        }
    }

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
    }

    @Override
    public long getMovimentacoes() {
        return movimentacoes;
    }

	@Override
	public long getComparacoes() {
		return comparacoes;
	}

}
