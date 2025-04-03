public class FuncionarioPOO {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Victor Rafael Lima de Santana", 10000);
        System.out.println("\nSalário antes do aumento: " + funcionario.getSalario());
        funcionario.AumentarSalario(10);
        System.out.println("\nNome: " + funcionario.getNome());
        System.out.println("Salário após aumento: " + funcionario.getSalario());
    }
}
