package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Informe o 1 Numero:");
        a = scanner.nextInt();
        System.out.println("Informe o 1 Numero:");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Dividir: " + dividir);
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }
}
