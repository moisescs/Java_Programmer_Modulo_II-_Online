import java.util.HashMap;

public class Aula5_lab1 {
	public static void main(String[] args) {
		HashMap<String, Integer> pessoaMap = new HashMap<>();
		
		pessoaMap.put("Moises", 1);
		pessoaMap.put("João", 2);
		pessoaMap.put("José", 5);
		pessoaMap.put("Mario", 7);
		

		
		for (String key : pessoaMap.keySet()) {
			
			//System.out.printf("%s - %s\n", key, pessoaMap.get(key).toString());
		}
		
		//Usando java lambida
		pessoaMap.forEach((k, o) -> System.out.printf("%s - %s\n", k, o.toString()));
	}
}
