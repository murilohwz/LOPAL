programa {
  funcao inicio() {
    real not1, not2, not3
    real media, m1, m2, m3, m4, mf
    inteiro soma

   escreva("Qual � a nota da primeira avalia��o?: ")
   leia(not1)
   escreva("Qual � a nota da segunda avalia��o?: ")
   leia(not2)
   escreva("Qual � a nota da terceira avalia��o?: ")
   leia(not3)

   escreva("A primeira avalia��o possui peso 2, a segunda avalia��o possu� peso 3 e a terceira avalia��o possu� peso 6")
   
   media= not1 + not2 + not3 /3
   m1= not1 * 2
   m2= not2 * 3
   m3= not3 * 6
    mf= m1+ m2 + m3 /media 
    limpa()

    escreva("A m�dia final �: ", mf)
  }
}
