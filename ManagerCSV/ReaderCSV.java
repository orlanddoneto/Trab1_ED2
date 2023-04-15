package ManagerCSV;
import Algoritmos_ordenacao.Sort;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Linhas.Produto;

public class ReaderCSV {

    private BufferedReader br = null;
    private String line = "";
    private String cvsSplitBy = ",";
    private List<Produto> lines = new ArrayList<>();


    public List<Produto> getLines() {
        return lines;
    }


    public void readCSV(String csvFile, Integer criterio){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int cont = 0;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null && cont<5) {
                String[] data = line.split(cvsSplitBy);
                cont++;
                if (cont==1){
                    continue;
                }
                else
                {
                    Integer idade = Integer.parseInt(data[3]);
                    Double preco = Double.parseDouble(data[6]);
                    String nome_shopping = data[9];
                    Produto produto = new Produto(idade, preco,nome_shopping, criterio);
                    lines.add(produto);
                }
                // n sei pq n ta lendo o preco
                // ja sei




            }
        }
        catch (IOException e) {
            e.printStackTrace();
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

}