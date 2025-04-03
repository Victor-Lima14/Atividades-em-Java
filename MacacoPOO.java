public class MacacoPOO {

    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Chico");
        Macaco macaco2 = new Macaco("Moedas");

        macaco1.comer("Banana");

        macaco1.verEstomago();

        macaco1.comer("Maçã");

        macaco1.verEstomago();

        macaco1.comer("Morango");

        macaco1.verEstomago();
        macaco1.digerir();
        macaco1.verEstomago();
        System.out.println("\n");

        macaco2.comer("Laranja");

        macaco2.verEstomago();

        macaco2.comer("Melancia");

        macaco2.verEstomago();

        macaco2.comer("Manga");

        macaco2.verEstomago();
        macaco2.digerir();
        macaco1.verEstomago();
        System.out.println("\n");

        macaco1.comer(macaco2);
        macaco2.comer(macaco1);
    }
}
