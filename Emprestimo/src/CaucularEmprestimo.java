import java.util.Scanner;

public class CaucularEmprestimo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		double prestacao;
		double limite;
		System.out.println("Informe o valor do salário:");
		salario = teclado.nextDouble();
		System.out.println("Informe o valor da prestação:");
		prestacao = teclado.nextDouble();
		limite = salario * 0.3;
		if (prestacao <= limite) {
			System.out.println("Seu empréstimo foi aprovado.");
		} else {
			System.out.println("Seu empréstimo não foi aprovado.");
		}
	}
}
