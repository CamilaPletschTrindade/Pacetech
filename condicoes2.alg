algoritmo "Condições Parte 2"

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

Escreval("Média: ")
Escreval(media)

se media >= 7 entao
   Escreval("Você passou com a media:", media)
senao
   se media < 5 entao
      Escreval("Você reprovou com a media:", media)
   senao
      Escreval("Você está de recuperação com a media:", media)
   fimse
fimse
fimalgoritmo
