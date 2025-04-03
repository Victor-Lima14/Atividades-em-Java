//Crie uma classe Macaco
//
//A classe deve possuir os atributos nome do tipo String e estomago do tipo List<String>
//
//A classe deve possuir os métodos comer(alimento), verEstomago(), digerir()
//
//Faça um programa criando dois macacos, alimentando-os com 3 alimentos
//diferentes e verificando o conteúdo do estomago a cada refeição.
//
//Experimente fazer com que um macaco se alimente do outro, é possível fazer um macaco canibal?

import java.util.ArrayList;
import java.util.List;

public class Macaco {

    private String nome;
    private List<String> estomago;

    public Macaco(String nome) {
        this.nome = nome;
        this.estomago = new ArrayList<>();
    }

    public void comer(String alimento) {
        estomago.add(alimento);
        System.out.println(nome + " comeu " + alimento + ".");
    }

    public void verEstomago() {
        System.out.println(nome + " tem no estômago: " + estomago);
    }

    public void digerir() {
        estomago.clear();
        System.out.println(nome + " digeriu a comida. Estômago vazio.");
    }

    public void comer(Macaco outroMacaco) {
        System.out.println(nome + " está tentando comer " + outroMacaco.nome + "!");
    }
}
