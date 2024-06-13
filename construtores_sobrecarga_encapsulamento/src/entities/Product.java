package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public Product(String name,double price){ //essa Sobrecarga do construtor permite que não seja mandado a quantidade pois não entro como obrigatório
        this.name = name;
        this.price = price;
        //this.quantity = 0; não é necessário já que todos os atributos recebem zero ou numo por padrão do Java

    }
    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Não implementamos o set quantity pois só será permitido mudar a quantidade nos metodos add e remove
    /*public void setQuantity(int quantity) {
        this.quantity = quantity;
    }*/

    public double totalValueInStock(){

        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;

    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return getName()
                + ", $ "
                + String.format("%.2f",getPrice())
                +", "
                + getQuantity()
                + " units, Total: $ "
                + String.format("%.2f",totalValueInStock());

    }
}
