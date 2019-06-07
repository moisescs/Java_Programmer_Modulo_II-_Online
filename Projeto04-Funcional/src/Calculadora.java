
public class Calculadora {

	public static void main(String[] args) {
		
		//OperacaoAritimetica funcao = new Soma();		
		//
		
		//Expressões lambidas sempre implementará interface funcional, que possui apenas um metodo;
		//(arg1, arg2, arg3, ...) -> <expressão> - arg são argumentos esperado pelo metodo funcinal da interface, <expressão> é operação que será feita com os args;
		 exibirTabuada((x, y) -> x * y);

	}

	static void exibirTabuada(OperacaoAritimetica funcao) {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Tabuada de " + i);
			
			for (int j = 0; j < 10; j++) {
				
				System.out.printf("%d\t%d\t%.0f\n", i, j, funcao.execute(i, j));
			}
		}
		
	}


}
