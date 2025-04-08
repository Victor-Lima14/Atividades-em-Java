import java.util.List;

public class Curso {
    private List<Aluno> alunos;

    public Curso(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a.nome);
        }
    }
}
