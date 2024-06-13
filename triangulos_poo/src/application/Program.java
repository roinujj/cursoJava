package application;

import entities.Triangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Digite as medidas do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do Triangulo X: %.4f%n", areaX);
        System.out.printf("Area do Triangulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("A Maior area é do Triangulo X");
        }
        else {
            System.out.println("A Maior area é do Triangulo Y");
        }



        sc.close();
    }
}
