package Algoritmos_ordenacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Sort {
	protected long comparacoes;
	protected long atribuicoes;
	
	public <T> void selectSort(BiFunction<T, T, Integer> cmp, List<T> list, int ordem) {
		SelectSort algoritmo = new SelectSort();
		algoritmo.ordenar(cmp, list, ordem);
	}
	
	public <T> void insertSort(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
		InsertSort algoritmo = new InsertSort();
		algoritmo.ordenar(cmp, list, ini, fim, ordem);
	}
	
	public <T> void mergeSort(BiFunction<T, T, Integer> cmp, List <T>list,int ordem) {
		MergeSort algoritmo = new MergeSort();
		algoritmo.ordenar(cmp, list, ordem);
	}
	
	public <T> void quickSort(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem) {
		QuickSort algoritmo = new QuickSort();
		algoritmo.ordenar(cmp, list, ini, fim, ordem);
	}
	
	public static <T> void heapSort(BiFunction<T, T, Integer> cmp, List<T> list, int ordem) {
		HeapSort algoritmo = new HeapSort();
		algoritmo.ordenar(cmp, list, ordem);
	}
	
	
   
}