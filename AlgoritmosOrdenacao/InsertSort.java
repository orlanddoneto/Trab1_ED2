package AlgoritmosOrdenacao;

import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class InsertSort<T> extends Sort<T>{
    

	private static long atribuicoes = 0L;
    private static long comparacoes = 0L;

	@Override
    public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        for (int i=ini; i<=fim; i++) {
            T temp = list.get(i);
            atribuicoes++;
            int j = i-1;
            atribuicoes++;
            comparacoes++;
            while (j >= 0 && cmp.apply(list.get(j), temp)*ordem > 0) {
            	comparacoes++;
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, temp);
        }
    }

	@Override
    public long getTrocas() {
        return atribuicoes;
    }

	@Override
	public long getComparacoes() {
		return comparacoes;
	}
}
