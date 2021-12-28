package br.com.dio.CollectionsMap;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Criando um dicionário e relacionando seus modelos aos seus respectivos consumos!");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substituindo o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);

        System.out.println("Verificando se o modelo tuckson esta no dicionário: " + carrosPopulares.containsKey("tuckson"));

        System.out.println("Exibindo o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exibindo os modelos dos carros :");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exibindo as medias dos carros :");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exibindo os modelo mais economicos e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exibindo os modelo menos economicos e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exibindo a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é: " + soma);

        System.out.println("Exibindo a média de consumo dos carros: " + (soma/carrosPopulares.size()));

        System.out.println("Removendo os veiculos com média igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);


    }
}
