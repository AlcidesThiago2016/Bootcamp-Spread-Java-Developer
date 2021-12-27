package br.com.dio.CollectionsJavaSet;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("*****Criação de um conjunto com notas aleatórias*****");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("*****Vendo se a nota 5.0 esta no conjunto*****");
        System.out.println(notas.contains(5d));

        System.out.println("*****Exibindo a menor nota*****");
        System.out.println(Collections.min(notas));

        System.out.println("*****Exibindo a maior nota*****");
        System.out.println(Collections.max(notas));

        System.out.println("*****Exibindo a soma dos valores*****");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("*****Exibindo a média das notas*****");
        System.out.println((soma/notas.size()));

        System.out.println("*****Removendo a Nota 0*****");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("*****REmovendo notas menores que 7*****");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("*****Exibindo as notas em ordem crescente*****");
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);
    }
}
