
public class Aula1_Lab02 {

	public static void main(String[] args) {
		
		int[] idades = {};
		
		if (idades.length >= 0) {
			
			System.out.println("Entre com valores válidos para idades");	
			
		} else {
			
			int soma = 0;
			for (int i = 0; i < idades.length; i++) {
				soma += idades[i];
			}
			
			double media = soma/idades.length;
			System.out.println("Idade média é: " + media);
			
		}

	}

}
