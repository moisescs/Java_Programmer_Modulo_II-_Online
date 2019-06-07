import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploExepetion {

	public static void main(String[] args) {
		
		try {
			
			FileReader reader = new FileReader("C:\\Users\\MoisesCarneiroDaSilv\\Box Sync\\Documentos\\ver.txt");
			System.out.println("Arquivo aberto com sucesso!");
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
			
		}

	}

}
