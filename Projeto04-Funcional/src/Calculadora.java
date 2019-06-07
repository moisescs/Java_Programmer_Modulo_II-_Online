
public class Calculadora {

	public static void main(String[] args) {
		
		//OperacaoAritimetica funcao = new Soma();		
		//
		
		//Express�es lambidas sempre implementar� interface funcional, que possui apenas um metodo;
		//(arg1, arg2, arg3, ...) -> <express�o> - arg s�o argumentos esperado pelo metodo funcinal da interface, <express�o> � opera��o que ser� feita com os args;
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
