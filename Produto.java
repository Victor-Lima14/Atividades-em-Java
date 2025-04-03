public class Produto {
    //Atributos da classe
    private String nome;
    private double preco;
    private int estoque;

    //Metodo Constutor
    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    //Metodo para vender um produto
    public void vender(int quantidade){
        if(quantidade > estoque){
            System.out.println("Erro: Estoque insuficiente para a venda.");
        }else{
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        }
    }
    public void exibirInfo(){
        System.out.println("Produto:" + nome + " | Preço: R$" + preco +
                " | Estoque:" + estoque);
    }
}