import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String idade;
		
		System.out.println("Digite sua Idade: " );
		
		try {
			
			idade = sc.nextLine();			
			int i = Integer.parseInt(idade);
			i = 2005 - i;
			System.out.println("Você tem: " + i);
			
		} catch (NumberFormatException e) {
			
			System.out.println("O valor digitado não é validado!");
			
		}
		
		

	}

}
