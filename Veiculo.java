package Automovel;

// Definir Classe abstrata Veiculo
public abstract class Veiculo {
    // Atributos
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    private String VIN;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Getters e Setters
    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    // Métodos abstratos
    public abstract void acelerar();
    public abstract void frear();
}

