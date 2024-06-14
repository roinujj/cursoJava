package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product1 =  new Product("TV",1000.00);
        Product product2 =  new Product("Smart Phone",1500.00);

        // product1.setPrice(2000.00); //Teste aumentando o preço no objeto Produto

        Client client = new Client("Jota",
                "jjunior.cti@gmail.com",
                sdf.parse("14/01/1979"));

        OrderItem orderItem1 = new OrderItem(2,product1);
        OrderItem orderItem2 = new OrderItem(3,product2);

        Order order = new Order(new Date(), OrderStatus.PENDING_PAYMENT);

        order.setClient(client);

        order.addItem(orderItem1);
        order.addItem(orderItem2);

        System.out.println(order);












        sc.close();



    }
}
