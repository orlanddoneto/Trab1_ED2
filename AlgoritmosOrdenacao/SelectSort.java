package AlgoritmosOrdenacao;

import java.util.List;
import java.util.function.BiFunction;

public class SelectSort implements Sort {
    private long atribuicoes = 0L;
    private long comparacoes = 0L;


    @Override
    public <T> void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        for (int i = ini; i<fim;i++) {
            int menor = i; // ou Maior
            atribuicoes++;
            T temp = list.get(i);
            atribuicoes++;
            for (int j = i+1; j<list.size();j++) {
                comparacoes++;
                if (cmp.apply(list.get(j), list.get(menor))*ordem < 0) {
                    menor = j;
                    atribuicoes++;
                }
            }
            list.set(i, list.get(menor));
            list.set(menor, temp);
        }
    }


    public long getAtribuicoes() {
        return atribuicoes;
    }

    public long getComparacoes() {
    	return comparacoes;
    }


}
