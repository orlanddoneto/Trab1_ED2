package GerenciadorCSV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import AlgoritmosOrdenacao.Sort;
import Entidade.Cliente;

public class LeitorCSV {

    private BufferedReader br = null;
    private String line = "";
    private String cvsSplitBy = ",";
    private List<Cliente> lines = new ArrayList<>();
    private String csvFile = "C:\\Users\\Cliente\\eclipse-workspace\\Job1_ED2\\src\\GerenciadorCSV\\customer_shopping_data.csv";
    

    public List<Cliente> getLines() {
        return lines;
    }


    public void lerCSV(){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int cont = 0;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) { //  (&& cont<5) aqui que digo quantos elementos eu vou querer, caso eu queira um teto
                
            	String[] data = line.split(cvsSplitBy);
                
                cont++;
                if (cont==1){
                    continue;
                }
                else
                {
                	//Faz o pré-processamento, removendo campos do tipo "I13774" e "C309420"
                    data = PreProcessamento.trataLinha(data);
                    
                    Cliente produto = criaCliente(data);
                    lines.add(produto);
                }
              

            }
        }
        catch (IOException e) {
            System.out.println("Falha na leitura do CSV.");
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    
    private Cliente criaCliente(String[]data) {
    	Integer idFatura = Integer.parseInt(data[0]);
        Integer idCliente = Integer.parseInt(data[1]);
        String sexo = data[2];
        Integer idade = Integer.parseInt(data[3]);
        String categoria = data[4];
        Integer quantidade = Integer.parseInt(data[5]);
        Double preco = Double.parseDouble(data[6]);
        String formaPagamento = data[7];
        String shopping = data[9];
    	return new Cliente(idFatura,idCliente,sexo,idade,categoria,quantidade,preco,formaPagamento,shopping);
    }

}