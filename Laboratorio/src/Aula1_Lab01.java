
public class Aula1_Lab01 {

	public static void main(String[] args) {
		
		int numeros[] = {125, 2, 8, 6, 90, 25};		
		System.out.println("O maior n�mero do Array �: " + maiorNumero(numeros));	
		
	}

	static int maiorNumero(int n[]) {
		int maior = 0;
		for (int i : n) {
			if(i > maior) {
				maior = i;
			}			
		}
		return maior;
	}
	
}
