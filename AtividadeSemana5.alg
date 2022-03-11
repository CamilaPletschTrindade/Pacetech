algoritmo "AtividadeSemana5"
// Função : Conversão
// Autor : Camila Pletsch
// Data : 11/03/2022
// Seção de Declarações
var
horaMedicao, fahrenheit, celsius, tempCelsius, tempFahrenheit: vetor [1..4] de real
i: inteiro
continuar: inteiro
escolher: inteiro

procedimento ordenaTemperaturaEHoraFahrenheit()
var
i, j: inteiro
aux: vetor[1..4] de real
inicio
para i de 1 ate 4 faca
   Escreval("Digite a temperatura em Celsius")
   leia(celsius[i])
   tempFahrenheit[i] <- (celsius[i] * 1.8) + 32
   Escreval("Digite o horário que foi medido")
   leia(horaMedicao[i])
fimpara

para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se celsius[j] > celsius[i] entao
         aux[i]<-celsius[i]
         celsius[i] <- celsius[j]
         celsius[j] <- aux[i]
      fimse
      se tempFahrenheit[j] > tempFahrenheit[i] entao
         aux[i]<-tempFahrenheit[i]
         tempFahrenheit[i] <- tempFahrenheit[j]
         tempFahrenheit[j] <- aux[i]
      fimse
      se horaMedicao[j] > horaMedicao[i] entao
         aux[i]<-horaMedicao[i]
         horaMedicao[i] <- horaMedicao[j]
         horaMedicao[j] <- aux[i]
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
   escreval("Temperatura de ", celsius[i], "graus celsius registrada as ", horaMedicao[i], " horas corresponde a ", tempFahrenheit[i], " graus Fahrenheit")
fimpara
fimprocedimento

procedimento ordenaTemperaturaEhoraCelsius()
var
i, j: inteiro
aux: vetor[1..4] de real
inicio
para i de 1 ate 4 faca
   Escreval("Digite a temperatura em Fahreneit:")
   leia(fahrenheit[i])
   tempCelsius[i] <- (fahrenheit[i] - 32)/1.8
   Escreval("Digite o horário que foi medido:")
   leia(horaMedicao[i])
fimpara

para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se fahrenheit[j] > fahrenheit[i] entao
         aux[i]<-fahrenheit[i]
         fahrenheit[i] <- fahrenheit[j]
         fahrenheit[j] <- aux[i]
      fimse
      se tempCelsius[j] > tempCelsius[i] entao
         aux[i]<-tempCelsius[i]
         tempCelsius[i] <- tempCelsius[j]
         tempCelsius[j] <- aux[i]
      fimse
      se horaMedicao[j] > horaMedicao[i] entao
         aux[i]<-horaMedicao[i]
         horaMedicao[i] <- horaMedicao[j]
         horaMedicao[j] <- aux[i]
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
   escreval("Temperatura de ", fahrenheit[i], "graus Fahrenheit registrada as ", horaMedicao[i], " horas corresponde a ", tempCelsius[i], " graus Celsius")
fimpara
fimprocedimento

inicio
continuar <- 1
enquanto continuar = 1 faca
   Escreval("Escolha:")
   Escreval("1 - Converter Celsius para Fahrenheit")
   Escreval("2 - Converter Fahrenheit para Celsius")
   leia(escolher)
   se escolher = 1 entao
      ordenaTemperaturaEHoraFahrenheit()
      senao
      se escolher = 2 entao
      ordenaTemperaturaEhoraCelsius()
      fimse
   fimse

   Escreval("Deseja realizar uma nova conversão?")
   Escreval("Digite 1 para nova conversão")
   Escreval("Digite 0 para encerrar")
   leia(continuar)

fimenquanto
fimalgoritmo
