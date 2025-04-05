public class InstrumentoMusicalPOO {

    public static void main(String[] args){

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];

        instrumentos[0] = new Violao();
        instrumentos[1] = new Piano();
        instrumentos[2] = new Bateria();

        for(InstrumentoMusical musical : instrumentos) {
            musical.tocar();
        }
    }
}