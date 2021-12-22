package br.com.dio.ListasCirculares;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircula = new ListaCircular<>();

        minhaListaCircula.add("c0");
        minhaListaCircula.add("c1");
        minhaListaCircula.add("c2");
        minhaListaCircula.add("c3");
        minhaListaCircula.add("c4");
        minhaListaCircula.add("c5");
        System.out.println(minhaListaCircula);
        System.out.println(minhaListaCircula.size());

        for (int i = 0; i < 20; i++){
            System.out.println(minhaListaCircula.get(i));
        }


    }
}
