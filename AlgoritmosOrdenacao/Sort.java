package AlgoritmosOrdenacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public  interface Sort {
	//protected long comparacoes;
	//protected long atribuicoes;
	
	public abstract <T> void ordenar(BiFunction<T, T, Integer> cmp, List<T> list, int ini, int fim, int ordem);
	
	
	
	
   
}