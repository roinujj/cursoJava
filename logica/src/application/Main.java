package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //******  e && , ou ||, igual ==,  não !, diferente !=

        // IF

/*        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora sem os minutos no modo 24h");
        int hora = sc.nextInt();


        if (hora < 5 || hora > 18) {
            System.out.println("Boa Noite");
        }
        else if (hora < 13) {
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa Tarde");
        }
        sc.close();
*/
        //*******************************  switch case

/*        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println(dia);
        sc.close();
*/

        //*******************************  Condição ternária


/*
        double preco;
       //double desconto;

        Scanner sc = new Scanner(System.in);

        preco = sc.nextDouble();

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05; // esta expreção substitui o if abaixo e pode ser colocado na declaração da variável

       *//* if (preco < 20){
            desconto = preco * 0.1;
        }
        else{
            desconto - preco * 0.05;
        }*//*

        System.out.println(desconto);
        sc.close();
 */

        //*******************************  While

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivinhe qual o número eu pensei :");

        int num = sc.nextInt();
        int soma = 0;
        while (num != 0) {
            soma += num; //soma =  soma + num
            System.out.println("Errou! Digite outro :");
            num = sc.nextInt();

        }
        System.out.println("Acertou !!");
        System.out.printf("A soma dos numeros digitados é %d%n", soma);


        sc.close();
*/

        //*******************************  For

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero:");

        int num = sc.nextInt();

        for (int i=0 ; i<num; i++){
            System.out.println(i+1);

        }

        for (int i=num ; i>0; i--){ // para
            System.out.println(i);

        }
        sc.close();
*/

        //*******************************  while

/*        Scanner sc = new Scanner(System.in);
        char resp = 's';
        while (resp == 's') {
            System.out.println("digite a temperatura em Celsius:");
            double tempc = sc.nextDouble();
            double tempf = 9 * tempc / 5 + 32;
            System.out.printf("A temperatura em Fahrenheit: %.1f%n", tempf);
            System.out.println("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        }
        sc.close();
*/

        //******************************* do while

/*
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.println("digite a temperatura em Celsius:");
            double tempc = sc.nextDouble();
            double tempf = 9 * tempc / 5 + 32;
            System.out.printf("A temperatura em Fahrenheit: %.1f%n", tempf);
            System.out.println("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp == 's');
        sc.close();

*/






    }
}
