package Automovel;

// Definir Classe Caminhao que herda Veiculo
public class Caminhao extends Veiculo {

    // Construtor
    public Caminhao(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    // Implementação dos métodos abstratos
    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão está freando.");
    }
}
