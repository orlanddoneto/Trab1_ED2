package Entidade;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer idFatura;
    private Integer idCliente;
    private String sexo;
    private Integer idade;
    private String categoria;
    private Integer quantidade;
    private Double preco;
    private String formaPagamento;
    private String shopping;
    
    // construtor da classe CsvLine

    public Cliente(Integer idFatura, Integer idCliente, String sexo, Integer idade, String categoria,
			Integer quantidade, Double preco, String formaPagamento, String shopping) {
    	
		this.idFatura = idFatura;
		this.idCliente = idCliente;
		this.sexo = sexo;
		this.idade = idade;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.preco = preco;
		this.formaPagamento = formaPagamento;
		this.shopping = shopping;
	}

	
    
    
    public Object chave(int criterio) {
    	List<Object> list = new ArrayList<>();
    	list.add(idFatura);
    	list.add(idCliente);
    	list.add(sexo);
    	list.add(idade);
    	list.add(categoria);
    	list.add(quantidade);
    	list.add(preco);
    	list.add(formaPagamento);
    	list.add(shopping);
    	
		return list.get(criterio-1);
    	
    }
    
   
    


}
