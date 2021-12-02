
        System.out.println("Informe o número para calculo do fatorial: ");
        fatorial = scan.nextInt();

        int mult = 1;

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            mult = mult * i;
        }

        System.out.println(mult);
    }

}