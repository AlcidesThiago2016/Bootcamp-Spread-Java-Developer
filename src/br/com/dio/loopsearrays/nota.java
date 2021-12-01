package br.com.dio.loopsearrays;

import java.util.Scanner;

/*
        PROGRAMA QUE SOLICITA UMA NOTA ENTRE 0 E 10, E MOSTRA UMA MENSAGEM CASO O VALOR SEJA INVALIDO E CONTINUE
        PEDINDO ATE O USUARIO INFORMAR UM VALOR VALIDO.
     */
public class nota {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int nota;

            System.out.println("Informe uma nota: ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10){
                System.out.println("Nota Inválida! Informe novamente: ");
                nota = scan.nextInt();

            }
        }
}
