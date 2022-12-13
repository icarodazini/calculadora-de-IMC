package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu peso");
        double peso = sc.nextDouble();

        System.out.println("digite sua altura");
        double altura = sc.nextDouble();

        double IMC = peso/(altura*altura);

        System.out.printf("o seu imc e %.2f ", IMC);

        if (IMC<18.5)
            System.out.println ("seu imc esta classificado em MAGREZA");
        else
        if ((IMC>18.5)&&(IMC<24.9))
            System.out.println ("seu imc esta classificado em NORMAL");
        else
        if ((IMC>25.0)&&(IMC<29.9))
            System.out.println("seu imc esta classificado em SOBREPESO");
        else
        if ((IMC>30.0)&&(IMC<34.9))
            System.out.println("seu imc esta classificado em OBESIDADE");
        else
        if ((IMC>35.0)&&(IMC <39.9))
            System.out.println ("");
        else
        if (IMC>=40)
            System.out.println ("seu imc esta classificado em OBESIDADE GRAVE");

        sc.close();

    }
}