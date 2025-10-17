algoritmo "IdadeUsuario"
// Função: Calcular a idade do usuário com base no ano de nascimento e ano atual
// Repetir enquanto a pessoa quiser continuar
var
   anoAtual, anoNascimento, idade, i: inteiro
 
inicio
   repita
      escreva("Digite o ano de nascimento: ")
      leia(anoNascimento)
 
      escreva("Digite o ano atual: ")
      leia(anoAtual)
 
      idade <- anoAtual - anoNascimento
 
      escreval("A idade é: ", idade)
 
      escreval("Deseja continuar? 1 - Continuar / 0 - Sair")
      leia(i)
   ate (i <> 1)
