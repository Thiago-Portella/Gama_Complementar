package cloc;

public class Relogio {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Relogio(int horas, int minutos, int segundos) {
		super();
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas >= 0 && horas <=23) {
			this.horas = horas;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}


	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	public void horaAtual() {
		System.out.printf("São %d horas, %d minutos e %d segundos.", this.horas, this.minutos, this.segundos);
	}
}
