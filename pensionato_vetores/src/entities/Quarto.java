package entities;

public class Quarto {
    String nome, email;
    int nQuarto;

    public Quarto(String nome, String email, int nQuarto) {
        this.nome = nome;
        this.email = email;
        this.nQuarto = nQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getnQuarto() {
        return nQuarto;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
//                ", nQuarto=" + nQuarto +
                '}';
    }
}
