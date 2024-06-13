package entities;

public class Employee {

    private int id;
    private String nome;
    private double  salario;

    public Employee(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalarial(double percent){
        this.salario += this.salario * percent/100 ;

    }

    @Override
    public String toString() {
        return "\nid: " + id + "\n" +
                "nome: " + nome + "\n" +
                "salario: " + salario;
    }
}
