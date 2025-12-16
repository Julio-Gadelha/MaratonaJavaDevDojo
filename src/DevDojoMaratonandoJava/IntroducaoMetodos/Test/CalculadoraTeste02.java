package DevDojoMaratonandoJava.IntroducaoMetodos.Test;

import DevDojoMaratonandoJava.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(40, 2);
        System.out.println(result);
    }
}
