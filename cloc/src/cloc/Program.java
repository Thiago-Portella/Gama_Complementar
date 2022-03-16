package cloc;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe em sequ�ncia a hora, minuto e segundo para inicializa��o de seu rel�gio. Ap�s cada n�mero, tecle enter.");
		int horas = teclado.nextInt();
		int minutos = teclado.nextInt();
		int segundos = teclado.nextInt();
		teclado.close();
		if ((horas >= 0) && (horas <= 23) && (minutos >= 0) && (minutos <= 59) && (segundos >= 0) && (segundos <= 59)) {
			Relogio h1 = new Relogio(horas, minutos, segundos);
			h1.horaAtual();
		}else {
			System.out.println("Sinto muito, mas n�o foi poss�vel inicializar o seu rel�gio, pois um dos valores est� incorreto. Verifique e tente novamente.");
		}
	}
}