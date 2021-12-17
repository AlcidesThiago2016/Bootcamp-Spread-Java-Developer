package br.com.dio.No;

public class Main {
    public static void main(String[] args) {

        No no1 = new No("Conteúdo no1");

        No no2 = new No("Conteúdo no2");
        no1.setProximoNo(no2); //NÓ 1 APONTANDO PARA O NÓ 2

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);//NÓ 2 APONTANDO PARA O NÓ 3

        No no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4);//NÓ 3 APONTANDO PARA O NÓ 4
        //QUANDO ACABA OS APONTAMENTOS O ULTIMO NÓ APONTA PARA NULL

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

    }
}
