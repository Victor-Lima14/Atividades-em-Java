// Você foi contratado por uma fabricante de automóveis para desenvolver um
//sistema básico que modele um carro, destacando a relação entre seus componentes.

//Requisitos:
//1. Classe Motor - Deve ser parte essencial do carro (Composição).
// Sem o motor, o carro não existe.
//
//2. Classe Roda - Deve ser agregada ao carro (Agregação). O carro depende das rodas,
// mas uma roda pode ser reaproveitada em outro carro.
//
//3. Classe Carro - Deve ter métodos para ligar o carro, exibir o status do motor e das rodas.
//
//Com base nos conceitos de agregação e composição, implemente as classes Motor, Roda e Carro,
//e desenvolva um programa que:
//● Crie um carro com um motor e quatro rodas.
//● Mostre uma mensagem se o carro está ligado.

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private Motor motor; //Composição
    private List<Roda> rodas; //Agregação

    public Carro(String modelo, String tipoMotor){
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor);
        this.rodas = new ArrayList<>();
    }

    public void adicionarRoda(Roda roda){
        rodas.add(roda);
    }

    public void ligarCarro(){
        System.out.println("Carro modelo " + modelo + " está ligado...");

        motor.ligar();

        if(rodas.size() == 4){
            System.out.println("Carro pronto para rodar com as 4 rodas da marca: ");
            for (Roda roda : rodas){
                System.out.println("-" + roda.getMarca());
            }
        }else {
            System.out.println("Carro Incompleto! Adicione 4 rodas.");
        }
    }
}