import java.util.Scanner;

public class CaucularEmprestimo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		double prestacao;
		double limite;
		System.out.println("Informe o valor do sal�rio:");
		salario = teclado.nextDouble();
		System.out.println("Informe o valor da presta��o:");
		prestacao = teclado.nextDouble();
		limite = salario * 0.3;
		if (prestacao <= limite) {
			System.out.println("Seu empr�stimo foi aprovado.");
		} else {
			System.out.println("Seu empr�stimo n�o foi aprovado.");
		}
	}
}
