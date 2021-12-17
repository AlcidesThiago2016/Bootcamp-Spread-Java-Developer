package br.com.dio.Fila;

public class Main {
    public static void main(String[] args) {

       Fila minhaFila =new Fila();

        minhaFila.enqueue(new NoFila("Primeiro"));
        minhaFila.enqueue(new NoFila("Segundo"));
        minhaFila.enqueue(new NoFila("Terceiro"));
        minhaFila.enqueue(new NoFila("Quarto"));
        System.out.println(minhaFila);

        System.out.println("---Chamando Primeira da Fila!");
        System.out.println(minhaFila.dequeue());

        System.out.println("---Primeiro Saiu da Fila!");
        System.out.println(minhaFila);

        System.out.println("---Exibe o Segundo da Fila");
        System.out.println(minhaFila.first());


    }
}
