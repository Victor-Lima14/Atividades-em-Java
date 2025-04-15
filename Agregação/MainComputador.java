import java.util.Scanner;

public class MainComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Modelo da CPU: ");
        String modelo = scanner.nextLine();

        System.out.print("Quantidade de RAM (GB): ");
        int ram = scanner.nextInt();

        Computador pc = new Computador(modelo, ram);
        pc.exibirEspecificacoes();

        scanner.close();
    }
}