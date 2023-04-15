import java.util.Scanner;

import Algoritmos_ordenacao.Sort;
import Linhas.Produto;
import ManagerCSV.ReaderCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
		

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String csvFile = "C:\\Users\\Cliente\\eclipse-workspace\\Job1_ED2\\src\\ManagerCSV\\customer_shopping_data.csv";
        ReaderCSV csv = new ReaderCSV();
        csv.readCSV(csvFile);
        Sort sorter = new Sort();
        List<Produto> temp = new ArrayList<>(csv.getLines());
        


        System.out.printf("Escolha o atributo que deseja usar na ordenacao:\n1 - Valor1 (Integer)\n2 - Valor2 (Double)\n3 - Valor3 (String)" +
                "\n" +
                "\nSua Escolha:");
        int atributo = sc.nextInt();
        
        BiFunction<Produto, Produto, Integer> cmp = (linha1, linha2) -> {
	    	if (atributo == 1) {
	            return linha1.getField1().compareTo(linha2.getField1());
	        } else if (atributo == 2) {
	            return linha1.getField2().compareTo(linha2.getField2());
	        } else if (atributo == 3 ) {
	        	return linha1.getField3().compareTo(linha2.getField3());
	        } 
	        else {
	            return 0;
	        }
	    };
	    
        System.out.printf("\nEscolha o mÃ©todo de ordenacao:\n(1) - QM-Sort\n(2) - SI-Sort\n(3) - SelectSort\n(4) - " +
                "InsertSort\n(5) - QuickSort\n(6) - MergeSort\n(7) - HeapSort\nSua escolha: ");
        int metodo = sc.nextInt();
        System.out.printf("\nEscolha a ordem da ordenação:\n(1) - Crescente \n(-1) - Decrescente\nSua escolha: ");
        int ordem = sc.nextInt(); //

        switch (metodo){
            case 1:
               // QM_Sort();
                break;
            case 2:
                //SI_Sort();
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