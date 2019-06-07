import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {

		SortedSet<Cliente> set = new TreeSet<>();
		set.add(new Cliente("Mois�s", "Rua A", "311221212"));
		set.add(new Cliente("Bruna", "Rua B", "8454545454"));
		set.add(new Cliente("Sebasti�o", "Rua C", "555456656"));
		set.add(new Cliente("Maria", "Rua D", "121212112121"));
		
		
		
		//Ordena��o por meio comparable to, da closse cliente;
		set.forEach(c -> System.out.println(c.getTelefone()));		
		
	}

}
