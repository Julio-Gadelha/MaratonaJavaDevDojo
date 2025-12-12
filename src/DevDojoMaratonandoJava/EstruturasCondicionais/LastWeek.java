package DevDojoMaratonandoJava.EstruturasCondicionais;

public class LastWeek {
   public  static void main(String[] args) {
       byte days = 19 ;

       switch (days){
           case 2,3,4,5,6:
               System.out.println("Dias uteis ");
               break;
           case 1,7:
               System.out.println("Finais de semana");
               break;
           default:
               System.out.println("Esses dias não existem ainda!");
               break;
       }

    }
}
