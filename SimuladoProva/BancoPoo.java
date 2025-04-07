//Criar uma classe principal BancoPOO com um método main()
//● Criar objetos das classes ContaCorrente e ContaPoupanca.
//● Armazenar as contas em um array de ContaBancaria (polimorfismo).
//● Simular operações de depósito, saque e exibição de informações par ambas as contas.

public class BancoPoo {
    public static void main(String[] args) {
        ContaBancaria[] contas = {
                new ContaCorrente("Victor"),
        new ContaPoupanca("Diego")
};

        contas[0].depositar(5000);
        contas[0].sacar(4000);
        contas[0].exibirInfo();

        contas[1].depositar(6000);
        contas[1].sacar(100);
        contas[1].exibirInfo();
    }
}