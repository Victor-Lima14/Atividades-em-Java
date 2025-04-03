import java.util.Scanner;

public class ProdutoPOO {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in); // inserido
        //Criando um produto
        Produto produto = new Produto("Celular", 1500.00, 10);

        //Exibindo infomações iniciais
        produto.exibirInfo();

        //Realizar uma venda
        System.out.println("Digite a quantidade a vender"); // inserido
        int qtdVenda = scanner.nextInt(); // inserido
        produto.vender(qtdVenda);
        // produto.vender(11);
        produto.exibirInfo();

    }
}