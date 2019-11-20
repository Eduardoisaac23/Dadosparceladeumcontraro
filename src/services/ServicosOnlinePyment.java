package services;

public interface ServicosOnlinePyment {

	double txaDePagamento(double montane);
	double interesse(double montante, int meses);

}
