package AlgoritmosOrdenacao;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class SISort<T> extends Sort<T> {
	private static long movimentacoes = 0L;
    private static long comparacoes = 0L;


	@Override
	public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
		int posicaoPorcentagem = (int) (fim * (porcentagem/100));
		
		// select pro inicio
		for (int i = ini; i<=posicaoPorcentagem-1;i++) {
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
		//select Pro final
		int ordemTemp = ordem*(-1);
		for (int i =fim ;i>=(fim-posicaoPorcentagem-1);i--) {
            int menor = i; // ou Maior
            T temp = list.get(i);
            for (int j = i-1; j>=ini;j--) {
            	comparacoes++;
                if (cmp.apply(list.get(j), list.get(menor))*ordemTemp < 0) {
                    menor = j;
                }
            }
            movimentacoes++;
            list.set(i, list.get(menor));
            list.set(menor, temp);
        }
		
		///Insert pra os valores intermediários
		for (int i=posicaoPorcentagem+1; i<=(fim-posicaoPorcentagem); i++) {
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
	public long getComparacoes() {
		// TODO Auto-generated method stub
		return comparacoes;
	}

	@Override
	public long getMovimentacoes() {
		// TODO Auto-generated method stub
		return movimentacoes;
	}

	@Override
	public void ordenar(Comparator<T> cmp, List<T> list) {
		// TODO Auto-generated method stub
		
	}

}
