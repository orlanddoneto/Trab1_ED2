package Servicos;

import java.util.Comparator;
import java.util.List;

import Entidade.Cliente;
import MenuPrincipal.Menu;
import MenuPrincipal.Resultados;
import MenuPrincipal.TemplateMain;

public class ExecutarPrograma extends TemplateMain {

	@Override
	public int metodo() {
		Menu menu = new Menu();
		return menu.metodo();
	}

	@Override
	public int criterio() {
		Menu menu = new Menu();
		return menu.criterio();
	}

	@Override
	public int ordem() {
		Menu menu = new Menu();
		return menu.ordem();
	}

	@Override
	public int numExecucoes() {
		Menu menu = new Menu();
		return menu.numExecucoes();
	}

	@Override
	public void ordenarAlgoritmo(BifCompare cmp, List<Cliente> lista,int ini, int fim, int ordem, double porcentagem) {
		GerenciadorAlgoritmos algoritmo = new GerenciadorAlgoritmos();
		algoritmo.ordenarAlgoritmo(cmp, lista, ini, fim, ordem, porcentagem);
		
	}

	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		Resultados resultado = new Resultados();
		resultado.imprimirResultados(trocas, comparacoes, tempo, numExecucoes);
		
	}

	@Override
	public double porcentagem() {
		Menu menu = new Menu();
		return menu.porcentagem();
		
	}

	@Override
	public void ordenarAlgoritmo(ComparatorJDK cmp, List<Cliente> list) {
		GerenciadorAlgoritmos algoritmo = new GerenciadorAlgoritmos();
		algoritmo.ordenarAlgoritmo(cmp,list);
		
	}

}
