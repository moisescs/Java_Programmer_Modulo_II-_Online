import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicoGravacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String texto = sc.nextLine();		
		PrintWriter writer;
		
		try {
			writer = new PrintWriter("C:\\Users\\MoisesCarneiroDaSilv\\Box Sync\\Documentos\\doc1.txt");
			writer.println(texto);
			writer.close();
			

		} catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas");
			e.printStackTrace();
		}
		
	}

}
