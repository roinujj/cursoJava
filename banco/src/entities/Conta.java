package entities;

public class Conta {
    private int nConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int nConta, String nomeTitular, double depositoInicial) {
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
        this.saldo = deposito((depositoInicial));// mesmo no construtor não alterar sem executar a funçao deposito()
    }

    public Conta(int nConta, String nomeTitular) {
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
    }

    public int getnConta() {
        return nConta;
    }

     public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposito(double valor){
        return  this.saldo += valor;
    }
    public double saque(double valor){
        return  this.saldo -= valor+5;
    }

    @Override
    public String toString() {
        return  "Número da Conta: "
                + nConta
                +", Titular: "
                + nomeTitular
                +", Saldo: "
                + String.format("%.2f",saldo);
    }
}
