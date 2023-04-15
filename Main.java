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
        
        Sort sorter = new Sort();
        System.out.printf("Escolha o atributo que deseja usar na ordenacao:\n1 - Valor1 (Integer)\n2 - Valor2 (Double)\n3 - Valor3 (String)" +
                "\n" +
                "\nSua Escolha:");
        int criterio = sc.nextInt();
        String csvFile = "C:\\Users\\Cliente\\eclipse-workspace\\Job1_ED2\\src\\ManagerCSV\\customer_shopping_data.csv";
        ReaderCSV csv = new ReaderCSV();
        csv.readCSV(csvFile,criterio);
        List<Produto> temp = new ArrayList<>(csv.getLines());
        
        bifCompare cmp = new bifCompare();
	    
        System.out.printf("\nEscolha o m�todo de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - " +
                "InsertSort\n(5) - QuickSort\n(6) - MergeSort\n(7) - HeapSort\nSua escolha: ");
        int metodo = sc.nextInt();
        System.out.printf("\nEscolha a ordem da ordena��o:\n(1) - Crescente \n(-1) - Decrescente\nSua escolha: ");
        int ordem = sc.nextInt(); //

        switch (metodo){
            case 1:
               // QM_Sort();
                break;
            case 2:
               // SI_Sort();
                break;
            case 3:
                sorter.selectSort(cmp,temp,ordem);
                break;
            case 4:
                sorter.insertionSort(cmp, temp, 1, temp.size()-1,ordem);

                break;
            case 5:
                //QuickSort();
                break;
            case 6:
            	sorter.mergeSort(cmp,temp,ordem);
                break;
            case 7:
                //HeapSort();
                break;
            default:
                System.out.println("Valor inv�lido");


                sc.close();
        }

        // imprimir as linhas ordenadas
        System.out.printf("\nVetor Ordenado:\n");
        for (Produto line : temp) {
            System.out.println(line.getField1() + "," + line.getField2()+","+ line.getField3());
        }

    }
   


}