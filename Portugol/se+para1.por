programa {
  funcao inicio() {
    //anota��es

    cadeia candidatos, nomes [0] //na programa��o, come�a a contar a partir do 0, ou seja, 10 equivale a 11, 9 equivale a 10 e assim em diante
    cadeia candidato
    inteiro n, i 
    //i, usado na condi��o se
    escreva("quantos candidatos haver�o na elei��o ")
    leia(n)

    se (n>1) {
      para (i = 0; i < n; i++) {// i = i + 1 
      escreva("qual o nome do candidato",i+1,"candidato")
      leia (candidato)
      nomes[i] = candidato 
      // n-- // ou n = n - 1

      }
    }
    senao{
      escreva("valor invalido")
    }

    escreva("\n", nomes[0])
    
  }
}
