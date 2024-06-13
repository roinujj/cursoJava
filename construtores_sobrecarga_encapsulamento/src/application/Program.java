package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity); // o construor garante que o objeto só será criado com os atributos APÓS termos os dados obrigatórios

      //  Product product = new Product(name, price); // instanciando sem quantity

        System.out.println("Product data: " + product) ; // se colocarmos somente product ele vai entender o product.toString

        System.out.printf("%nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: " + product) ;

        System.out.printf("%nEnter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " + product) ;


        sc.close();
    }
}
