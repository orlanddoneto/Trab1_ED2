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
	
	protected  Scanner sc = new Scanner(System.in);
	private LeitorCSV csv = new LeitorCSV();
	
	public void templateMain(){
		csv.lerCSV();
		List<Cliente> lista = new ArrayList<>();
		
		int metodo = this.metodo();
		int numExecucoes = this.numExecucoes();
		int criterio = this.criterio();
		int ordem = this.ordem();
		
		BifCompare cmp = new BifCompare(criterio);
		
		int numExecucoesAtual = 0; //contador para delimitar até numExecucoes
		
		long trocas = 0L;
		long comparacoes = 0L;
		
		long inicioRelogio = System.currentTimeMillis();//tempo Inicial Em Milissegundos
		
		GerenciadorAlgoritmos gerente = new GerenciadorAlgoritmos();
		
		while(numExecucoesAtual<numExecucoes) {
			
			numExecucoesAtual++;
			lista = csv.getLines();
			gerente.gerenciarAlgoritmo(metodo, cmp, lista, ordem);
			System.out.println(gerente.getComparacoes());
			
		}
		
		trocas = gerente.getTrocas();
		comparacoes = gerente.getComparacoes();
		
		long fimRelogio = System.currentTimeMillis(); //tempo Final Em Milissegundos
		long tempoProcessamento = fimRelogio - inicioRelogio;
		
		this.imprimirResultados(trocas, comparacoes, tempoProcessamento, numExecucoesAtual);
		EscritorCSV.escreveCSV(lista);
		sc.close();
		
	}
	//exibe menu para receber o valor de método (classe Menu)
	public abstract int metodo(); 
	// exibe menu para receber o valor de critério (classe Menu)
	public abstract int criterio();
	// exibe menu para receber o valor de ordem (classe Menu)
	public abstract int ordem();
	// exibe menu para receber o valor de numExecucoes (classe Menu)
	public abstract int numExecucoes(); 
	// gerencia a execução de determinado algoritmo, com base no valor de método (classe GerenciadorAlgoritmos, no pacote Servicos)
	public abstract void gerenciarAlgoritmo(int metodo, BifCompare cmp,List<Cliente> lista, int ordem);
	//exibe os resultados da ordenação classe Resultados
	public abstract void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes);
	

}
