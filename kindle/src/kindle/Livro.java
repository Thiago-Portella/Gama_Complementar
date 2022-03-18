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
		System.out.printf("Você está na página: %d.", this.paginaAtual);
	}

	public void retroceder() {
		this.paginaAtual--;
		System.out.printf("Você está na página: %d.", this.paginaAtual);
	}

	public void buscar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a página a ser pesquisada.");
		int busca = teclado.nextInt();
		teclado.close();
		if (busca > this.totalDePaginas || busca < 1) {
			System.out.printf("A página %d não existe. Tente buscar novamente.", busca);
		} else {
			this.paginaAtual = busca;
			System.out.printf("Você está na página: %d.\n", this.paginaAtual);
		}
	}

	public void mostrarPagina() {
		System.out.printf("\nVocê está na página: %d.", this.paginaAtual);
	}

	public void mostrarDadosDoLivro() {
		System.out.printf("\nTítulo do livro: %s\nAltor: %s\nVocê está na página %d de %d.", this.titulo, this.altor, this.paginaAtual, this.totalDePaginas);
	}
}