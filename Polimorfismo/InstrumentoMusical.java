//O objetivo desse sistema é permitir que os professores toquem virtualmente
//cada instrumento, sem precisar saber antecipadamente qual será escolhido.
//Para isso, seu programa deve demonstrar o conceito de polimorfismo de
//sobrescrita, onde cada instrumento toca de maneira diferente.

//Requisitos
//1. Criar uma classe base chamada InstrumentoMusical, contendo um
//método tocar(), que imprime "O instrumento está tocando".
//2. Criar três subclasses (Violão, Piano, Bateria) que sobrescrevem o
//método tocar() com mensagens específicas para cada instrumento.
//3. Cria a classe principal InstrumentoMusicalPOO
//4. No método main(), crie um vetor ou lista de InstrumentoMusical e adicione
//um objeto de cada subclasse.
//5. Utilizar uma lista ou vetor para armazenar os instrumentos e percorrê-los
//chamando tocar(), ou seja, percorra a coleção e chame tocar() para cada
//instrumento, demonstrando o polimorfismo.

public class InstrumentoMusical {

    public void tocar(){
        System.out.println("O instrumento está tocando");
    }
}