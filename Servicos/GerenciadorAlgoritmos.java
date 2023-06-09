package Servicos;
import java.util.ArrayList;
import java.util.List;

import AlgoritmosOrdenacao.ArrayJDK;
import AlgoritmosOrdenacao.CollectionsJDK;
import AlgoritmosOrdenacao.HeapSort;
import AlgoritmosOrdenacao.InsertSort;
import AlgoritmosOrdenacao.MergeSort;
import AlgoritmosOrdenacao.QMSort;
import AlgoritmosOrdenacao.QuickSort;
import AlgoritmosOrdenacao.SISort;
import AlgoritmosOrdenacao.SelectSort;
import AlgoritmosOrdenacao.Sort;
import Entidade.Cliente;
import MenuPrincipal.TemplateMain;


public class GerenciadorAlgoritmos extends TemplateMain{
	private Sort sort;
	//fun��o que faz o strategy
	
	public void setSort(int metodo) {
		List<Sort> metodos = new ArrayList<>();
		metodos.add(new QMSort());
		metodos.add(new SISort());
		metodos.add(new SelectSort());
		metodos.add(new InsertSort());
		metodos.add(new QuickSort());
		metodos.add(new MergeSort());
		metodos.add(new HeapSort());
		metodos.add(new CollectionsJDK());
		metodos.add(new ArrayJDK());
		this.sort = metodos.get(metodo-1);
	}
	
	public Sort getSort() {
		return sort;
	}
	
	@Override
	public void ordenarAlgoritmo(BifCompare cmp, List<Cliente> temp, int ini, int fim, int ordem, double porcentagem) {
		
		sort.ordenar(cmp, temp, ini, fim, ordem, porcentagem);
		
	}
	
	@Override
	public void ordenarAlgoritmo(ComparatorJDK cmp, List<Cliente> list) {
		sort.ordenar(cmp, list);
		
	}

	@Override
	public int metodo() {
		return 0;
	}

	@Override
	public int criterio() {
		return 0;
	}

	@Override
	public int ordem() {
		return 0;
	}

	@Override
	public int numExecucoes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double porcentagem() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

	
	
}
