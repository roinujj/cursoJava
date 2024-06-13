package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int nItens = sc.nextInt();
        Produto[] vect = new Produto[nItens]; // como aqui delimitamos o tamanho do vetor nos laços "For" podemos usar "i< vect.lenght" ao invés de "i < nItens"
        Produto produto;


        for (int i =0 ; i< vect.length; i++){
            sc.nextLine();
            System.out.print("Digite o Produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o Preco: ");
            double preco = sc.nextDouble();

            produto = new Produto(nome , preco);// OU mais simplificado :
            vect[i]= produto;                   // vect[i]= new Produto(nome , preco);
        }

        for (int i =0 ; i< vect.length; i++){
            System.out.println(vect[i]);
        }

        // Média
        double soma = 0;
        for (int i =0 ; i< vect.length; i++){
            soma += vect[i].getPreco();
        }
        double media = soma / vect.length; // usando aqui tb o vect.length assim garantimos que a quantidade final será a de itens do vetor
        System.out.printf("A Média de preco do estoque é: %.2f%n" , media);



        sc.close();
    }
}
