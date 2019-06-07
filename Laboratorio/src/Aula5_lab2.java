import java.util.ArrayList;

public class Aula5_lab2 {

	public static void main(String[] args) {

		ArrayList<Estudante> estudanteList  = new ArrayList<>();
		estudanteList.add(new Estudante("Moisés", 9.5, 8.2));
		estudanteList.add(new Estudante("Ana", 8.5, 7.2));
		estudanteList.add(new Estudante("Will", 7.3, 5.2));
		
		
		estudanteList.forEach(e -> e.setMeida((e.getNotaMatematica() + e.getNotaPortugues()) / 2));
		
		System.out.println("Média dos aluno");
		System.out.println("############################################");
		
		estudanteList.forEach(e -> System.out.println(e.getNome() + " : " + e.getMeida()));
	
		
	}

}
