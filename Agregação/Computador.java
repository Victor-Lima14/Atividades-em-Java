public class Computador {
    private CPU cpu;
    private int ramGB;

    public Computador(String modeloCPU, int ramGB) {
        this.cpu = new CPU(modeloCPU);
        this.ramGB = ramGB;
    }

    public void exibirEspecificacoes() {
        System.out.println("CPU: " + cpu.getModelo() + ", RAM: " + ramGB + "GB");
    }
}
