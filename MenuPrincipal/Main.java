package MenuPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Cliente;
import ManagerCSV.EscritorCSV;
import ManagerCSV.LeitorCSV;
import Services.Gerenciador;
import Services.BifCompare;

public class Main {
		
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int criterio = Menu.criterio(sc);
        int metodo = Menu.metodo(sc);
        int ordem = Menu.ordem(sc);
        
        
        LeitorCSV csv = new LeitorCSV();
        csv.lerCSV();
        List<Cliente> temp = new ArrayList<>(csv.getLines());
        
        
        Gerenciador gerenciador = new Gerenciador();
        BifCompare cmp = new BifCompare(criterio);
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
        
        EscritorCSV.escreveCSV(temp);
      
        
        // imprimir as linhas ordenadas
        /*
        System.out.printf("\nVetor Ordenado:\n");
        for (Cliente line : temp) {
            System.out.println(line.getField1() + "," + line.getField2()+","+ line.getField3());
        }
        */
        sc.close();

    }
   


}