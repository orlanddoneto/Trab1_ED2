package MenuPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Linhas.Produto;
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
        csv.readCSV(criterio);
        List<Produto> temp = new ArrayList<>(csv.getLines());
        
        
        Gerenciador gerenciador = new Gerenciador();
        BifCompare cmp = new BifCompare();
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
        
        // imprimir as linhas ordenadas
        System.out.printf("\nVetor Ordenado:\n");
        for (Produto line : temp) {
            System.out.println(line.getField1() + "," + line.getField2()+","+ line.getField3());
        }
        
        sc.close();

    }
   


}