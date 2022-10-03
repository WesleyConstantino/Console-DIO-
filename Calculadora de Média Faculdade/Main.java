import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

//variáveis
    double prova1;
    double prova2;
    double moodle;
    double participacao;
    
//prova1    
    System.out.println("Digite a nota da avaliação intermediária 1:");
    prova1 = scan.nextDouble();
    
    while(prova1 < 0 || prova1 > 10) {
          System.out.println("Nota inválida! Digite novamente a nota da avaliação intermediária 1:");
    prova1 = scan.nextDouble();
    }
    
//prova2
    System.out.println("Digite a nota da avaliação intermediária 2:");
    prova2 = scan.nextDouble();

        while(prova2 < 0 || prova2 > 10) {
          System.out.println("Nota inválida! Digite novamente a nota da avaliação intermediária 2:");
    prova2 = scan.nextDouble();
    }

//moodle
    System.out.println("Digite a nota do moodle:");
    moodle = scan.nextDouble();

        while(moodle < 0 || moodle > 10) {
          System.out.println("Nota inválida! Digite novamente a nota do moodle:");
    moodle = scan.nextDouble();
    }
    
//participação    
    System.out.println("Digite a nota de participação:");
    participacao = scan.nextDouble();

        while(participacao < 0 || participacao > 1) {
          System.out.println("Nota inválida! Digite novamente a nota de participação:");
    participacao = scan.nextDouble();
    }

//cálculos finais    
    double n1 = (prova1 + prova2)/2;
    double mediaFinal = (n1 * 6 + moodle * 4)/10 + participacao;

    if(mediaFinal > 10){
       mediaFinal = 10;
    }

//saída
    if(mediaFinal < 6){
    System.out.println("A sua média final do semestre foi "+ mediaFinal +", você ainda  não atingiu a média necessaria para passar.");
      }
  else{
        System.out.println("A sua média final do semestre foi "+ mediaFinal +", parabéns, você foi aprovado!.");
  }
  }
}
