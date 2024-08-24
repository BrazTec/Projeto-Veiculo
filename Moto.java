package Automovel;

// Definir Classe Moto que herda Veiculo
public class Moto extends Veiculo {

    // Construtor
    public Moto(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    // Implementação dos métodos abstratos
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}
