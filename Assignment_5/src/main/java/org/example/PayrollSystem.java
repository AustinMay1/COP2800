package org.example;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new SalariedEmployee("John", "Doe", "111-11-1111", 1000);
        Employee emp2 = new HourlyEmployee("Mandy", "Jones", "222-22-2222", 15.50, 65);
        Employee emp3 = new CommissionEmployee("Benjamin", "Jackson", "333-33-3333", 9750, 0.1);
        Employee emp4 = new BasePlusCommissionEmployee("Jane", "Smith", "444-44-4444", 18090, 0.12, 250.00);
        Employee emp5 = new TemporaryPieceWorker("Bob", "Rockets", "555-55-5555", 18, 220);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        for(Employee emp : employees) {
            System.out.println(emp);
            System.out.printf("Total Earnings: $%,.2f\n\n", emp.earnings());
        }
    }
}
