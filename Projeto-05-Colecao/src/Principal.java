import java.util.ArrayList;
import java.util.Collection;

public class Principal {

	public static void main(String[] args) {

		Collection<Funcionario> funcList = new ArrayList<>();
		
		funcList.add(new Funcionario(2000, "Manuel", 2.0));
		funcList.add(new Funcionario(1350, "Moisés", 3.5));
		funcList.add(new Funcionario(5420, "Joaquim", 45));
		
		
		for (Funcionario f : funcList) {			
			//System.out.println("Funcionário "+ f.getNome());			
		}
		
		//Exemplo com lambda;
		funcList.forEach(f -> System.out.println("Funcionário "+ f.getNome()));
	}

}
