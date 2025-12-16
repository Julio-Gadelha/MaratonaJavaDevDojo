package DevDojoMaratonandoJava.IntroducaoMetodos.Test;

import DevDojoMaratonandoJava.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros2(30,3);
        System.out.println(result);
    }
}
