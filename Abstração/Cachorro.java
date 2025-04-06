//Classe Cachorro herda de Animal
public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " Faz: Au Au!");
    }
}