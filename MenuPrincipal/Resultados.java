package MenuPrincipal;

import java.util.List;

import Entidade.Cliente;
import Servicos.BifCompare;

public class Resultados extends TemplateMain {
	@Override
	public void imprimirResultados(long trocas, long comparacoes, long tempo, int numExecucoes) {
		double tempoMedio = tempoMedio(tempo,numExecucoes);
		
		double trocasMedia = trocasMedia(trocas,numExecucoes);
		double comparacoesMedia = comparacoesMedio(comparacoes,numExecucoes);
		
		System.out.printf("\nO tempo médio de processamento foi: %.3f\n",tempoMedio);
		System.out.printf("O número médio de atribuições foi: %.3f\n",trocasMedia);
		System.out.printf("O número médio de comparações foi: %.3f\n",comparacoesMedia);
	}
	
	private double tempoMedio(long tempo, int cont) {
		double resultado = (double) (tempo/cont);
		return resultado;
	}
	
	private double trocasMedia(long atribuicoes, int cont) {
		double resultado = (double) (atribuicoes/cont);
		return resultado;
	}
	
	private double comparacoesMedio(long comparacoes, int cont) {
		double resultado = (double) (comparacoes/cont);
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
	public void gerenciarAlgoritmo(int metodo, BifCompare cmp, List<Cliente> lista, int ordem) {
		// TODO Auto-generated method stub
		
	}

}
