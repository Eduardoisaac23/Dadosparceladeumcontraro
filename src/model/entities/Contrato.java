package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private Date date;
	private Double totalValor;
	
	private List<Prestacoes> prestacoe = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numero, Date date, Double totalValor) {
		this.numero = numero;
		this.date = date;
		this.totalValor = totalValor;
	
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Prestacoes> getPrestacoes() {
		return prestacoe;
	}
	
	public void addPrestacoes(Prestacoes prestacoes) {
		prestacoe.add(prestacoes);
	}
	
	public void removePrestacoes(Prestacoes prestacoes) {
		prestacoe.remove(prestacoes);
	}

	
	

	
	
	
	
	
	

}
