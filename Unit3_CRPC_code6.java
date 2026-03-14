import java.util.*;

abstract class Employee {

    String name;
    double baseSalary;
    double bonus;

    Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    abstract double calculateNetSalary();
}

class Engineer extends Employee {

    Engineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    double calculateNetSalary() {
        double gross = baseSalary + bonus;
        double tax = gross * 0.10;
        double benefit = 100;

        return gross - tax + benefit;
    }
}

class SoftwareEngineer extends Employee {

    SoftwareEngineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    double calculateNetSalary() {
        double gross = baseSalary + bonus;
        double tax = gross * 0.15;
        double benefit = 150;

        return gross - tax + benefit;
    }
}
class Unit3_CRPC_code6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double baseSalary = scanner.nextDouble();
        double bonus = scanner.nextDouble();
        int employeeType = scanner.nextInt();

        Employee employee;

        if (employeeType == 1) {
            employee = new Engineer(name, baseSalary, bonus);
        } 
        else if (employeeType == 2) {
            employee = new SoftwareEngineer(name, baseSalary, bonus);
        } 
        else {
            System.out.println("Invalid");
            return;
        }

        double netSalary = employee.calculateNetSalary();
        System.out.println(netSalary);
    }
}