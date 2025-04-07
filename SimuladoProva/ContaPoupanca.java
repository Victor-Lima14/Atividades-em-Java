//ContaPoupanca:
//● Não pode ficar com saldo negativo.
//● Aplica um bônus de 0.5% sobre o saldo toda vez que for feito um depósito.

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String nome){
        super(nome);
    }

    @Override
    public void sacar(double valor){
        if(valor <= saldo){
            valor -= saldo;
            System.out.println("\nO valor sacado foi: " +valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor){
        double bonus = valor * 0.005;
        System.out.println("\nO valor do deposita: " + valor + "\nBonus: " + bonus);
    }

    @Override
    public void exibirInfo(){
        System.out.println("O nome do titular é: " + nome + "\n" + "O saldo do titular é: " + saldo);
    }
}