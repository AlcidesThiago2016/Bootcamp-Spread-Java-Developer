package br.com.dio.loopsearrays;

/*
    PROGRAMA QUE EMULA UMA TABUADA DE ACORDO COM O QUE O USUARIO REQUISITAR
 */

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a Tabuada desejada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + " **** " + tabuada + " ****");

        for(int i = 1; i <= 10 ;i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
