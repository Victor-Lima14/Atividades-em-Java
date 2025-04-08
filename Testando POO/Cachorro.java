public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void abanarRabo() {
        System.out.println(getNome() + " está abanando o rabo");
    }
}
