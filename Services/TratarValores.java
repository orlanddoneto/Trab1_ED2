package Services;

public class TratarValores {
	
	
	public static boolean tratarMetodo(int entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(String.valueOf(entrada));
			if (valor >= 1 && valor <= 7) {
				valido = true;
			} else {
				System.out.println("Valor inv�lido. Digite um n�mero inteiro de 1 a 7: ");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inv�lido. Digite um n�mero inteiro de 1 a 7: ");
		}

		return valido;
	}
	
	
	public static boolean tratarCriterio(int entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(String.valueOf(entrada));
			if (valor>=1 && valor<=3) {
				valido = true;
			} else {
				System.out.println("Valor inv�lido. Digite um n�mero inteiro de 1 a 3: ");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inv�lido. Digite um n�mero inteiro de 1 a 3: ");
		}

		return valido;
	}
	
	public static boolean tratarOrdem(int entrada) {
		int valor = 0;
		boolean valido = false;
		try {
			valor = Integer.parseInt(String.valueOf(entrada));
			if (valor == 1 || valor == -1) {
				valido = true;
			} else {
				System.out.println("Valor inv�lido. Digite um n�mero inteiro, 1 ou -1: ");
			}
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Valor inv�lido. Digite um n�mero inteiro, 1 ou -1: ");
		}

		return valido;
	}
}