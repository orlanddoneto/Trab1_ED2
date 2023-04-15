package Services;

import java.util.function.BiFunction;

import Linhas.Produto;

public class bifCompare implements BiFunction<Produto, Produto, Integer> {

	@Override
	public Integer apply(Produto t, Produto u) {
		int criterio = t.getCriterio();
		if (criterio == 1) {
			return compareInteger(t.getField1(),u.getField1());
		}
		
		if (criterio == 2) {
			return compareDouble(t.getField2(),u.getField2());
		}
		
		if (criterio == 3) {
			return compareString(t.getField3(),u.getField3());
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
