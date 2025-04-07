//Criar uma classe abstrata chamada ContaBancaria
//● Atributos:
//● titular: Nome do cliente.
//● saldo: Saldo disponível na conta.
//● Métodos:
//● depositar(double valor): Adiciona o valor ao saldo.
//● sacar(double valor): Método abstrato que será implementado nas subclasses.
//● exibirInfo(): Método abstrato para exibir detalhes da conta.

public abstract class ContaBancaria {

    public String nome;
    public double saldo;

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(double valor){

        if(valor > 0){
            valor += saldo;
            System.out.println("O valor depositado foi: " +valor);
        }else{
            System.out.println("Valor Invalido.");
        }
    }

    public abstract void sacar(double valor);
    public abstract void exibirInfo();

}