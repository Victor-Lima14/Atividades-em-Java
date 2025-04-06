public class Carro extends Veiculo{

    public Carro(String modelo, int capacidadePassageiros, double consumoCombustivel){
        super(modelo, capacidadePassageiros, consumoCombustivel);
    }

    @Override
    public void mover(){
        System.out.println(" O carro está dirigindo na estrada.");
    }
}