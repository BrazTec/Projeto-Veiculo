package Automovel;

// Definir Classe Carro que herda Veiculo
public class Carro extends Veiculo {

    // Construtor
    public Carro(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    // Implementação dos métodos abstratos
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}