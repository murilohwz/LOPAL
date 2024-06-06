import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    int idade = 18;
    String carta = "sim";

    System.out.print("Digite sua idade: ");
    idade = leia.nextInt(); //Entrada de dados
    
  if(idade >= 18 && carta == "sim"){
    System.out.println("Pode votar!");
    }
  
  else{
    System.out.println("Não consegue... =(");
    }
  }
}
  