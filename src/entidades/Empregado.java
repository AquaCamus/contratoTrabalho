package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelEmpregado;

public class Empregado {
	
	private String nome;
	NivelEmpregado nvEmpregado;
	Double salarioBase;
	
	private HoraContrato hContrato;
	private Departamento departamento;
	//Relacionamento um para muitos - não colocar a lista no construtor
	private List<HoraContrato> contratos = new ArrayList<>();
	
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, NivelEmpregado nvEmpregado, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nvEmpregado = nvEmpregado;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelEmpregado getNvEmpregado() {
		return nvEmpregado;
	}

	public void setNvEmpregado(NivelEmpregado nvEmpregado) {
		this.nvEmpregado = nvEmpregado;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	//A lista de contratos começa vazia
	//A adição ou remoção de contratos é feita via métodos e apenas por métodos
	//A lista não pode ser trocada
	/*public void setContratos(List<HoraContrato> contratos) {
		this.contratos = contratos;
	}*/

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", nvEmpregado=" + nvEmpregado + ", salarioBase=" + salarioBase + "]";
	}

	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double aReceber(int ano, int mes) {
		Double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		int cMes = 1 + cal.get(Calendar.MONTH);
		int cAno = cal.get(Calendar.YEAR);
		
		//Para cada contrato na lista verificar o mês e o ano para ver se bate
		//Se bater, adicionar à soma os valores do contrato
		for(HoraContrato c : contratos) {
			if(cMes == mes && cAno == ano) {
				soma += salarioBase;
			}
		}
		//Retorna a soma do salário base mais os valores do contrato
		return soma;
	}
}
