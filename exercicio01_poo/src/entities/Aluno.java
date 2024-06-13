package entities;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public double somaNota(){
        return nota1+nota2+nota3;

    }
    public String resultado(){
        if (somaNota() < 60){
            return "FAILED";
        }
        else{
            return "PASS";
        }
    }
    public double diferenca(){
        return 60 - somaNota();
    }

    @Override
    public String toString() {
        String s;

        if (somaNota() < 60) {
            s = String.format("Final Grade = %.2f%n%s%nMISSING %.2f POINTS",
                    somaNota(),
                    resultado(),
                    diferenca());
        } else {
            s = String.format("Final Grade = %.2f%n%s",
                    somaNota(),
                    resultado());
        }
        return s;

    }

   /* // Usando Usando Operador Ternário
    public String toString() {
        return somaNota() < 60 ?
                String.format("Final Grade = %.2f%n%s%nMISSING %.2f POINTS",
                        somaNota(), resultado(), diferenca()) :
                String.format("Final Grade = %.2f%n%s",
                        somaNota(), resultado());
    }
    //Usando Usando Condicionais Inline
    public String toString() {
        return String.format("Final Grade = %.2f%n%s%s",
                somaNota(),
                resultado(),
                somaNota() < 60 ? String.format("%nMISSING %.2f POINTS", diferenca()) : "");
    }*/
}
