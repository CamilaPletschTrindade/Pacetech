/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosemana6;

import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class AtividadeSemana6 {

    public static void main(String[] args) {
        float fahrenheit, tempCelsius, tempFahrenheit, celsius, dolar, cotacaoDolar, reais;
        int opcao = 0, novaConversao = 0;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite a cotação do dólar");
            cotacaoDolar = leitor.nextFloat();
            System.out.println("Qual conversão deseja realizar?");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Reais para Dólar");
            System.out.println("4 - Dólar para Reais");
            System.out.println("0 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius:");
                    celsius = leitor.nextFloat();
                    tempFahrenheit = (celsius * 1.8f) + 32;
                    System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit);

                    break;
                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    fahrenheit = leitor.nextFloat();
                    tempCelsius = (fahrenheit - 32) / 1.8f;
                    System.out.println("Temperatura em Fahrenheit: " + tempCelsius);

                    break;
                case 3:
                    System.out.println("Digite a quantidade em reais para converter em dólar:");
                    reais = leitor.nextFloat();
                    dolar = reais / cotacaoDolar;
                    System.out.println("Valor total em Dólares " + dolar);
                    break;
                case 4:
                    System.out.println("Digite a quantidade em dólares para converter em reais:");
                    dolar = leitor.nextFloat();
                    reais = cotacaoDolar * dolar;
                    System.out.println("Valor total em Reais " + reais);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja realizar nova conversão?");
            System.out.println("1 - Sim");
            System.out.println("0 - Não");
            novaConversao = leitor.nextInt();
        } while (opcao != 0 && novaConversao != 0);
    }
}