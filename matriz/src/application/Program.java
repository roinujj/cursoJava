package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da matriz");

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.println("Digite o número linha: " + i + ", coluna: "+j );
                mat[i][j] = sc.nextInt();

            }

        }


        System.out.println("Main Diagonal:");
        for (int i=0; i<n; i++){
            System.out.print(mat[i][i]+ " ");
        }
        System.out.println();

        // trocando n por quantidade de linhas mat.lenght  e colunas mat[i].lenght ou mat[0].lenght
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < 0 ){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers= "+ count);


            sc.close();

    }

   }
