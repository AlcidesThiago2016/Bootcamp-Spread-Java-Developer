package br.com.dio.loopsearrays;

/*
    PROGRAMA QUE LÊ 20 NÚMEROS INTEIROS ENTRE 0  E 100 E ARMAZENA NO VETOR, LOGO APOS MOSTRA SEUS NÚMEROS SUCESSORES.
 */

import java.util.Random;

public class numerosAleatórios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Números Aleatórios: ");
        for ( int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores Números Aleatórios: ");
        for ( int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
