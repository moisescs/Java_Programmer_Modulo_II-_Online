
public class TesteString {

	public static void main(String[] args) {

		String nome = "Ricardo";
		nome += " da Silva";
		nome += " Almeida";
		nome = nome + " Alencar";
		
		System.out.println("Nome concatena��o: " + nome);
		
		
		//StringBuilder, mais indicado para concatena��o de strings
		
		StringBuilder builder;
		builder = new StringBuilder("Linguagem Java");
		builder.append(" 1.4");
		System.out.println(builder);
		
		builder = new StringBuilder("Linguagem java");
		builder.delete(0,10);
		System.out.println(builder);
		
		builder = new StringBuilder("Linguagem java");
		builder.insert(10,"de programa��o");
		System.out.println(builder);
	}

}
