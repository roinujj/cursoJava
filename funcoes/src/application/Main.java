package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        sc.close();


    }

    public static int max (int x, int y, int z){
        int aux = x;
        if (aux < y ){
            aux = y;
        }
        if (aux < z){
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("O Maior é o: " + value);
    }
}
