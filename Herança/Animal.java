//Usando HERANÇA

public class Animal {

    protected String nome;
    protected String raca;

    public Animal(String nome){
        this.nome = nome;
    }
    public String caminhar(){
        return "Passeando";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca(){
        return nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
}