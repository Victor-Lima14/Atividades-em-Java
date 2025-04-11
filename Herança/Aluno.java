public class Aluno extends Pessoa {

    @Override
    void apresentar() {
        System.out.println("Olá, sou um aluno. Meu nome é " + nome);
    }
}