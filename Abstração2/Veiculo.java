//Implemente um programa em Java que demonstre o conceito de abstração e herança.
//
//Requisitos:
//1. Crie uma classe abstrata chamada Veiculo com:
//○ Um atributo modelo (String).
//○ Um atributo capacidadePassageiros (int).
//○ Um atributo consumoCombustivel (double), representando quantos km/l o veículo faz.
//○ Um método abstrato mover(), que será implementado pelas subclasses.
//○ Um método exibirInfo(), que imprime os dados do veículo.
//
//2. Crie três subclasses:
//○ Carro, que ao se mover imprime "O carro está dirigindo na estrada." e tem um consumo médio de combustível.
//○ Ônibus, que ao se mover imprime "O ônibus está transportando
//passageiros pela cidade." e possui uma capacidade maior de passageiros.
//○ Avião, que ao se mover imprime "O avião está voando pelos céus." e consome mais combustível.
//
//3. No método main():
//○ Crie um vetor ou lista de veículos e adicione um objeto de cada subclasse.
//○ Percorra a coleção e chame mover() e exibirInfo() para cada veículo.
//○ Simule uma viagem de 300 km para cada veículo e exiba o
//combustível necessário para completar o percurso.

public abstract class Veiculo {

    protected String modelo;
    protected int capacidadePassageiros;
    protected double consumoCombustivel;

    public Veiculo(String modelo, int capacidadePassageiros, double consumoCombustivel){
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.consumoCombustivel = consumoCombustivel;
    }

    public abstract void mover();

    public void exibirInfo(){

        System.out.println("Modelo: " +modelo);
        System.out.println("Capacidade de Passageiros: " +capacidadePassageiros);
        System.out.println("Consumo de Combustivel: " +consumoCombustivel + "KM/L");
    }

    public double calculoCombustivel(double distancia){
        return distancia / consumoCombustivel;
    }
}