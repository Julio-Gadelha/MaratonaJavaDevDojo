package DevDojoMaratonandoJava.IntroducaoMetodos.Test;

import DevDojoMaratonandoJava.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculo");
    }
}
