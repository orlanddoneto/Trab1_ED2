package AlgoritmosOrdenacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

import Entidade.Cliente;
import Servicos.BifCompare;


public abstract class Sort<T> {
	
	
	public abstract void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem);
	
	public abstract long getComparacoes();
	public abstract long getTrocas();
	
}