package br.com.dio.No;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteúdo no1");

        No<String> no2 = new No<>("Conteúdo no2");
        no1.setProximoNo(no2); //NÓ 1 APONTANDO PARA O NÓ 2

        No<String> no3 = new No<>("Conteúdo no3");
        no2.setProximoNo(no3);//NÓ 2 APONTANDO PARA O NÓ 3

        No<String> no4 = new No<>("Conteúdo no4");
        no3.setProximoNo(no4);//NÓ 3 APONTANDO PARA O NÓ 4
        //QUANDO ACABA OS APONTAMENTOS O ULTIMO NÓ APONTA PARA NULL

        System.out.println("-----------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());

    }
}
