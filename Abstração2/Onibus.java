public class Onibus extends Veiculo {

    public Onibus(String modelo, int capacidadePassageiros, double consumoCombustivel) {
        super(modelo, capacidadePassageiros, consumoCombustivel);
    }

    @Override
    public void mover(){
        System.out.println(" O ônibus está transportando passageiros pela cidade.");
    }
}