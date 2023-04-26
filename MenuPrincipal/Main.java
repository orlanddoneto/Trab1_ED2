
package MenuPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Cliente;
import GerenciadorCSV.EscritorCSV;
import GerenciadorCSV.LeitorCSV;
import Servicos.BifCompare;
import Servicos.ExecutarPrograma;


public class Main {
		
    public static void main(String[] args) {
        TemplateMain menu = new ExecutarPrograma();
        menu.templateMain();
        /*
        int criterio = 0;
        int metodo = 0;
        int ordem = 0;
        
        
        LeitorCSV csv = new LeitorCSV();
        csv.lerCSV();
        List<Cliente> temp = new ArrayList<>(csv.getLines());
        
        
        Gerenciador gerenciador = new Gerenciador();
        BifCompare cmp = new BifCompare(criterio);
        long inicioRelogio = System.currentTimeMillis();
        switch (metodo){
            case 1:
               // QM_Sort();
                break;
            case 2:
               // SI_Sort();
                break;
            case 3:
                gerenciador.selectSort().ordenar(cmp, temp,0,temp.size(), ordem);
                break;
            case 4:
                gerenciador.insertSort().ordenar(cmp, temp,1,temp.size()-1, ordem);
                break;
            case 5:
                gerenciador.quickSort().ordenar(cmp,temp,0,temp.size()-1,ordem);
                break;
            case 6:
            	gerenciador.mergeSort().ordenar(cmp, temp,0,temp.size(), ordem);
                break;
            case 7:
                gerenciador.heapSort().ordenar(cmp,temp,0,temp.size()-1,ordem);
                break;
            
        }
        long fimRelogio = System.currentTimeMillis();
        
        long tempoProcessamento = (fimRelogio - inicioRelogio);
        
        System.out.printf("Tempo de processamento em milissegundos: %d\n",tempoProcessamento);
        */
      
      
        
        

    }
   


}
