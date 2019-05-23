
public class ExemploArray {
	
	public static void main(String[] args) {
		
		int teste[]  = new int[3]; //criação de uma array unidimencional de inteiros, é necessário fazer atribuição do tamanho do array na criaçao;;
		teste[0] = 1;
		teste[1] = 33; 
		teste[2] = 50;
		
		for (int i = 0; i < teste.length; i++) {
			//System.out.println(teste[i]);
		}

		
		String nome[] = {"Maria", "João", "Silvia", "Ana"};
		
		for (String n : nome) {
			//System.out.println(n);	
		}
		
		
		//Array Bibimensional
		
		double notas[][] = new double[5][3];
		
		notas[0][0] = 6.5;
		notas[0][1] = 7.6;
		notas[0][2] = 10.0;
		
		notas[1][0] = 5.0;
		notas[1][1] = 7.6;
		notas[1][2] = 9.0;
		
		notas[2][0] = 8.5;
		notas[2][1] = 9.5;
		notas[2][2] = 3.5;
		
		for (int i = 0; i < notas.length; i++) { // percorre as linhas do array
			
			for (int j = 0; j < notas[i].length; j++) {
				
				System.out.println("Notas do Aluno " + i + " = " + notas[i][j]);
				
			}
			
			System.out.println("\n");
			
		}
		
		
		
		
	}

}
