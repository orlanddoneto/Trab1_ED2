package Services;

import java.util.function.BiFunction;

import Entidade.Cliente;

public class BifCompare implements BiFunction<Cliente, Cliente, Integer> {
	
	private int criterio;
	
	
	public BifCompare(int criterio) {
		super();
		this.criterio = criterio;
	}


	@Override
	public Integer apply(Cliente t, Cliente u) {
		if(t.chave(criterio).getClass().equals(String.class)){
			return compareString((String)t.chave(criterio),(String)u.chave(criterio));
		}
		
		if(t.chave(criterio).getClass().equals(Integer.class)){
			return compareInteger((Integer)t.chave(criterio),(Integer)u.chave(criterio));
		}
		
		if(t.chave(criterio).getClass().equals(Double.class)){
			return compareDouble((Double)t.chave(criterio),(Double)u.chave(criterio));
		}
		return null;
	}
	
	
	


	public Integer compareString(String a, String b) {
		return a.compareTo(b);
	}
	
	public Integer compareInteger(Integer a, Integer b) {
		return a.compareTo(b);
	}
	
	public Integer compareDouble (Double a, Double b) {
		return a.compareTo(b);
	}
	
	//a>b = 1 ....  zebra e agua = 1
	//a<b = -1	..... agua e zebra = -1
	//a=b = 0 ....  zebra e zebra = 0
	

}
