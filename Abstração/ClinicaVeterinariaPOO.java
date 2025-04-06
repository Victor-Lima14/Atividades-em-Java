public class ClinicaVeterinariaPOO {

    public static void main(String[] args){

        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Whiskers");

        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();
    }
}