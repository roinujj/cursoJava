package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de empregados: ");
        int nEmpregados = sc.nextInt();


        List<Employee> empregadosList = new ArrayList<>();

        Employee employee;


        for( int i=0; i<nEmpregados; i++) {
            System.out.print("Digite o id do Empregado: ");
            int id = sc.nextInt();

            int index = position(empregadosList, id);
            while (index >= 0){
                System.out.println("Id já utilizado pelo empregado: " + empregadosList.get(index).getNome());
                System.out.print("Digite o id único do Empregado: ");
                id = sc.nextInt();
                index = position(empregadosList, id);
            }


         //   idList.add(id);

            System.out.print("Entre com o nome do Empregado: ");
            String nome = sc.next();
         //   nomeList.add(sc.next());

            System.out.print("Informe o Salário: ");
            double salario = sc.nextDouble();
         //   salarioList.add(sc.nextDouble());

            employee = new Employee(id,nome,salario);

            empregadosList.add(employee);
        }
        for(Employee obj: empregadosList) {

            System.out.println(obj);
            System.out.println("Indice: " + empregadosList.indexOf(obj));
        }

        System.out.println("\nDigite o id de quem ganhou aumento: ");
        int idAumento = sc.nextInt();


        //System.out.println(empregadosList.get(1).getId()); teste de get(indice).getCampo()

        int pos = position(empregadosList, idAumento);
        if (pos <0) {
            System.out.println("Id não encontrado !");
        }
        else {
            System.out.println("Digite o percentual do aumento: ");
            double percentAumento = sc.nextInt();
            empregadosList.get(pos).aumentoSalarial(percentAumento);
            System.out.println("Aumento registrado para " + empregadosList.get(pos).getNome());

        }

        for(Employee obj: empregadosList) {

            System.out.println(obj);
            //System.out.println("Indice: " + empregadosList.indexOf(obj));
        }

        sc.close();
    }
 // Criar função para encontrar o indice da lista pelo Id do objeto


    public static Integer position(List<Employee> lista, int id){
        for(int i = 0 ; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}


