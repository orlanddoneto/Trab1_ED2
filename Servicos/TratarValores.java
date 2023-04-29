package Servicos;

public class TratarValores {
	
	
	public static boolean tratarMetodo(String entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(entrada);
			if (valor >= 1 && valor <= 7) {
				valido = true;
			} else {
				System.out.println("Valor inválido. Digite um número inteiro de 1 a 7: ");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inválido. Digite um número inteiro de 1 a 7: ");
		}

		return valido;
	}
	
	
	public static boolean tratarCriterio(String entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(entrada);
			if (valor>=1 && valor<=9) {
				valido = true;
			} else {
				System.out.println("Valor inválido. Digite um número inteiro de 1 a 3: ");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inválido. Digite um número inteiro de 1 a 3: ");
		}

		return valido;
	}
	
	public static boolean tratarOrdem(String entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(entrada);
			if (valor == 1 || valor == -1) {
				valido = true;
			} else {
				System.out.println("Valor inválido. Digite um número inteiro, 1 ou -1: ");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inválido. Digite um número inteiro, 1 ou -1: ");
		}

		return valido;
	}
	
	public static boolean tratarNumExecucoes(String entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(entrada);
			if (valor>0) {
				valido = true;
			} else {
				System.out.println("Valor inválido. Digite um número inteiro positivo e diferente de 0.");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inválido. Digite um número inteiro positivo e diferente de 0");
		}

		return valido;
	}
	
}
