algoritmo "Condi��es Parte 2"

var
nota1, nota2, nota3, media: real
inicio
Escreval("Informe a nota 1:")
leia(nota1)
Escreval("Informe a nota 2:")
leia(nota2)
Escreval("Informe a nota 3:")
leia(nota3)

media <- (nota1 + nota2 + nota3)/3

Escreval("M�dia: ")
Escreval(media)

se media >= 7 entao
   Escreval("Voc� passou com a media:", media)
senao
   se media < 5 entao
      Escreval("Voc� reprovou com a media:", media)
   senao
      Escreval("Voc� est� de recupera��o com a media:", media)
   fimse
fimse
fimalgoritmo
