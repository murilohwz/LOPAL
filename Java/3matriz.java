import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner leia = new Scanner(System.in);
  String [] [] clientes = new String [3] [4];
  
    System.out.print("Informe seu nome: ");
   clientes [0] [0] = leia.next();
    System.out.print("Informe seu endereço: ");
   clientes [0] [1] = leia.next(); 
   System.out.print("Informe seu cpf: ");
   clientes [0] [2] = leia.next(); 
   System.out.print("Informe seu telefone: ");
   clientes [0] [3] = leia.next(); 
    System.out.print("Informe seu nome: ");
   clientes [1] [0] = leia.next(); 
    System.out.print("Informe seu endereço: ");
   clientes [1] [1] = leia.next(); 
   System.out.print("Informe seu cpf: ");
   clientes [1] [2] = leia.next();
   System.out.print("Informe seu telefone: ");
   clientes [1] [3] = leia.next();
   System.out.print("Informe seu nome: ");
   clientes [2] [0] = leia.next(); 
   System.out.print("Informe seu endereço: ");
   clientes [2] [1] = leia.next();
   System.out.print("Informe seu cpf: ");
   clientes [2] [2] = leia.next();
   System.out.print("Informe seu telefone: ");
   clientes [2] [3] = leia.next();
   
    for (int i=0; i < 3; i++) {
        
    System.out.println ("Nome: " + clientes [i] [0]);
    System.out.println ("Endereço: " + clientes [i] [1]);
    System.out.println ("cpf: " + clientes [i] [2]);
    System.out.println ("cpf: " + clientes [i] [3]);
    System.out.println (); 
    }
  }
}

