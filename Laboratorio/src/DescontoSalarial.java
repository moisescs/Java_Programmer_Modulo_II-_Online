
public class DescontoSalarial {

	public static void main(String[] args) {
		double [] salariosBrutos = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26};
		
		
		
		
		double [] salariosLiquidos = 
				DoubleArrayUtils.transformaValores(
						salariosBrutos,  d -> 0.9 * d);		
		
		DoubleArrayUtils.processaValores(salariosLiquidos, d -> System.out.println(d));
	}

}
