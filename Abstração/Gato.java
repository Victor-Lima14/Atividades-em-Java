//Classe Gato herda de Animal
public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("\n" +nome + " Faz: Miau Miau!");
    }
}
