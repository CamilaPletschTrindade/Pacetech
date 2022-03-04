algoritmo "AtividadeSemana4"
// Função : Conversão
// Autor : Camila Pletsch
// Data : 04/03/2022
// Seção de Declarações
var
dolar, fahrenheit, celsius, reais, tempCelsius, tempFahrenheit, cotacaoDolar: real
continuar: inteiro
escolher: inteiro

inicio
   continuar <- 1
   enquanto continuar = 1 faca
      Escreval("Digite o valor da cotação do dólar")
      leia(cotacaoDolar)
      Escreval("Digite a quantidade de dólars para converter")
      leia(dolar)
      reais <- dolar * cotacaoDolar
      Escreval("O valor em reais é: ", reais)
      Escreval("Digite o valor da cotação do dólar")
      leia(cotacaoDolar)
      Escreval("Digite a quantidade de reais para converter")
      leia(reais)
      dolar <- reais/cotacaoDolar
      Escreval("O valor em dolars é: ", dolar)

      Escreval("Escolha:")
      Escreval("1 - Converter Celsius para Fahrenheit")
      Escreval("2 - Converter Fahrenheit para Celsius")
      leia(escolher)
      se escolher = 1 entao
         Escreval("Digite a temperatura em Celsius")
         leia(celsius)
         tempFahrenheit <- (celsius * 1.8) + 32
         Escreval("Temperatura em Fahrenheit: ", tempFahrenheit)
      senao
         se escolher = 2 entao
            Escreval("Digite a temperatura em Fahrenheit")
            leia(fahrenheit)
            tempCelsius <- (fahrenheit-32)/1.8
            Escreval("Temperatura em Celsius: ", tempCelsius)
         fimse
      fimse
      
      Escreval("Deseja realizar uma nova conversão?")
      Escreval("Digite 1 para nova conversão")
      Escreval("Digite 0 para encerrar")
      leia(continuar)

   fimenquanto
fimalgoritmo
