import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = input.nextLine();

        System.out.println("Qual seu endereço? ");
        String zipcode = input.nextLine();

        System.out.println("Qual é o seu salário? ");
        float wage = input.nextFloat();

        System.out.println("Qual a data que recebeu seu salário? ");
        String date  = input.nextLine();

        System.out.println("Eu " + nome + ", morando no endereço " + zipcode +
                ", confirmo que recebi o salário " + wage + " na data " + date);
    }
}
