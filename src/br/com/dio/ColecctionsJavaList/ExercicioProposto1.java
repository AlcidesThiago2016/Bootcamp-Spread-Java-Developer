package br.com.dio.ColecctionsJavaList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        List<String> apuracao = new ArrayList<>();
        Scanner dado =new Scanner(System.in);

        System.out.println("****Sistema Policial de Adequação****");
        System.out.println("****Telefonou para Vítima?****");
        String resposta = dado.next();
        apuracao.add(resposta.toLowerCase());
        System.out.println("****Esteve no Local do Crime?****");
        resposta = dado.next();
        apuracao.add(resposta.toLowerCase());
        System.out.println("****Mora perto da Vítima?****");
        resposta = dado.next();
        apuracao.add(resposta.toLowerCase());
        System.out.println("****Devia para Vítima?****");
        resposta = dado.next();
        apuracao.add(resposta.toLowerCase());
        System.out.println("****Já Trabalhou com a Vítima?****");
        resposta = dado.next();
        apuracao.add(resposta.toLowerCase());
        System.out.println(apuracao);

        int count = 0;
        Iterator<String> contador = apuracao.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if (resp.contains("s")) {
                count ++;
            }
        }

        switch (count){
            case 2:
                System.out.println("****Suspeita****"); break;
            case 3:
            case 4:
                System.out.println("****Cúmplice****"); break;
            case 5:
                System.out.println("****Assasino****"); break;
            default:
                System.out.println("****Inocente****"); break;
        }

    }
}
