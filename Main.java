import Automovel.Carro;
import Automovel.Moto;
import Automovel.Caminhao;

public class Main {
    public static void main(String[] args) {
        Carro Carro1=new Carro("Toyota", "Corola",2020,"Preto");
        Carro1.setVIN("ASD158987DDA");
        System.out.println("O VIN do carro é "+ Carro1.getVIN());
        Carro1.acelerar();
        Carro1.frear();

        System.out.println();

        Moto Moto1=new Moto("Honda","CG160",2015,"Vermelha");
        Moto1.setVIN("5557741AVECT");
        System.out.println("O VIN da moto é "+ Moto1.getVIN());
        Moto1.acelerar();
        Moto1.frear();

        System.out.println();

        Caminhao Caminhao1=new Caminhao("Volvo","Chibata", 2024,"Branco");
        Caminhao1.setVIN("79ASDF8V45G6E");
        System.out.println("O VIN do Caminhão é "+ Caminhao1.getVIN());
        Caminhao1.acelerar();
        Caminhao1.frear();
    }
}
