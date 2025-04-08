public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("AU AU");
    }

    public String getNome() {
        return nome;
    }
}