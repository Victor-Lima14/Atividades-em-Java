import java.util.Scanner;

public class AnimalPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cachorro: ");
        String nome = scanner.nextLine();

        Cachorro dog = new Cachorro(nome);
        dog.emitirSom();
        dog.abanarRabo();

        scanner.close();
    }
}
