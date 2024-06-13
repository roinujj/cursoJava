package application;

import entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Quarto quarto;

        Quarto[] vect = new Quarto[10]; //  Quarto vect[] = new Quarto[10]; Corrigido pelo Intellij



        System.out.println("Temos 10 quartos, todos vazios. Quantos Alunos se hospedarão?");
        int qAluno = sc.nextInt();

        for (int i=0 ; i<qAluno; i++){
            sc.nextLine();
            System.out.println("Digite o Nome do Aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite o e-mail do Aluno: ");
            String email = sc.nextLine();
            System.out.println("Qual o Número do Quarto escolhido? ");
            int nQuarto = sc.nextInt();
            quarto = new Quarto(nome,email,nQuarto);
            vect[nQuarto]= quarto;

        }
        for (int i=0;i< vect.length; i++) {

            System.out.printf("Quarto %d %s%n", i, (vect[i] == null ? "está vazio" :  vect[i]));

        }

        // for each
        for (Quarto obj:vect){
            System.out.println(obj);
            System.out.printf("Quarto %s%n ", (obj == null? " vazio": obj));

        }


    }
}
