import java.util.Scanner;

import controller.GerenciaContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;

public class AppConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		GerenciaContas contas = new GerenciaContas();
		int opicao = 0;
		int numero;
		double saldo;
		int tipo;
		double limite;
		String entrada;
		double deposito, sac;
		Conta c;

		while (opicao != 6) {
			System.out.println("Op��o 1: criar conta.");
			System.out.println("Op��o 2: fazer dep�sito.");
			System.out.println("Op��o 3: sacar da conta.");
			System.out.println("Op��o 4: buscar conta.");
			System.out.println("Op��o 5: remover conta.");
			System.out.println("Op��o 6: sair do programa.");
			System.out.println("Qual sua op��o?");
			entrada = teclado.nextLine();
			opicao = Integer.parseInt(entrada);

			switch (opicao) {
			case 1:
				opicao = 0;
				while (opicao != 1 && opicao != 2 && opicao != 3) {
					System.out.println("Informe qual tipo de conta. Tecle um para conta corrente, ou 2 para conta especial. Tecle 3 para voltar ao menu anterior.");
					entrada = teclado.nextLine();
					opicao = Integer.parseInt(entrada);

					switch (opicao) {
					case 1:
						System.out.println("Informe o n�mero da conta.");
						entrada = teclado.nextLine();
						numero = Integer.parseInt(entrada);
						System.out.println("Informe o saldo.");
						entrada = teclado.nextLine();
						saldo = Float.parseFloat(entrada);
						tipo = 0;
						c = new ContaCorrente(numero, saldo, tipo);
						if (contas.adicionarConta(c)) {
							System.out.println("Conta criada com sucesso.");
						} else {
							System.out.println("N�o foi poss�viel criar a conta.");
						}
						break;
					case 2:
						System.out.println("Informe o n�mero da conta.");
						entrada = teclado.nextLine();
						numero = Integer.parseInt(entrada);
						System.out.println("Informe o saldo.");
						entrada = teclado.nextLine();
						saldo = Float.parseFloat(entrada);
						System.out.println("Informe o limite da conta.");
						entrada = teclado.nextLine();
						limite = Float.parseFloat(entrada);
						tipo = 1;
						c = new ContaEspecial(numero, saldo, tipo, limite);
						if (contas.adicionarConta(c)) {
							System.out.println("Conta criada com sucesso.");
						} else {
							System.out.println("N�o foi poss�viel criar a conta.");
						}
						break;
					case 3:
						System.out.println("Retornando ao menu anterior.");
						break;
					default:
						System.out.println("O tipo de conta � inv�lido.");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Informe o n�mero da conta para efetuar o dep�sito.");
				entrada = teclado.nextLine();
				numero = Integer.parseInt(entrada);
				System.out.println("Agora informe o valor a ser depositado.");
				entrada = teclado.nextLine();
				deposito = Float.parseFloat(entrada);
				if (contas.depositar(numero, deposito)) {
					System.out.printf("O dep�sito de R$%.2f para a conta %d, foi realizado com �xito.\n", deposito, numero);
					break;
				}
				System.out.printf("O dep�sito de R$%.2f para a conta %d, n�o p�de ser realizado.\n", deposito, numero);
				break;
			case 3:
				System.out.println("Informe o n�mero da conta para efetuar o sac.");
				entrada = teclado.nextLine();
				numero = Integer.parseInt(entrada);
				System.out.println("Agora informe o valor a ser sacado.");
				entrada = teclado.nextLine();
				sac = Float.parseFloat(entrada);
				if (contas.sacar(numero, sac)) {
					System.out.printf("O sac de R$%.2f na a conta %d, foi realizado com �xito.\n", sac, numero);
					break;
				}
				System.out.printf("O sac de R$%.2f na a conta %d, n�o p�de ser realizado.\n", sac, numero);
				break;
				
			case 4:
				System.out.println("Informe o n�mero da conta a ser buscada.");
				entrada = teclado.nextLine();
				numero = Integer.parseInt(entrada);
				System.out.println(contas.buscarConta(numero));
				break;
			case 5:
				System.out.println("Informe o n�mero da conta a ser removida.");
				entrada = teclado.nextLine();
				numero = Integer.parseInt(entrada);
				if (contas.removerConta(numero)) {
					System.out.println("Conta removida com �xito.");
				} else {
					System.out.println("N�o foi poss�vel remover a conta.");
				}
				break;
			case 6:
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
		teclado.close();
	}
}
