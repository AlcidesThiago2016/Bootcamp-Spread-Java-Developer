package br.com.dio.loopsearrays;
/*
    PROGRAMA QUE PEGA N NUMEROS INTEIROS, E MOSTRE A QUANTIDADE NUMEROS IMPARES E PARES.
 */

import java.util.Scanner;

public class parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0, qtdImpar = 0;

        System.out.println("Informe a Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int cont = 0;
        do{
            System.out.println("Informe o "+ cont + " número: ");
            numero = scan.nextInt();

            if (numero %  2 == 0) qtdPares++;
            else qtdImpar++;

            cont++;

        }while(cont < qtdNumeros);

        System.out.println("Informações Resultado");
        System.out.println("->Quantidade de números Pares: " +qtdPares);
        System.out.println("->Quantidade de números Impares: " +qtdImpar);


    }
}
