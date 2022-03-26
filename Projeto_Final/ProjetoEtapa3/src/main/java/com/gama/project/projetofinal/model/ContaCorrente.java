package com.gama.project.projetofinal.model;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "conta_corrente")
public class ContaCorrente extends Conta{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	super.numero;
	@Column(name = "tipo", nullable = false)
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
