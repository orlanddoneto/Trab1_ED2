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
        //int vetor[] = {5,6,4,2,7,2,8,1}; //orlando calma vai no zap


        System.out.printf("Escolhaaa o atributo que deseja usar na ordenacao:\n1 - Nome (string)\n2 - Preco(double)" +
                "/" +
                "\nSua Escolha:");
        int atributo = sc.nextInt();
        
        BiFunction<Produto, Produto, Integer> cmp = (linha1, linha2) -> {
	    	if (atributo == 1) {
	            return linha1.getField1().compareTo(linha2.getField1());
	        } else if (atributo == 2) {
	            return linha1.getField2().compareTo(linha2.getField2());
	        } else {
	            return 0;
	        }
	    };
	    
        System.out.printf("Escolha o método de ordenacao:\n1 - QM-Sort\n2 - SI-Sort\n3 - SelectSort\n4 - " +
                "InsertSort\n5 QuickSort\n6 - MergeSort\n7 - HeapSort\nSua escolha: ");
        int metodo = sc.nextInt();
        System.out.println("Escolha a ordem de ordenação:\n0 - Crescente\n-1 Decrescente\nSua escolha: \"");
        int ordem = sc.nextInt(); // essa variável vai ser usada em alguma coisa que não faço ideia ainda ksksks kkkk

        switch (metodo){
            case 1:
               // QM_Sort();
                break;
            case 2:
                //SI_Sort();
                break;
            case 3:
                //SelectionSort();
                break;
            case 4:
                sorter.insertionSort(cmp, temp, 1, temp.size()-1);

                break;
            case 5:
                //QuickSort();
                break;
            case 6:
                //MergeSort();
                break;
            case 7:
                //HeapSort();
                break;
            default:
                System.out.println("Valor inválido");


                sc.close();
        }

        // imprimir as linhas ordenadas
        for (Produto line : temp) {
            System.out.println(line.getField1() + "," + line.getField2());
        }

    }
   


}