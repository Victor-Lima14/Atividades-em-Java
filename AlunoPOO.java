import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AlunoPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Nome do aluno " + i + ": ");
            String nome = scanner.nextLine();
            listaAlunos.add(new Aluno(nome));
        }

        Curso curso = new Curso(listaAlunos);
        System.out.println("\nAlunos cadastrados:");
        curso.listarAlunos();

        scanner.close();
    }
}
