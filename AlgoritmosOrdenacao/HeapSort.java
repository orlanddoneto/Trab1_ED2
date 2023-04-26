package AlgoritmosOrdenacao;

import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class HeapSort<T> extends Sort<T>{
    
	private static long atribuicoes = 0L;
    private static long comparacoes = 0L;
    
	@Override
    public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        int n = fim - ini+1;
        atribuicoes++;

        // Construir o heap m�ximo - equivale ao buildMaxHeap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(cmp, list, n, i, ordem);

        // Extrair um elemento do heap de cada vez - parte que � respons�vel por ordenar
        for (int i = n - 1; i >= 0; i--) {
            // Mover o elemento atual para o final
            T temp = list.get(0);
            atribuicoes++;
            list.set(0, list.get(i));
            list.set(i, temp);

            // Chamar max heapify no heap reduzido - uma vez que a estrutura do heap foi desfeita com a troca
            heapify(cmp, list, i, 0, ordem);
        }
    }

    private static <T> void heapify(BiFunction<T, T, Integer> cmp, List<T> list, int n, int i, int ordem) {
        int largest = i; // Inicializar o maior como raiz
        atribuicoes++;
        int l = 2 * i + 1; // esquerda = 2 * i + 1
        atribuicoes++;
        int r = 2 * i + 2; // direita = 2 * i + 2
        atribuicoes++;

        // Se o filho esquerdo � maior que a raiz
        comparacoes++;
        if (l < n && cmp.apply(list.get(l), list.get(largest)) * ordem > 0)
            largest = l;
            atribuicoes++;

        // Se o filho direito � maior que o maior at� agora
        comparacoes++;
        if (r < n && cmp.apply(list.get(r), list.get(largest)) * ordem > 0)
            largest = r;
            atribuicoes++;

        // Se o maior n�o � raiz
        comparacoes++;
        if (largest != i) {
            T swap = list.get(i);
            atribuicoes++;
            list.set(i, list.get(largest));
            list.set(largest, swap);

            // Recursivamente heapify a subarvore afetada
            heapify(cmp, list, n, largest, ordem);
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
