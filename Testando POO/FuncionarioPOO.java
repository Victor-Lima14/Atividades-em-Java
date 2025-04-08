import java.util.Scanner;

public class FuncionarioPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        Funcionario f = new Programador(nome);
        System.out.println(f.nome + " vai receber R$ " + f.calcularSalario());

        scanner.close();
    }
}
