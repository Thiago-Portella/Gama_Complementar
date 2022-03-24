package model;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, double saldo, int tipo) {
		super(numero, saldo, tipo);
	}

	public boolean sacar(double sac) {
		if (sac > super.getSaldo()) {
			return false;
		} else {
			super.sacar(sac);
			return true;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " - conta corrente";
	}


}
