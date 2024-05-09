import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
     double limiteDiario = scanner.nextDouble();
     double subtrai = 0.0;


     for (int i = 0; i < 1000;i++ ){
         double saque = scanner.nextDouble();
         if(saque == 0) {
             System.out.println("Transacoes encerradas.");
             i = 1001;
             break;
         }
         if(saque <= limiteDiario){
             subtrai = limiteDiario - saque;
             System.out.println("Saque realizado. Limite restante: "+ subtrai);              
         }
         else {
             System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
             break;
         }  
 }
 scanner.close(); 

}
}