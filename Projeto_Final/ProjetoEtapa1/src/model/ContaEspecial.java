package model;

public class ContaEspecial extends Conta {
	private double limite;
	public ContaEspecial(int numero, double saldo, int tipo, double limite) {
		super(numero, saldo, tipo);
		this.limite = limite;
	}

	public boolean sacar(double sac) {
		if (limite + super.getSaldo() > sac) {
			return false;
		} else {
			super.sacar(sac);
			return true;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " - conta especial com limite de " + limite;
	}


	public double getLimite() {
		return limite;
	}
}