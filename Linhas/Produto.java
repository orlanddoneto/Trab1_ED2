package Linhas;

public class Produto {
	private Integer criterio;
    private Integer field1;
    private Double field2;
    private String field3;

    // construtor da classe CsvLine
    public Produto(Integer field1, Double field2, String field3,Integer criterio) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.criterio = criterio;
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
    
    public Integer getCriterio() {
        return criterio;
    }
    


}
