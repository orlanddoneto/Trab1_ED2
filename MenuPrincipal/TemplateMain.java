package MenuPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import AlgoritmosOrdenacao.Sort;
import Entidade.Cliente;
import GerenciadorCSV.EscritorCSV;
import GerenciadorCSV.LeitorCSV;
import Servicos.BifCompare;
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
			System.out.println("Digite a porcentagem para ordenar as extremidades: ");
			porcentagem = sc.nextDouble();
		}
		
		int numExecucoes = this.numExecucoes();
		int criterio = this.criterio();
		int ordem = this.ordem();
		

		BifCompare cmp = new BifCompare(criterio);

		int numExecucoesAtual = 0; // contador para delimitar até numExecucoes

		long inicioRelogio = System.currentTimeMillis();// tempo Inicial Em Milissegundos
		
		GerenciadorAlgoritmos gerente = new GerenciadorAlgoritmos();
		gerente.setSort(metodo);
		
		while (numExecucoesAtual < numExecucoes) {

			numExecucoesAtual++;
			lista = csv.getLines();
			gerente.ordenarAlgoritmo(cmp, lista, 0, lista.size() - 1, ordem,porcentagem);

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

	// gerencia a execução de determinado algoritmo, com base no valor de método
	// (classe GerenciadorAlgoritmos, no pacote Servicos)
	public abstract void ordenarAlgoritmo(BifCompare cmp, List<Cliente> lista, int ini, int fim, int ordem, double porcentagem);

	// exibe os resultados da ordenação classe Resultados
	public abstract void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes);

}
