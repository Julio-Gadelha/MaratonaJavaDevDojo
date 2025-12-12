package DevDojoMaratonandoJava.EstruturasCondicionais;

import java.util.Scanner;

public class TorneioDeJiuJitsu {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Qual a sua idade?, para o torneio de BJJ");
       int age = input.nextInt();

       if (age < 15){
           System.out.println("Irá disputar a categoria infantil");
       } else if(age >= 15 && age <18){
           System.out.println("Irá disputar a categoria juvenil");
       } else{
           System.out.println("Irá disputar a categoria adulto");
       }
    }
}
