package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacoes {

	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dateVencimento;
	private  Double montante;
	
	public Prestacoes() {
		
	}

	public Prestacoes(Date dateVencimento, Double montante) {
		this.dateVencimento = dateVencimento;
		this.montante = montante;
	}

	public Date getDateVencimento() {
		return dateVencimento;
	}

	public void setDateVencimento(Date dateVencimento) {
		this.dateVencimento = dateVencimento;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}
	
	@Override
	public String toString() {
		return sdf.format(dateVencimento) +  " , " + String.format("%.2f", montante);
	}
	
	
	
	
	
}
