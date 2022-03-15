package media;

import java.util.Scanner;

public class CaucularMedia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		System.out.println("Vamos caucular a média do aluno.");
		System.out.println("Para isso, informe a primeira nota:");
		nota1 = teclado.nextDouble();
		System.out.println("Agora, informe a segunda nota do aluno:");
		nota2 = teclado.nextDouble();
		teclado.close();
		media = (nota1 + nota2) / 2;
		System.out.println("A média do aluno foi: " + media);
	}
}
