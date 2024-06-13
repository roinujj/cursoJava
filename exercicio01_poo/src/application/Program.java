package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno);



        sc.close();
    }
}
