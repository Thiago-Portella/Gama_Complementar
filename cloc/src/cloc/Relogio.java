package cloc;

public class Relogio {
	private int hora;
	private int minutos;
	private int  segundos;
	public Relogio(int hora, int minutos, int segundos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void horaAtual() {
		System.out.printf("São %d horas, %d minutos e %d segundos.", this.hora, this.minutos, this.segundos);
	}
}
