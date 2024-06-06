import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    float nota1, nota2,nota3; 
    String Aprovação = "sim";
    float media ;
    

    System.out.print("Digite sua Nota 1: ");
    nota1 = leia.nextInt();
    System.out.print("Digite sua Nota 2: ");
    nota2 = leia.nextInt(); 
    System.out.print("Digite sua Nota 3: ");
    nota3 = leia.nextInt(); 
    media=nota1+nota2+nota3/3;
    
    
    
    
  if(media >= 7 && Aprovação == "sim"){
    System.out.println("Você foi aprovado! Média:"+ media) ;
    }
  
  else{
    System.out.println("Não conseguiu ser aprovado. Boa sorte na próxima... =("+media);
    }
  }
}
