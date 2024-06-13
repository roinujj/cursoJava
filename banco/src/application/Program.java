package application;

import entities.Conta;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Cadastro

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o número da conta: ");
        int nConta = sc.nextInt();
        System.out.print("Entre com o nome do titular: ");
        String nTitular = sc.next();
        System.out.print("Fará um depósito inicial s/n: ");
        char perguntaDeposito = sc.next().charAt(0);

        Conta conta;
        if (perguntaDeposito == 's'){
            System.out.print("Digite o valor do Deposito inicial: ");
            conta = new Conta(nConta, nTitular,sc.nextDouble());
        }
        else {
            conta = new Conta(nConta, nTitular);

        }

        //System.out.println(conta);
        System.out.printf("%n%s%n%n", conta);


        int res;
        do {

            System.out.println(" Agora quer fazer ?");
            System.out.println("1-Saque");
            System.out.println("2-Deposito");
            System.out.println("3-Sair");
            res = sc.nextInt();
            if (res==1){
                System.out.print("Digite o Valor do Saque (taxa R$ 5,00): ");
                conta.saque(sc.nextDouble());
                System.out.printf("%n%s%n%n", conta.toString());
            }
            else if (res==2){
                System.out.print("Digite o Valor do Depósito: ");
                conta.deposito(sc.nextDouble());
                System.out.printf("%n%s%n%n", conta.toString());
            }

        }while (res==1 || res==2 );

        System.out.println("Obrigado, Até Logo! ");


        sc.close();

    }
}
