package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();

    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public Double totalOrder(List<OrderItem> orderItems) {
        double total = 0;
        for (OrderItem oi : orderItems) {
            total += oi.getPrice();

        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: ");
        sb.append(status + " - " + sdf2.format(moment) + "\n");
        sb.append("Client:" +  client.getName() + " -  email: "+ client.getEamail() + " -  birthDate: "+ sdf1.format(client.getBirthDate()) +"\n");
        sb.append("Order Itens:\n");
        // for each para cada comment
        for (OrderItem oi : orderItems) {
            sb.append("QTD: " + oi.getQuantity() + " - " + oi.getProduct().getName()
                    + " - UN$: " + String.format("%.2f", oi.getProduct().getPrice())
                    + " ----> SubTotal - " + String.format("%.2f",oi.getPrice())
                    + "\n");
        }
        sb.append("\nTotal Order: " + String.format("%.2f",totalOrder(orderItems)));
        return sb.toString();
    }

}
