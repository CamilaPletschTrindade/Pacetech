algoritmo "IMC"
var
altura, peso, imc : real
inicio
Escreval("Informe sua altura, por favor")
leia(altura)
Escreval("Informe seu peso, por favor")
leia(altura)

imc <- peso / altura ^ 2

se imc < 19 entao
   escreval("Abaixo do peso")
senao
   se imc < 24 entao
      escreval("Peso ideal")
   senao
      escreval("Acima do peso")

   fimse
fimse

fimalgoritmo
