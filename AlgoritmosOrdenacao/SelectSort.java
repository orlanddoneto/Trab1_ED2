package AlgoritmosOrdenacao;

import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class SelectSort<T> extends Sort<T> {

	private static long movimentacoes = 0L;
    private static long comparacoes = 0L;

    @Override
    public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
        for (int i = ini; i<=fim;i++) {
            int menor = i; // ou Maior
            T temp = list.get(i);
            for (int j = i+1; j<list.size();j++) {
                comparacoes++;
                if (cmp.apply(list.get(j), list.get(menor))*ordem < 0) {
                    menor = j;
                }
            }
            movimentacoes++;
            list.set(i, list.get(menor));
            list.set(menor, temp);
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
    
    


}
