package Entidade;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer field1;
    private Double field2;
    private String field3;

    // construtor da classe CsvLine
    public Cliente(Integer field1, Double field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        // ...
    }

    public Integer getField1() {
        return field1;
    }

    public Double getField2() {
        return field2;
    }
    
    public String getField3() {
        return field3;
    }
    
    
    public Object chave(int criterio) {
    	List<Object> list = new ArrayList<>();
    	list.add(this.getField1());
    	list.add(this.getField2());
    	list.add(this.getField3());
    	
		return list.get(criterio-1);
    	
    }
    


}
