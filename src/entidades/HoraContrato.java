package entidades;

import java.util.Date;

public class HoraContrato {
	Date data;
	Double valorPorHora;
	Integer horas;
	
	public HoraContrato() {
	}
	
	public HoraContrato(Date data, Double valorPorHora, Integer horas) {
		super();
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "HoraContrato [data=" + data + ", valorPorHora=" + valorPorHora + ", horas=" + horas + "]";
	}
	
	public Double valorTotal() {
		return valorPorHora * horas;
	}
}
