package ford;

public class Veiculo {
	private String modelo;
	private String marca;
	private double consumo;
	public Veiculo(String modelo, String marca, double consumo) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.consumo = consumo;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	public void getModelo() {
		System.out.println("O modelo do carro é: " + this.modelo);
	}
	
	public void getMarca() {
		System.out.println("A marca do veículo é: " + this.marca);
	}
}
