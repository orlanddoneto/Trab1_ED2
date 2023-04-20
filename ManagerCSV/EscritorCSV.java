package ManagerCSV;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.lang.reflect.Field;
import Entidade.Cliente;

public class EscritorCSV {
	
	public static void escreveCSV(List<Cliente> list) {
		try{
			FileWriter writer = new FileWriter("C:\\Users\\Cliente\\eclipse-workspace\\Job1_ED2\\src\\ManagerCSV\\csvOrdenado.csv");
			PrintWriter printWriter = new PrintWriter(writer);
			
		    // escreva cada linha do vetor no arquivo
		    for (Cliente linha : list) {
		    	int contador = 0;
		    	Field[] attributes =  linha.getClass().getDeclaredFields();
		    	//escreva cada atributo da classe (elementos da linha)
		    	for(Field item: attributes ) {
		    		contador++;
		    		item.setAccessible(true);
		    		try {
		    			Object atributo = item.get(linha);
			    		printWriter.print(atributo.toString());
			    		if(attributes.length != contador) {
			    			printWriter.print(",");
			    		}
		    		}
		    		catch(IllegalAccessException e) {
		    			System.out.println("Erro ao informar o csv ordenado.");
		    		}
		    		
		    	}
		    	printWriter.print("\n");
		        
		    }
		    printWriter.close();
		} catch (IOException e) {
		    e.printStackTrace();
		} 
		
		
	}

}
