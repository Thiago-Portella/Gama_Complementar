package model;

public abstract class Conta {
	private int numero;
	private double saldo;
	private int tipo;	
	public Conta(int numero, double saldo, int tipo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	public boolean depositar(double deposito) {
		if (deposito <= 0) {
			return false;
		} else {
			this.saldo+= deposito;
			return true;
		}
	}

	public boolean sacar(double sac) {
		if (sac <= 0) {
			return false;
		} else {
			this.saldo -= sac;
			return true;
		}
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

	public int getTipo() {
		return tipo;
	}

}
