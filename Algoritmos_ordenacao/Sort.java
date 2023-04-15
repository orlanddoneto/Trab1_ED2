package Algoritmos_ordenacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Sort {
    public static <T> void insertionSort(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
        for (int i=ini; i<=fim; i++) {
            T temp = list.get(i);
            int j = i-1;
            while (j >= 0 && cmp.apply(list.get(j), temp)*ordem == 1) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, temp);
        }
    }
    
    public static <T> void selectSort(BiFunction<T, T, Integer> cmp, List<T> list, int ordem) {
    	for (int i = 0; i<list.size();i++) {
    		int menor = i; // ou Maior
    		T temp = list.get(i);
    		for (int j = i+1; j<list.size();j++) {
    			if (cmp.apply(list.get(j), list.get(menor))*ordem == -1) {
    				menor = j;
    			}
    		}
    		list.set(i, list.get(menor));
    		list.set(menor, temp);
    	}
    }
    
    public static <T> void mergeSort(BiFunction<T, T, Integer> cmp, List <T>list,int ordem) {
    	if(list.size()<2) {
    		return;
    	}
    	List<T> arrayLeft = new ArrayList<T>();
    	List<T> arrayRight = new ArrayList<T>();
    	int middle = list.size() / 2;
    	
    	for (int i = 0; i < middle; i++) { // aqui vai adicionar os valores no array da esquerda
    		arrayLeft.add(list.get(i));
	    }
    	
    	for (int i = middle; i < list.size(); i++) { // aqui vai adicionar os valores no array da direita
    		arrayRight.add(list.get(i));
	    }
    	
    	mergeSort(cmp,arrayLeft,ordem);
    	mergeSort(cmp,arrayRight,ordem);
    	merge(cmp,arrayLeft,arrayRight,list,ordem);
    	
    }
    
    public static <T> void merge(BiFunction<T, T, Integer> cmp,List<T> arrayLeft,List<T> arrayRight, List <T>list,int ordem ) {
    	int leftLength = arrayLeft.size();
	    int rightLength = arrayRight.size();
	    int i = 0, j = 0, k = 0;
	    int comparador = cmp.apply(list.get(i), list.get(j));
	    while (i < leftLength && j < rightLength) {
	        if (comparador*ordem == 1 || comparador*ordem ==0 ) {
	            list.set(k, arrayLeft.get(i));
	            k++;
	            i++;
	        } else {
	        	list.set(k, arrayRight.get(j));
	            k++;
	            j++;
	        }
	    }
	    while (i < leftLength) {
	    	 list.set(k, arrayLeft.get(i));
	            k++;
	            i++;
	    }
	    
	    while (j < rightLength) {
	    	list.set(k, arrayRight.get(j));
            k++;
            j++;
	    }
    }

}