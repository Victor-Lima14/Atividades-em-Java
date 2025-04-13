import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Central");

        System.out.print("Quantos livros deseja adicionar? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Título do livro " + (i+1) + ": ");
            String titulo = scanner.nextLine();

            System.out.print("Autor do livro " + (i+1) + ": ");
            String autor = scanner.nextLine();

            biblioteca.adicionarLivro(new Livro(titulo, autor));
        }

        biblioteca.listarLivros();
        scanner.close();
    }
}