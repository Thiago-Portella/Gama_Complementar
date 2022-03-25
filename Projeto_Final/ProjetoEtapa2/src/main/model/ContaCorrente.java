package main.model;

public class ContaCorrente extends Conta{
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
