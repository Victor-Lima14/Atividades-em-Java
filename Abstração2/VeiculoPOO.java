public class VeiculoPOO {

    public static void main(String[] args){

        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Fiat Uno", 5, 10.5);
        veiculos[1] = new Onibus("Mercedes-Benz", 25, 7.5);
        veiculos[2] = new Aviao("Air France", 150, 2.5);

        for (Veiculo veiculo : veiculos){
            System.out.println("\nInformações dos veículos:");
            veiculo.exibirInfo();
            System.out.println("Ação:");
            veiculo.mover();

            double distanciaViagem = 300;
            double calculoCombustível = veiculo.calculoCombustivel(distanciaViagem);
            System.out.printf("Para uma viagem de %.1f km, será necessário %.2f litros de combustivel.\n", distanciaViagem, calculoCombustível);
        }
    }
}