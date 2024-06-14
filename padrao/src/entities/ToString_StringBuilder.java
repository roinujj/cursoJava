package entities;

public class ToString_StringBuilder {
    /*public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: ");
        sb.append(status + " - " + sdf2.format(moment) + "\n");
        sb.append("Client:" + client.getName() + " -  email: " + client.getEamail() + " -  birthDate: " + sdf1.format(client.getBirthDate()) + "\n");
        sb.append("Order Itens:\n");
        // for each para cada comment
        for (OrderItem oi : orderItems) {
            sb.append("QTD: " + oi.getQuantity() + " - " + oi.getProduct().getName()
                    + " - UN$: " + String.format("%.2f", oi.getProduct().getPrice())
                    + " ----> SubTotal - " + String.format("%.2f", oi.getPrice())
                    + "\n");
        }
        sb.append("\nTotal Order: " + String.format("%.2f", totalOrder(orderItems)));

        return sb.toString();
    }*/
}
