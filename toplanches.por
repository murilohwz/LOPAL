programa {
  funcao inicio() {
     inteiro opcao, pagamento

      escreva("1)Hot Dog\n")
      escreva("2)Hot Dog 3 queijos\n")
      escreva("3)Bauruzao\n")
      escreva("4)X Salada\n")
      escreva("5)X Egg\n")
      escreva("6)X Calabacon\n")
      escreva("7)X Frangao\n")
      escreva("8)X Churrascao\n")
      escreva("9)X Linguiça Top\n")
      escreva("10)X Burger\n") 
      escreva("11)promocao\n")

     escreva("escolha uma opção:")
     
     leia(opcao)
     limpa()

escolha (opcao) 
{
caso 1: 
escreva("3 salsichas, tomate, batata palha catchup")
pare
caso 2: 
escreva("salsicha, bacon, calabresa, mussarela, catupiri, cheddar, tomate, batata palha, maionese, catchup")
pare 
caso 3: 
escreva("presunto, mussarela, cheddar, calabresa, bacon, tomate, batata palha, maionese, catchup ")
pare
caso 4:
 escreva("hamburgao top, mussarela, cheddar, alface, tomate, maionese, catchup, batata palha ")
pare
caso 5:
 escreva("hamburgao top, 2 ovos, mussarela, cheddar, tomate, maionese, catchup, batata palha")
pare
caso 6:
 escreva("hamburgao top, bacon, calabresa, mussarela, cheddar, tomate, maionese, catchup, batata palha")
pare
caso 7:
 escreva("200g de peito de frango, mussarela, cheddar, tomate, maionese, catchup, batata palha")
pare
caso 8:
 escreva("200g de carne bovina, mussarela, cheddar, maionese, tomate, catchup, batata palha")
pare 
caso 9:
 escreva("linguica, mussarela, cheddar, tomate, batata palha, maionese, catchup")
pare
caso 10:
 escreva("hamburger, mussarela, catupiry, batata palha, catchup, molho")
pare 
caso 11:
 escreva("batata frita, cheddar, calabresa, bacon")
pare 
caso contrario: 
escreva("opção invalida!")
} 
escreva("\n\n")
escreva(" pix\n")
escreva(" dinheiro\n")
escreva(" cartao de credito\n")
escreva(" cartao de debito\n") 
escreva("escolha sua forma de pagamento, o preço é R$12: \n")

leia(pagamento)
limpa() 

escreva("seu pedido está sendo preparado, aguarde! \n")

    }
}
