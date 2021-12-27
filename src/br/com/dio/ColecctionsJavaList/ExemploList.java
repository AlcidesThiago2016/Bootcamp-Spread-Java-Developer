package br.com.dio.ColecctionsJavaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Lista com 7 Notas:");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Nota na posição 5: " + notas.indexOf(5d));

        System.out.println("Adicionando nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substituindo a nota 5 pela nota 6: ");
        notas.set(notas.indexOf(5d), 6.0 );
        System.out.println(notas);

        System.out.println("Verificando se a Nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Imprimindo a lista na ordem de inserção:");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exibir 3 nota adicionada: " + notas.get(2));

        System.out.println("Exibir a menor nota: " + Collections.min(notas));

        System.out.println("Exibir a menor nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir a soma de todas valores: " + soma);

        System.out.println("Exibir a média de todas as notas: " + (soma/notas.size()));

        System.out.println("Removendo a nota 8: ");
        notas.remove(8d);
        System.out.println(notas);

        System.out.println("Removendo a nota de posição 0 : ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Removendo notas menores que 7: ");
        Iterator<Double> iterator1 =notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando toda Lista: ");
        notas.clear();
        System.out.println(notas);


    }
}
