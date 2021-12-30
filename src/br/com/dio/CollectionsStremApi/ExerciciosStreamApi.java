package br.com.dio.CollectionsStremApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprimindo elementos dessa lista de String: ");
//        numerosAleatorios.stream()
//                .forEach(System.out::println);
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Coloca os 5 primeiros números e coloca dentro de um Set");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("Transforma a lista de String em uma lista de números inteiros.");
//        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pega os números pares maiores que 2 e coloca numa lista");
//        List<Integer> collectParesMaiores2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList());
//        System.out.println(collectParesMaiores2);
        List<Integer> ListParesMaiores2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(ListParesMaiores2);

        System.out.println("Mostra a média dos numeros: ");
//        numerosAleatorios.stream()
//                .average()
//                .ifPresent(System.out::println);
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remove o números de impares: ");
//        collectList.removeIf(integer -> integer % 2 != 0);
//        System.out.println(collectList);
        collectList.removeIf(integer -> (integer % 2 != 0));
        System.out.println(collectList);
    }
}
