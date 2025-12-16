package DevDojoMaratonandoJava.IntroducaoMetodos.Test;

import DevDojoMaratonandoJava.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2 ;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro CalculadoraTest05");
        System.out.println(num1);
        System.out.println(num2);
    }
}
