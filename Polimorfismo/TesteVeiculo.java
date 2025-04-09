public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro(),
                new Moto(),
                new Caminhao()
        };

        for (Veiculo v : frota) {
            v.acelerar();
        }
    }
}
