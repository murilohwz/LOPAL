import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    int x = 0;
    int y= 0;

    System.out.print("Digite o primeiro número: ");
    x = leia.nextInt(); //Entrada de dados
    System.out.println("Digite o segundo número: ");
    y = leia.nextInt();
    
    if(x > y ){
    System.out.println(x);
    }
    else{
    System.out.println(y);
    }
  
  }
}
