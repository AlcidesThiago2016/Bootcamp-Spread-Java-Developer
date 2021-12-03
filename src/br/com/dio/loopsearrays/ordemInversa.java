package br.com.dio.loopsearrays;
/*
    PROGRAMA CRIA UM VETOR DE 6 NUMEROS E MOSTRA A ORDEM INVERSA DO MESMO
 */

public class ordemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -9, 58, 125, -87, -1};

        System.out.println("Vetor de Números: ");
        int count = 0;
        while (count <= (vetor.length-1)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();
        System.out.println("Vetor de Números Ordem Inversa:");
        for (int i = (vetor.length - 1); i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");

        }
    }
}
