
package services;

public class PaypalService implements ServicosOnlinePyment{

	private static final double TAXA_PORCENTAGEM = 0.02;
	private static final double JUROS_MENSAIS = 0.01;
	
	@Override
	public double txaDePagamento(double montante) {
		
		return montante * TAXA_PORCENTAGEM ;
	}

	@Override
	public double interesse(double montante, int meses) {
		
		return montante  * JUROS_MENSAIS * meses;
	}
	
}
