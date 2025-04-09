class Veiculo {
    void acelerar() {
        System.out.println("Veículo acelerando...");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Carro acelerando a 100 km/h");
    }
}

class Moto extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Moto acelerando a 120 km/h");
    }
}

class Caminhao extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Caminhão acelerando a 80 km/h");
    }
}
