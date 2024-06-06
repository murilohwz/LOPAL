# lpa

##Lógica de Programação e Algortimos

Trabalho sobre os principais recursos da programação sobre o desenvolvimento de sistemas

## 1Variáveis
Variáveis na programação são objetos que ao longo do algoritmo pode variar seu valor. O nome “variável” é utilizado por ser um tipo de conteúdo que pode apresentar diferentes valores enquanto o sistema está em execução. 
exemplo:
Algoritmo "Teste de Variável"
Declaração das variáveis
   nome : Texto
Inicio
   nome <- “João”
   imprimir(nome)
   nome <- “Maria”
   imprimir(nome)
Fim 
## 2Constantes
Constantes são na programação o contrário das variáveis, ou seja, é algo que não muda, tem seu valor fixo do início ao fim 
exemplo:
algoritmo pi;
 
inicio
 
//DECLARAÇÃO DE VARIÁVEIS
real PI = 3.14;
real x;
real result;
 
// ESCREVA UMA MENSAGEM NA TELA
escreva ( “por favor, digite o valor do número x”) ;
 
// LE VALORES DO TECLADO DIGITADOS PELO USUÁRIO E ARMAZENA NA VARIÁVEL
leia (x);
 
// REALIZA UMA OPERAÇÃO MATEMÁTICA
result <-- x * PI;
 
escreva (“ o resultado é:”, result);
 
fim
## 3Operadores
Operadores são símbolos especiais que representam computações como adição, multiplicação e divisão. Os valores sobre os quais o operador trabalha são chamados de operandos
exemplo:
+, -	Soma / Subtração	a+b
*, /	Multiplicação / Divisão	x * 2 Soma / 3

## 4Atribuição
Em Ciência da Computação o comando de atribuição define ou redefine o valor armazenado no local de armazenamento indicado por um nome de variável. Na maioria das linguagens de programação imperativas o comando de atribuição é uma das declarações básicas.
exemplo:
a := 3
• Valor1 := 1.5
• Valor2 := Valor1 + a
• nome_do_aluno := "José da Silva"
• sinalizador := FALSO

## 5Aritméticos
Os operadores aritméticos têm a função de realizar operações matemáticas dentro de um programa. Eles permitem que os programadores realizem cálculos, manipulem valores numéricos e realizem operações básicas
exemplo:
Adição (+): utilizado para somar valores.
Subtração (-): utilizado para subtrair valores.
Multiplicação (*): utilizado para multiplicar valores.
Divisão (/): utilizado para dividir valores.
Módulo (%): utilizado para obter o resto de uma divisão.
## 6Lógicos
Os operadores lógicos são elementos fundamentais da linguagem de programação. Eles permitem realizar operações de comparação e combinação de valores booleanos, ou seja, valores que podem ser verdadeiros ou falsos.
=	maior ou igual a	5 >= 4 = V
<=	menor ou igual a	5 <= 4 = F
<>	diferente de	5 <> 4 = V
==	igual a	5 == 4 = F
## 7Condicionais
As estruturas condicionais permitem que um programa execute diferentes comandos de acordo com as condições estabelecidas. Elas estão presentes em diversas linguagens de programação e todo profissional da área precisa saber como utilizá-las.
- Simples
== : igualdade. ! = : diferente.
> : maior que. < : menor que.
>= : maior ou igual que. <= : menor ou igual que.

- Composta
Expõe que uma instrução ou bloco de instruções só sejam executados se determinada condição for satisfeita. Caso essa condição seja falsa, é executada uma outra instrução ou um bloco de instruções diferente.
se (condição)
 então <comando1>
 senão <comando2>
fim-se 

- Encadeada
É uma estrutura de decisão que permite a execução de diferentes blocos de código com base em múltiplas condições. Ou seja, permite seja executado um bloco de código se uma condição for atendida e outro bloco de código se outra condição for atendida, e assim por diante
double livroLinux;
double livroBancosDados;
livroLinux = 78.60;
livroBancosDados = 56.75;
double total = livroLinux + livroBancosDados;
System.out.println("O preço total é " + total );

if (total < 120.00 ) {
    System.out.println("O preço está bom!");
}
else if (total > 180.00 ){
    System.out.println("Livros muito caros!");
}
else {
    System.out.println("Preço razoável.");
}


## 8Laços de Repetição
Laços de repetição, também conhecidos como loops, são estruturas de controle fundamentais em programação que permitem a execução repetida de um bloco de código.
- Contador(for)
Define a variável de iteração para cada valor em uma lista, array ou string fornecida e repete o código no corpo do laço for para cada valor da variável de iteração.
//estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}

- Condicional(while)
É usada quando não sabemos quantas vezes um determinado bloco de instruções precisa ser repetido. Com ele, a execução das instruções vai continuar até que uma condição seja verdadeira.
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}


## 9Vetores
Os vetores são tipos que permitem o armazenamento de uma coleção de valores do mesmo tipo, ou seja, os vetores são estruturas de dados homogêneas (formados por elementos de mesmo tipo) e unidimensionais.
exemplo:
 mport java.util.Scanner;

public class exSomaVet {
  public static void main(String[] args) throws Exception{
      double soma, media;

      Scanner sc = new Scanner(System.in);
      System.out.print("Quantos numeros vai digitar: ");
      double valor = sc.nextDouble();
      double vet[] = new double[(int) valor];

      for(int i = 0; i < valor; i++){
          System.out.print("Digite o[" + i+1 +"º] elemento: ");
          vet[i] = sc.nextDouble();
      }
      System.out.println();
      soma = 0;
      media = 1;
      for(int i = 0; i < valor; i++){
          System.out.println("Valores digitados: " + String.format("%.2f", vet[i]));
          soma += vet[i];
          media = soma / valor;
      }
      System.out.println();
      System.out.println("A soma dos valores é: " + soma);
      System.out.println("A médoia dos valores é: " + media);
      sc.close();
  }
}









## 10Matrizes
Uma matriz é um tipo de dado usado para representar uma certa quantidade de variáveis de valores homogêneos. Uma matriz é uma série de variáveis do mesmo tipo referenciadas por um único nome, onde cada variável é referenciada através de um índice entre colchetes.
exemplo:
String[] seasons = new String[4]; /* Declare and create an array. Java allocates memory for an array of 4 strings, and each cell is set to null (since String is a reference type) */

seasons[0] = "Winter"; /* We set the first cell, i.e. the cell with index zero, to "Winter". Here we access the zeroth element of the array and write a specific value to it. */
seasons[1] = "Spring"; // We follow a similar procedure for the cell with index 1 (the second cell)
seasons[2] = "Summer"; // ... index 2
seasons[3] = "Autumn"; // and finally, index 3


 
