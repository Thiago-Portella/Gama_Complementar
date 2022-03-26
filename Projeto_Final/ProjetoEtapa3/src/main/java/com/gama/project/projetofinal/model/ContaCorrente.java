package com.gama.project.projetofinal.model;

import jakarta.persistence.Column;

public class ContaCorrente extends Conta{
	@Column(table = "conta_corrente",  nullable = false)
	private int tipo;
	public ContaCorrente(int numero, double saldo, int tipo) {
		super(numero, saldo);
		this.tipo = tipo;
	}

	public boolean sacar(double sac) {
		if (sac <= super.getSaldo()) {
			boolean resultado = super.sacar(sac);
			return resultado;
		}
		return false;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " - conta corrente";
	}
}
