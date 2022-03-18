package kindle;

public class Program {
	public static void main(String[] args) {
		Livro l1 = new Livro("Trabalhe, Sirva e Não encha o saco!", "Professor Izidro", 100);
		l1.buscar();
		l1.avancar();
		l1.mostrarDadosDoLivro();
	}
}
