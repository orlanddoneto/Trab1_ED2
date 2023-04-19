package AlgoritmosOrdenacao;

import java.util.List;
import java.util.function.BiFunction;

public class HeapSort implements Sort{
	@Override
	public  <T> void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        int n = fim - ini +1;

        // Construir o heap máximo
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(cmp, list, n, i, ordem);

        // Extrair um elemento do heap de cada vez
        for (int i = n - 1; i >= 0; i--) {
            // Mover o elemento atual para o final
            T temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            // Chamar max heapify no heap reduzido
            heapify(cmp, list, i, 0, ordem);
        }
    }

    private static <T> void heapify(BiFunction<T, T, Integer> cmp, List<T> list, int n, int i, int ordem) {
        int largest = i; // Inicializar o maior como raiz
        int l = 2 * i + 1; // esquerda = 2 * i + 1
        int r = 2 * i + 2; // direita = 2 * i + 2

        // Se o filho esquerdo é maior que a raiz
        if (l < n && cmp.apply(list.get(l), list.get(largest)) * ordem > 0)
            largest = l;

        // Se o filho direito é maior que o maior até agora
        if (r < n && cmp.apply(list.get(r), list.get(largest)) * ordem > 0)
            largest = r;

        // Se o maior não é raiz
        if (largest != i) {
            T swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);

            // Recursivamente heapify a subárvore afetada
            heapify(cmp, list, n, largest, ordem);
        }
    }
    /*
    public long getAtribuicoes() {
		return atribuicoes;
	}
	
	public long getComparacoes() {
		return comparacoes;
	}
	*/
}
