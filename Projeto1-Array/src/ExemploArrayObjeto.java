
public class ExemploArrayObjeto {

	public static void main(String[] args) {

		Funcionario[] func = new Funcionario[3];
		
		func[0] = new Funcionario(200, "Manuel", 2500.15);
		func[1] = new Funcionario(300, "Maria", 3500.12);
		func[2] = new Funcionario(400, "José", 2200.30);
		
		
		for (Funcionario f : func) {
			System.out.println("Funcionário " + f.getNome() + " - Salário: " + f.getSalario());			
		}
		
	}

}
