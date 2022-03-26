package com.gama.project.projetofinal.model;

public class ContaEspecial extends Conta {
	private int tipo;
	private double limite;
	public ContaEspecial(int numero, double saldo, int tipo, double limite) {
		super(numero, saldo);
		this.tipo = tipo;
		this.limite = limite;
	}

	public int getTipo() {
		return tipo;
	}

	public boolean sacar(double sac) {
		if (sac <= limite + super.getSaldo()) {
			boolean resultado = super.sacar(sac);
			return resultado;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " - conta especial com limite de " + limite;
	}


	public double getLimite() {
		return limite;
	}
}