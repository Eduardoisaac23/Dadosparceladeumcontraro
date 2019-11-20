	package services;
	
	import java.util.Calendar;
import java.util.Date;
	
	import model.entities.Contrato;
	import model.entities.Prestacoes;
	
	public class ServicoContrato {
	
		private ServicosOnlinePyment servicoOnlinePyment;
	
		public ServicoContrato(ServicosOnlinePyment servicoOnlinePyment) {
			this.servicoOnlinePyment = servicoOnlinePyment;
		}
	
		public void processarContrato(Contrato contrato, int meses) {
	
			double cotaBasica = contrato.getTotalValor() / meses;
	
			for (int i = 1; i <= meses; i++) {
				Date date = addMeses(contrato.getDate(), i);
				double atualizarCota = cotaBasica + servicoOnlinePyment.interesse(cotaBasica, i);
				double cotaCompleta = atualizarCota + servicoOnlinePyment.txaDePagamento(cotaBasica);
				contrato.addPrestacoes(new Prestacoes(date, cotaCompleta));
			}
		}
		
		private Date addMeses(Date date, int n) {
			Calendar cal= Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, n);
			return cal.getTime();
		}
	
	
	}
