package br.com.daiana;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner entrada = new Scanner(System.in);
        Date datadeNascimento = new Date();
//
//     //   Date dataDeNascimento = new Date();
//        //12/03/1985 - 26/09/2020
//        //3456789765 - 3456789454 /1000/60/24
//        //2345678654324564322
//
//        int numeroUm;
//        int numeroDois;
//        int resultado;
//
//        List<Integer> numeros = new ArrayList<>();
//
//        System.out.print("Digite o primeiro número:  ");
//        numeroUm = entrada.nextInt();
//
//        System.out.print("Digite o segundo número:  ");
//        numeroDois = entrada.nextInt();
//
//        resultado = numeroUm + numeroDois;
//        System.out.println("Resultado   "+ resultado);


//        String lido = entrada.next();
//        while (!"=".equals(lido)) {
//            numeros.add(Integer.parseInt(lido));
//            System.out.print("Digite um  número ou igual (=) ");
//            lido = entrada.next();
//        }
//        numeros.add(entrada.nextInt());


     // Exercício 2:

        int dataDeHoje;
        int mesAtual;
        int anoVigente;

        int diaDoNascimento;
        int mesDoNascimento;
        int anoDoNascimento;
        int totalDeDias;
        int totalDeMeses;
        int totalEmAnos;
        final int TOTAL_DE_DIAS_NO_ANO = 360;
        final int TOTAL_DE_DIAS_NO_MES = 30;
        int resultado;


        System.out.print("Digite o dia do seu nascimento:    ");
        diaDoNascimento = entrada.nextInt();

        System.out.print("Digite o mês do seu nascimento:    ");
        mesDoNascimento = entrada.nextInt();

        System.out.print("Digite o ano do seu nascimento:    ");
        anoDoNascimento = entrada.nextInt();

        System.out.print("Digie a data de hoje:    ");
        dataDeHoje = entrada.nextInt();

        System.out.print("Digite o mês atual:    ");
        mesAtual = entrada.nextInt();

        System.out.print("Digite o ano vigente:    ");
        anoVigente = entrada.nextInt();

        totalDeDias = dataDeHoje - diaDoNascimento;
        totalDeMeses = mesAtual - mesDoNascimento;
        totalEmAnos = anoVigente - anoDoNascimento;

        resultado = (totalEmAnos * TOTAL_DE_DIAS_NO_ANO) + (totalDeMeses * TOTAL_DE_DIAS_NO_MES) + totalDeDias;
        System.out.println("Você viveu:   " + resultado + " dias! ");




















    // Exercício 3:

        int peso;
        float altura;
        float imc;


        System.out.print("Digite o seu peso:  ");
        peso = entrada.nextInt();

        System.out.print("Digite a sua altura:  ");
        altura = entrada.nextFloat();

        imc = peso / altura * altura;

        System.out.println("IMC:  " + imc);






    }
}
