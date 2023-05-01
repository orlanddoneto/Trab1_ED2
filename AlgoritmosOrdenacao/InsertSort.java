package AlgoritmosOrdenacao;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class InsertSort<T> extends Sort<T>{
    

	private static long movimentacoes = 0L;
    private static long comparacoes = 0L;

	@Override
    public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
		ini++;
        for (int i=ini; i<=fim; i++) {
            T temp = list.get(i);
            int j = i-1;
            comparacoes++;
            while (j >= 0 && cmp.apply(list.get(j), temp)*ordem > 0) {
            	comparacoes++;
            	movimentacoes++;
                list.set(j+1, list.get(j));
                j--;
            }
            movimentacoes++;
            list.set(j+1, temp);
        }
    }

	@Override
    public long getMovimentacoes() {
        return movimentacoes;
    }

	@Override
	public long getComparacoes() {
		return comparacoes;
	}

	@Override
	public void ordenar(Comparator<T> cmp, List<T> list) {
		// TODO Auto-generated method stub
		
	}
}
