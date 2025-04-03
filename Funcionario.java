//Crie uma classe Funcionário
//
//A classe deve possuir os atributos nome do tipo String e salario do tipo double
//
//A classe deve possuir os métodos getNome e setSalario e aumentarSalario
// que recebe como parametro um percentualDeAumento
//
//Faça o teste da classe

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void AumentarSalario(double PorcentualDeAumento){

        if(PorcentualDeAumento > 0){
            this.salario += this.salario * (PorcentualDeAumento / 100);
        }
    }

    public double getSalario(){
        return salario;
    }
}
