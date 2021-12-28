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
    }
}
