package Servicos;

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
	public void gerenciarAlgoritmo(int metodo, BifCompare cmp, List<Cliente> lista, int ordem) {
		GerenciadorAlgoritmos algoritmo = new GerenciadorAlgoritmos();
		algoritmo.gerenciarAlgoritmo(metodo, cmp, lista, ordem);
		
	}

	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		Resultados resultado = new Resultados();
		resultado.imprimirResultados(trocas, comparacoes, tempo, numExecucoes);
		
	}

}