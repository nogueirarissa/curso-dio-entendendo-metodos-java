package br.dio.bootcamp;

public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {           //na ordem, visibilidade (public), modificador (static) do método, retorno dele (nesse caso não há retorno pelo void) e os parâmetros (double numero..)

        double resultado = numero1 - numero2;  //resultado é uma variável temporaria

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + "dividido " + numero2 + " é " + resultado);
    }
}

    //observação: o método static possibilita chamar o método a partir de uma classe.