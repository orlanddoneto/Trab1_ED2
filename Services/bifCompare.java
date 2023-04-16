package Services;

import java.util.function.BiFunction;

import Linhas.Produto;

public class bifCompare implements BiFunction<Produto, Produto, Integer> {

	@Override
	public Integer apply(Produto t, Produto u) {
		if(t.chave().getClass().equals(String.class)){
			return compareString((String)t.chave(),(String)u.chave());
		}
		
		if(t.chave().getClass().equals(Integer.class)){
			return compareInteger((Integer)t.chave(),(Integer)u.chave());
		}
		
		if(t.chave().getClass().equals(Double.class)){
			return compareDouble((Double)t.chave(),(Double)u.chave());
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
