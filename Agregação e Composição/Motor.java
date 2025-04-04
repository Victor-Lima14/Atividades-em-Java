public class Motor { // Classe motor(composição) - Relação FORTE
    private String tipo;

    public Motor(String tipo){
        this.tipo = tipo;
    }

    public void ligar(){
        System.out.println("Motor: " + tipo + " Ligado");
    }
}