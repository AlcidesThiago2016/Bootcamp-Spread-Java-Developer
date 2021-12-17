package br.com.dio.Fila;

public class Main {
    public static void main(String[] args) {

       Fila<String> minhaFila =new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");
        System.out.println(minhaFila);

        System.out.println("---Chamando Primeira da Fila!");
        System.out.println(minhaFila.dequeue());

        System.out.println("---Primeiro Saiu da Fila!");
        System.out.println(minhaFila);

        System.out.println("---Exibe o Segundo da Fila");
        System.out.println(minhaFila.first());


    }
}
