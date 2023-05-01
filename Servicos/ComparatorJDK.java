package Servicos;

import java.util.Comparator;

import Entidade.Cliente;

public class ComparatorJDK implements Comparator<Cliente>{
	private int criterio;

	public ComparatorJDK(int criterio) {
		this.criterio = criterio;
	}

	@Override
	public int compare(Cliente c1, Cliente c2) {
		
		if(c1.chave(criterio).getClass().equals(String.class)){
			return ((String)c1.chave(criterio)).compareTo((String)c2.chave(criterio));
		}
		
		if(c1.chave(criterio).getClass().equals(Integer.class)){
			return ((Integer)c1.chave(criterio)).compareTo((Integer)c2.chave(criterio));
		}
		
		if(c1.chave(criterio).getClass().equals(Double.class)){
			return ((Double)c1.chave(criterio)).compareTo((Double)c2.chave(criterio));
		}
		return 0;
		
	}
	
	
}
