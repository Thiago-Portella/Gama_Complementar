package com.gama.project.projetofinal.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public abstract class Conta {
	protected int numero;
	protected double saldo;
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
