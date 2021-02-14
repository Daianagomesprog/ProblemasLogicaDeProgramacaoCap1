package br.com.daiana;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner entrada = new Scanner(System.in);

     //   Date dataDeNascimento = new Date();
        //12/03/1985 - 26/09/2020
        //3456789765 - 3456789454 /1000/60/24
        //2345678654324564322

        int numeroUm;
        int numeroDois;
        int resultado;

        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite o primeiro número:  ");
        numeroUm = entrada.nextInt();

        System.out.print("Digite o segundo número:  ");
        numeroDois = entrada.nextInt();

        resultado = numeroUm + numeroDois;
        System.out.println("Resultado   "+ resultado);


//        String lido = entrada.next();
//        while (!"=".equals(lido)) {
//            numeros.add(Integer.parseInt(lido));
//            System.out.print("Digite um  número ou igual (=) ");
//            lido = entrada.next();
//        }
//        numeros.add(entrada.nextInt());


     // Exercício 2:


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
