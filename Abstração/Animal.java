//O sistema deve seguir os seguintes requisitos:
//● Deve haver uma classe abstrata chamada Animal, que contém:
//○ Um atributo nome.
//○ Um método abstrato emitirSom(), que será implementado por cada animal específico.
//○ Um método concreto dormir(), que exibe uma mensagem indicando que o animal está dormindo.
//
//● Os animais devem ser representados por classes concretas, como
//Cachorro e Gato, que herdam de Animal e implementam emitirSom() de maneira específica.
//● A classe principal ClinicaVeterinariaPOO deve testar os objetos e
//demonstrar o comportamento de cada animal.
//
//Implemente o sistema descrito acima utilizando herança e abstração. Crie
//a classe principal que instancia os objetos Cachorro e Gato, chamando
//seus respectivos métodos.

//Classe Abstrata Animal
public abstract class Animal {

    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }
    //Metodo abstrato(Cada animal implementa de forma diferente)
    public abstract void emitirSom();

    //Metodo concreto
    public void dormir(){
        System.out.println(nome + " está dormindo...");
    }
}
