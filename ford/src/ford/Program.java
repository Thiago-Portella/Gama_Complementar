package ford;

public class Program {
public static void main(String[] args) {
	Veiculo v1 = new Veiculo("FordKa.", "Ford.", 2.1);
	v1.getMarca();
	v1.getModelo();
	System.out.println("O consumo desse carro é de: " + v1.getConsumo() + "km/l.");
}
}
