package MenuPrincipal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import AlgoritmosOrdenacao.CollectionsJDK;
import Entidade.Cliente;
import GerenciadorCSV.EscritorCSV;
import GerenciadorCSV.LeitorCSV;
import Servicos.BifCompare;
import Servicos.ComparatorJDK;
import Servicos.GerenciadorAlgoritmos;

public abstract class TemplateMain {

	protected Scanner sc = new Scanner(System.in);
	private LeitorCSV csv = new LeitorCSV();

	public void templateMain() {
		csv.lerCSV();
		List<Cliente> lista = new ArrayList<>();

		int metodo = this.metodo();
		double porcentagem = 0;
		
		if (metodo == 2) {
			porcentagem = this.porcentagem();
		}
		
		int numExecucoes = this.numExecucoes();
		int criterio = this.criterio();
		
		int ordem = this.ordem();
		
		BifCompare cmp = new BifCompare(criterio);
		ComparatorJDK cmp2 = new ComparatorJDK(criterio);
		
		int numExecucoesAtual = 0; // contador para delimitar até numExecucoes

		long inicioRelogio = System.currentTimeMillis();// tempo Inicial Em Milissegundos
		
		GerenciadorAlgoritmos gerente = new GerenciadorAlgoritmos();
		gerente.setSort(metodo);
		
		while (numExecucoesAtual < numExecucoes) {
			numExecucoesAtual++;
			lista = csv.getLines();
			
			
			if(metodo==8 || metodo==9) { //Teste para Collections
				gerente.ordenarAlgoritmo(cmp2, lista);
			}
			else {
				gerente.ordenarAlgoritmo(cmp, lista, 0, lista.size() - 1, ordem,porcentagem);
			}
			
			
			

		}

		long movimentacoes = gerente.getSort().getMovimentacoes();
		long comparacoes = gerente.getSort().getComparacoes();

		long fimRelogio = System.currentTimeMillis(); // tempo Final Em Milissegundos
		long tempoProcessamento = fimRelogio - inicioRelogio;
		this.imprimirResultados(movimentacoes, comparacoes, tempoProcessamento, numExecucoesAtual);
		EscritorCSV.escreveCSV(lista);
		sc.close();

	}

	// exibe menu para receber o valor de método (classe Menu)
	public abstract int metodo();

	// exibe menu para receber o valor de critério (classe Menu)
	public abstract int criterio();

	// exibe menu para receber o valor de ordem (classe Menu)
	public abstract int ordem();

	// exibe menu para receber o valor de numExecucoes (classe Menu)
	public abstract int numExecucoes();
	
	// exibe menu para receber o valor de porcentagem (classe Menu)
	public abstract double porcentagem();

	// gerencia a execução de determinado algoritmo, com base no valor de método
	// (classe GerenciadorAlgoritmos, no pacote Servicos)
	public abstract void ordenarAlgoritmo(BifCompare cmp, List<Cliente> lista, int ini, int fim, int ordem, double porcentagem);
	
	public abstract void ordenarAlgoritmo(ComparatorJDK cmp, List<Cliente> list);

	// exibe os resultados da ordenação classe Resultados
	public abstract void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes);

}
