import java.util.Scanner;

import Algoritmos_ordenacao.Sort;
import Linhas.Produto;
import ManagerCSV.ReaderCSV;
import Services.bifCompare;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
		
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.printf("Escolha o atributo que deseja usar na ordenacao:\n(1) - Valor1 (Integer)\n(2) - Valor2 (Double)\n(3) - Valor3 (String)" +
                "\n" +
                "\nSua Escolha:");
        int criterio = sc.nextInt();
        
        
        ReaderCSV csv = new ReaderCSV();
        csv.readCSV(criterio);
        List<Produto> temp = new ArrayList<>(csv.getLines());
        
       
	    
        System.out.printf("\nEscolha o método de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - " +
                "InsertSort\n(5) - QuickSort\n(6) - MergeSort\n(7) - HeapSort\nSua escolha: ");
        int metodo = sc.nextInt();
        System.out.printf("\nEscolha a ordem da ordenação:\n(1) - Crescente \n(-1) - Decrescente\nSua escolha: ");
        int ordem = sc.nextInt(); //
        
        
        Sort sort = new Sort();
        bifCompare cmp = new bifCompare();
        switch (metodo){
            case 1:
               // QM_Sort();
                break;
            case 2:
               // SI_Sort();
                break;
            case 3:
                sort.selectSort(cmp,temp,ordem);
                break;
            case 4:
                sort.insertSort(cmp, temp, 1, temp.size()-1,ordem);

                break;
            case 5:
                sort.quickSort(cmp,temp,0,temp.size()-1,ordem);
                break;
            case 6:
            	sort.mergeSort(cmp,temp,ordem);
                break;
            case 7:
                sort.heapSort(cmp,temp,ordem);
                break;
            default:
                System.out.println("Valor inválido");


                sc.close();
        }

        // imprimir as linhas ordenadas
        System.out.printf("\nVetor Ordenado:\n");
        for (Produto line : temp) {
            System.out.println(line.getField1() + "," + line.getField2()+","+ line.getField3());
        }

    }
   


}