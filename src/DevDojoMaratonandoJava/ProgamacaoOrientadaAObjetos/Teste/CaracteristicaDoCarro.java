package DevDojoMaratonandoJava.ProgamacaoOrientadaAObjetos.Teste;

import DevDojoMaratonandoJava.ProgamacaoOrientadaAObjetos.dominio.Carros;

public class CaracteristicaDoCarro {
    public static void main(String[] args) {
        Carros carros1 = new Carros();
        Carros carros2 = new Carros();

        carros1.nome = "Golf Gti";
        carros1.modelo = "Black Piano";
        carros1.ano = 2006;

        carros2.nome = "Mercedes Amg A35 ";
        carros2.modelo = "Black Piano";
        carros2.ano = 2025;

        carros1 = carros2;

        System.out.println(carros1.nome + " " + carros1.modelo + " " + carros1.ano);
        System.out.println(carros2.nome + " " + carros2.modelo + " " + carros2.ano);
    }
}

