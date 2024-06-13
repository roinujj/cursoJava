package ola_mundo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo! ");
        System.out.println("Bom dia! ");

        int y = 32;
        System.out.println(y);
        double x = 10.378325;
        System.out.println(x);
        System.out.printf("%.2f%n", x); // printf pega o locale do computador

        Locale.setDefault(Locale.US); //Tratando ponto ou vírgula
        System.out.printf("%.4f%n", x);

        System.out.println("Resultado = " + x + " Metros"); //concatenamdo com println
        System.out.printf("Resultado = %.2f Metros%n", x); // concatenando com printf %n quebra linha  como println
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f por mês.%n", nome, idade, renda);// %s transforma a variavel em string %.2s mostra as 2 primeiras letras

        System.out.println("=======================");

        //Exercício

        String produto1 = "Computador", produto2 = "Mesa de Escritório";
        int age = 30, codigo = 5290;
        char sexo = 'F';
        double preco1 = 2100.0, preco2 = 650.50, medida = 53.234567;

        System.out.println("Produtos");
        System.out.printf("%s, com o preço de $ %.2f%n",produto1, preco1);
        System.out.printf("%s, com o preço de $ %.2f%n",produto2, preco2);
        System.out.printf("%nRegistro: %d anos, codigo: %d , sexo: %s%n",age,codigo,sexo);
        System.out.printf("%nMedida com 8 casas decimais: %.8f%n", medida);
        System.out.printf("Aredondado com 3 casas decimais: %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Locale US usando ponto como decimal: %.3f%n", medida);

        System.out.println("=======================");
        //Operações matematicas x formatação de variáveis

        System.out.println("Resultados sem converter a expressão e convertendo");

        int a, b;
        double resultado;

        a=5;
        b=2;

        resultado = a/b; //operação de 2 numeros inteiros será inteiro mesmo a variável resultado ssendo double
        System.out.println(resultado);

        resultado =(double) a/b;
        System.out.println(resultado);

        System.out.println("=======================");
        //Entrada de dados

        Scanner sc = new Scanner(System.in);

        String p;
        p = sc.next(); // nextInt() , nextDouble() *atenção ao Locale , next().charAt(0) *somente o primeiro character (0)
        int q = sc.nextInt();
        double r = sc.nextDouble();

        System.out.println("Vc digitou: " + p);
        System.out.printf("Vc digitou: %s%n", p);
        System.out.println("Vc digitou: " + q);
        System.out.printf("Vc digitou: %s%n", q);
        System.out.println("Vc digitou: " + r);
        System.out.printf("Vc digitou: %s%n", r);

       // sc.close(); não fechar por causa do proximo exercicio

        System.out.println("=======================");

        //Ler o Texto até a quebra de linha [Enter]

        //Scanner sc = new Scanner(System.in); já está declarado no codigo acima

        int t;
        String s1, s2, s3;

        System.out.println("Digite Int");
        t=sc.nextInt(); // qundo digitar o numero e der [Enter] ele vai jogar null na proxima variável s1
        sc.nextLine(); // para contornar este "problema" colocamos este nextLine para capturar o [enter] acima

        System.out.println("Digite String");
        s1=sc.nextLine();
        System.out.println("Digite String");
        s2=sc.nextLine();
        System.out.println("Digite String");
        s3=sc.nextLine();

        System.out.println(t);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
