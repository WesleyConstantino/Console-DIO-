import java.util.*;

public class Desafio {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          
          int n1, n2;
          
              System.out.println("Digite 2 números: ");
              n1 = scan.nextInt();
              n2 = scan.nextInt();

         if(n1 == n2){
           System.out.println("Sao iguais! ");
         }
        else{
          System.out.println("Nao sao iguais! ");
        }

    }
}
