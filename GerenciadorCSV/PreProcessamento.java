package GerenciadorCSV;

public class PreProcessamento {
	
	public static String[] trataLinha(String[]linha) {
		//Retira a primeira letra dos campos (os dois primeiros) do tipo "C12932" e "I2032".
		for (int i = 0; i<=1;i++) {
			String temp = linha[i];
			linha[i]=temp.substring(1);
		}
		
		return linha;
	}
	
}
