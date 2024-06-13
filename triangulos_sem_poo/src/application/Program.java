package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Entre com as medidas do Triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Entre com as medidas do Triangulo y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA)*(p-xB)*(p-xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA)*(p-yB)*(p-yC));

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
