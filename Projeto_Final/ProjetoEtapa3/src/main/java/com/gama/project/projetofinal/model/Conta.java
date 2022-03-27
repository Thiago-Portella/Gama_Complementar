package com.gama.project.projetofinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta_corrente")
public abstract class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(table = "conta_corrente")
	private int numero;
	@Column(table = "conta_corrente")
	private double saldo;
	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public boolean depositar(double deposito) {
		if (deposito >= 1) {
			this.saldo+= deposito;
			return true;
		}
		return false;
	}

	public boolean sacar(double sac) {
		if (sac >= 1) {
			this.saldo -= sac;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {		
		return numero + " - " + saldo;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
}
