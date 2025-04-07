//Criar duas subclasses de ContaBancaria
//● ContaCorrente:
//● Possui um limite especial de R$ 500.
//● O saque pode ser realizado mesmo que o saldo fique negativo até esse limite.

public class ContaCorrente extends ContaBancaria {
    private double limite = 500;
    public ContaCorrente(String nome){
        super(nome);
    }

    @Override
    public void sacar(double valor){
        if(valor <= saldo + limite) {
            valor -= saldo;
            System.out.println("O valor do saque foi:" +valor);
        }
    }
    @Override
    public void exibirInfo(){
        System.out.println("O nome do titular é:"  + nome + "\n" + "O saldo do titular é:" + saldo + "\nLimite:"  + limite);
    }
}