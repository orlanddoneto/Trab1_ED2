package MenuPrincipal;

import java.util.Comparator;
import java.util.List;

import Entidade.Cliente;
import Servicos.BifCompare;
import Servicos.ComparatorJDK;

public class Resultados extends TemplateMain {
	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		double tempoMedio = tempoMedio(tempo,numExecucoes);
		
		double trocasMedia = trocasMedia(trocas,numExecucoes);
		double comparacoesMedia = comparacoesMedio(comparacoes,numExecucoes);
		
		System.out.printf("\nO tempo médio de processamento, em milissegundos, foi: %.3f\n",tempoMedio);
		System.out.printf("O número médio de movimentações foi: %.3f\n",trocasMedia);
		System.out.printf("O número médio de comparações foi: %.3f\n",comparacoesMedia);
	}
	
	private double tempoMedio(long tempo, int cont) {
		double resultado =  ((double)tempo/(double)cont);
		return resultado;
	}
	
	private double trocasMedia(long atribuicoes, int cont) {
		double resultado =  ((double)atribuicoes/(double)cont);
		return resultado;
	}
	
	private double comparacoesMedio(long comparacoes, int cont) {
		double resultado = ((double)comparacoes/(double)cont);
		return resultado;
	}
	
	
	
	
	@Override
	public int metodo() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int criterio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int ordem() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int numExecucoes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ordenarAlgoritmo(BifCompare cmp, List<Cliente> lista, int ini, int fim, int ordem, double porcentagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double porcentagem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ordenarAlgoritmo(ComparatorJDK cmp, List<Cliente> list) {
		// TODO Auto-generated method stub
		
	}
	
	
}
