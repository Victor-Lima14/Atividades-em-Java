//Implemente uma classe “ContaBancaria" que tenha os seguintes atributos e métodos:
//● Atributos: titular (String), saldo (double).
//● Construtor: deve receber o nome do titular e iniciar o saldo em zero.
//● Métodos:
//○ depositar(double valor): adiciona dinheiro à conta.
//○ sacar(double valor): subtrai dinheiro da conta, se houver saldo suficiente.
//○ getSaldo(): retorna o saldo atual da conta.
//○ getTitular(): retorna o nome do titular.
//
//Crie também uma classe Banco com um método main para testar a criação de contas, depósitos e saques.

public class ContaBancaria {

    private String titular;
    private double saldo = 0;
    private double depositar;
    private double sacar;

    public ContaBancaria(String titular, double saldo, double depositar, double sacar) {

        this.titular = titular;
        this.saldo = saldo;
        this.sacar = sacar;
        this.depositar = depositar;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getDepositar() {
        depositar = saldo + depositar;
        return depositar;
    }

    public double getSacar(){
        sacar = saldo - sacar;
        return sacar;
    }
}