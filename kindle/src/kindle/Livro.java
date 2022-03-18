package kindle;

import java.util.Scanner;

public class Livro {
	private String titulo;
	private String altor;
	private int totalDePaginas;
	private int paginaAtual;
	public Livro(String titulo, String altor, int totalDePaginas) {
		super();
		this.titulo = titulo;
		this.altor = altor;
		this.totalDePaginas = totalDePaginas;
	}

	public void avancar() {
		this.paginaAtual++;
		System.out.printf("Voc� est� na p�gina: %d.", this.paginaAtual);
	}

	public void retroceder() {
		this.paginaAtual--;
		System.out.printf("Voc� est� na p�gina: %d.", this.paginaAtual);
	}

	public void buscar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a p�gina a ser pesquisada.");
		int busca = teclado.nextInt();
		teclado.close();
		if (busca > this.totalDePaginas || busca < 1) {
			System.out.printf("A p�gina %d n�o existe. Tente buscar novamente.", busca);
		} else {
			this.paginaAtual = busca;
			System.out.printf("Voc� est� na p�gina: %d.\n", this.paginaAtual);
		}
	}

	public void mostrarPagina() {
		System.out.printf("\nVoc� est� na p�gina: %d.", this.paginaAtual);
	}

	public void mostrarDadosDoLivro() {
		System.out.printf("\nT�tulo do livro: %s\nAltor: %s\nVoc� est� na p�gina %d de %d.", this.titulo, this.altor, this.paginaAtual, this.totalDePaginas);
	}
}