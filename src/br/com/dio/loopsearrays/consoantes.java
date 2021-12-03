package br.com.dio.loopsearrays;

import java.util.Scanner;

/*
    PROGRAMA LER UM VETOR DE 6 CARACTERES E INFORMAR QUANTAS CONSOANTES FORAM LIDAS.
 */
public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Informe uma Letra: ");
            String letra = scan.next();

            if ( !( letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                   consoantes[count] = letra;
                   quantidadeConsoantes++;
            }

        count++;
        }while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes ) {
            if ( consoante != null){
            System.out.print(consoante + " ");
        }
