package AlgoritmosOrdenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class CollectionsJDK <T> extends Sort<T>{
	@Override
	public void ordenar(Comparator<T> cmp, List<T> list) {
		
		Collections.sort(list, cmp);
	}

	@Override
	public void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem, double porcentagem) {
		// TODO Auto-generated method stub
		
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
