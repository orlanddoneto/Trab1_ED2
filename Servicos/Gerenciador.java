package Servicos;

import java.util.List;
import java.util.function.BiFunction;

import AlgoritmosOrdenacao.HeapSort;
import AlgoritmosOrdenacao.InsertSort;
import AlgoritmosOrdenacao.MergeSort;
import AlgoritmosOrdenacao.QuickSort;
import AlgoritmosOrdenacao.SelectSort;

public class Gerenciador {
	
	public <T> SelectSort selectSort() {
		SelectSort algoritmo = new SelectSort();
		return algoritmo;
	}
	
	public <T> InsertSort insertSort() {
		InsertSort algoritmo = new InsertSort();
		return algoritmo;
		
	}
	
	public <T> MergeSort mergeSort() {
		MergeSort algoritmo = new MergeSort();
		return algoritmo;
	}
	
	public <T> QuickSort quickSort() {
		QuickSort algoritmo = new QuickSort();
		return algoritmo;
	}
	
	public <T> HeapSort heapSort() {
		HeapSort algoritmo = new HeapSort();
		return algoritmo;
	}
}
