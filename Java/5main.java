import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
     
        Scanner leia = new Scanner(System.in);
        float numero;
        
        System.out.print("Digite o número: ");
        numero = leia.nextInt();
if(numero > 0 ) {
    System.out.println("É positivo.");
    }
else if (numero < 0 ){
    System.out.println("É negativo.");
    }
else if (numero == 0 ){
    System.out.println("É zero.");
    }
    }
 } 