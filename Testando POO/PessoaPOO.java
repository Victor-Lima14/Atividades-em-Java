import java.util.Scanner;

public class PessoaPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        Pessoa p = new Pessoa(nome);
        System.out.println("Nome: " + p.getNome());

        scanner.close();
    }
}
