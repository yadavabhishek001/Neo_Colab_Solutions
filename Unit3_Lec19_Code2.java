import java.util.Scanner;

abstract class Account {
    String accountHolder;
    double principalAmount;

    Account(String name, double principal) {
        accountHolder = name;
        principalAmount = principal;
    }

    abstract double calculateInterest();
}

class FixedDeposit extends Account {
    int years;
    double rate;

    FixedDeposit(String name, double principal, int years, double rate) {
        super(name, principal);
        this.years = years;
        this.rate = rate;
    }

    double calculateInterest() {
        return (principalAmount * years * rate) / 100;
    }
}

class RecurringDeposit extends Account {
    int monthlyDeposit;
    int months;
    double rate;

    RecurringDeposit(String name, double principal, int deposit, int months, double rate) {
        super(name, principal);
        this.monthlyDeposit = deposit;
        this.months = months;
        this.rate = rate;
    }

    double calculateInterest() {
        double maturityAmount = monthlyDeposit * months;
        return (maturityAmount * months * rate) / (12 * 100);
    }
}

class Unit3_Lec19_Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                sc.nextLine();
                String fdName = sc.nextLine();
                double fdPrincipal = sc.nextDouble();
                int fdDuration = sc.nextInt();
                double fdRate = sc.nextDouble();

                FixedDeposit fd = new FixedDeposit(fdName, fdPrincipal, fdDuration, fdRate);
                System.out.printf("Interest for FD: %.1f", fd.calculateInterest());
                break;

            case 2:
                sc.nextLine();
                String rdName = sc.nextLine();
                int rdDeposit = sc.nextInt();
                int rdDuration = sc.nextInt();
                double rdRate = sc.nextDouble();

                RecurringDeposit rd = new RecurringDeposit(rdName, 0, rdDeposit, rdDuration, rdRate);
                System.out.printf("Interest for RD: %.1f", rd.calculateInterest());
                break;

            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}