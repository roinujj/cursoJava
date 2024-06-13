package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;

import java.util.List;



public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String workerName, WorkerLevel workerLevel, double baseSalary) {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

   /* public void setContracts(List<HourContract> contracts) { // este metodo substituiria a lista
        this.contracts = contracts;
    }*/
    public void addContract (HourContract contract){
        contracts.add(contract); //Lista é contracts o objeto contract

    }
    public void removeContract (HourContract contract){
        contracts.remove(contract);
    }

    public double income (int year, int month){
        double sum = this.baseSalary;
        for (HourContract c : contracts){ //for eache declara variavel com o tipo de objeto da lista : lista instaciada e testa cada elemento

            int c_year = c.getDate().getYear()+1900;
            int c_month = c.getDate().getMonth()+1;

            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}

