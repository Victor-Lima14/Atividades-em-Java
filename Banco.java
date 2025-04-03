public class Banco {

    public static void main(String[] args){

        ContaBancaria conta1 = new ContaBancaria("Victor", 5000, 2000, 0);
        System.out.println("O nome do Usuario, seu Saldo, Quantidade para Deposito e Quantidade para Saque são: " +"\n" +conta1.getTitular() +"\n" +conta1.getSaldo() +"\n" +conta1.getDepositar() +"\n" +conta1.getSacar());
    }
}