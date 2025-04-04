public class CarroPOO {
    public static void main(String [] args){
        Carro meucarro = new Carro("Fusca", "1.6 Turbo");

        Roda roda1 = new Roda("Pirelli");
        Roda roda2 = new Roda("Pirelli");
        Roda roda3 = new Roda("Pirelli");
        Roda roda4 = new Roda("Pirelli");

        meucarro.adicionarRoda(roda1);
        meucarro.adicionarRoda(roda2);
        meucarro.adicionarRoda(roda3);
        meucarro.adicionarRoda(roda4);

        meucarro.ligarCarro();
    }
}