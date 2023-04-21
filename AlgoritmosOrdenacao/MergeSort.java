package AlgoritmosOrdenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class MergeSort implements Sort {
    private static long atribuicoes = 0L;
    private static long comparacoes = 0L;
    @Override
    public <T> void ordenar(BiFunction<T, T, Integer> cmp, List <T>list,int ini,int fim, int ordem) {
        comparacoes++;
        if(fim<2) {
            return;
        }
        List<T> arrayLeft = new ArrayList<T>();
        List<T> arrayRight = new ArrayList<T>();
        int middle = fim / 2;
        atribuicoes++;

        for (int i = ini; i < middle; i++) { // aqui vai adicionar os valores no array da esquerda
            arrayLeft.add(list.get(i));
        }

        for (int i = middle; i <fim; i++) { // aqui vai adicionar os valores no array da direita
            arrayRight.add(list.get(i));
        }

        ordenar(cmp,arrayLeft,ini,arrayLeft.size(), ordem);
        ordenar(cmp,arrayRight,ini,arrayRight.size(),ordem);
        merge(cmp,arrayLeft,arrayRight,list,ordem);

    }

    private static <T> void merge(BiFunction<T, T, Integer> cmp,List<T> arrayLeft,List<T> arrayRight, List <T>list,int ordem ) {
        int leftLength = arrayLeft.size();
        int rightLength = arrayRight.size();
        int i = 0, j = 0, k = 0;
        atribuicoes+=5;

        while (i < leftLength && j < rightLength) {
            int comparador = cmp.apply(arrayLeft.get(i), arrayRight.get(j));
            atribuicoes++;
            comparacoes++;
            if (comparador*ordem >= 0) {
                list.set(k, arrayRight.get(j));
                k++;
                j++;
            } else {
                list.set(k, arrayLeft.get(i));
                k++;
                i++;
            }
        }
        comparacoes++;
        while (i < leftLength) {
        	comparacoes++;
            list.set(k, arrayLeft.get(i));
            k++;
            i++;

        }
        comparacoes++;
        while (j < rightLength) {
        	comparacoes++;
            list.set(k, arrayRight.get(j));
            k++;
            j++;
        }
    }

    public long getAtribuicoes() {
		return atribuicoes;
	}

	public long getComparacoes() {
		return comparacoes;
	}
}
