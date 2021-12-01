package br.com.dio.loopsearrays;
/*
    PROGRAMA QUE LEIA 5 NÚMEROS E INFORMA O MENOR E A MÉDIA DOS NÚMEROS
 */

import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int cont = 0;
        do{
            System.out.println("Informe o número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            cont = cont + 1;
        }while (cont < 5);
        System.out.println("**********Informações**********");
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
