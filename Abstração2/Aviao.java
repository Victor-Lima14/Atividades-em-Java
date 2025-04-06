public class Aviao extends Veiculo{

    public Aviao(String modelo, int capacidadePassageiros, double consumoCombustivel) {
        super(modelo, capacidadePassageiros, consumoCombustivel);
    }

    @Override
    public void mover(){
        System.out.println(" O avião está voando pelos céus.");
    }
}