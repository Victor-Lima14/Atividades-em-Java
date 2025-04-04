public class AnimalPOO {

    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Rex");
        System.out.println("Cachorro: " +cachorro.nome);
        System.out.println(cachorro.latir());
        System.out.println(cachorro.caminhar());

        Gato gato = new Gato("Tom");
        System.out.println("\nGato: " +gato.nome);
        System.out.println(gato.miar());
        System.out.println(gato.caminhar());
    }
}