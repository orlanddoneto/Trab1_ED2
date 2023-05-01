package AlgoritmosOrdenacao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;

public class ArrayJDK<T> extends Sort<T> {

	@Override
	public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenar(Comparator<T> cmp, List<T> list) {
		T[] array = (T[]) new Object[list.size()]; // Cria uma matriz de objetos
		list.toArray(array); // Preenche a matriz com os elementos da lista
		Arrays.sort(array, cmp);
		list.clear(); // Limpa a lista original
		list.addAll(Arrays.asList(array)); // Adiciona os elementos ordenados de volta à lista
	}

	@Override
	public long getComparacoes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getMovimentacoes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
