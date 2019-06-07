import java.util.*;
public class ExemploMap {

	public static void main(String[] args) {

		Map <String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Moisés");
		mapa.put("idade", 27);
		mapa.put("sndereco", "Rua A 58");
		mapa.put("salario", 3564.15);
		
		mapa.keySet();
		for (String k : mapa.keySet()) {
			//System.out.printf("%s - %s\n", k, mapa.get(k).toString());
		}
		
		mapa.forEach( (s , o) -> System.out.printf("%s - %s\n", s, o.toString()));

		
	}

}
