package AlgoritmosOrdenacao;

import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class HeapSort<T> extends Sort<T>{
    
	private static long movimentacoes = 0L;
    private static long comparacoes = 0L;
    
	@Override
    public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
        int n = fim - ini+1;

        // Construir o heap máximo - equivale ao buildMaxHeap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(cmp, list, n, i, ordem);

        // Extrair um elemento do heap de cada vez - parte que é responsável por ordenar
        for (int i = n - 1; i >= 0; i--) {
            // Mover o elemento atual para o final
            T temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);
            movimentacoes++;
            // Chamar max heapify no heap reduzido - uma vez que a estrutura do heap foi desfeita com a troca
            heapify(cmp, list, i, 0, ordem);
        }
    }

    private static <T> void heapify(BiFunction<T, T, Integer> cmp, List<T> list, int n, int i, int ordem) {
        int largest = i; // Inicializar o maior como raiz
        int l = 2 * i + 1; // esquerda = 2 * i + 1
        int r = 2 * i + 2; // direita = 2 * i + 2

        // Se o filho esquerdo é maior que a raiz
        comparacoes++;
        if (l < n && cmp.apply(list.get(l), list.get(largest)) * ordem > 0)
            largest = l;

        // Se o filho direito é maior que o maior até agora
        comparacoes++;
        if (r < n && cmp.apply(list.get(r), list.get(largest)) * ordem > 0)
            largest = r;

        // Se o maior não é raiz
        comparacoes++;
        if (largest != i) {
            T swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);
            movimentacoes++;
            // Recursivamente heapify a subarvore afetada
            heapify(cmp, list, n, largest, ordem);
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
