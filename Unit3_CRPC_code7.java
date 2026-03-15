import java.util.*;

abstract class FinancialCalculator {
    abstract double calculateCompoundInterest(double p, double r, int n);
    abstract double calculateFutureValue(double p, double r, int n);
    abstract double calculateMonthlyLoanPayment(double p, double r, int n);
}

class InvestmentCalculator extends FinancialCalculator {

    double calculateCompoundInterest(double p, double r, int n) {
        return p * Math.pow((1 + r / 100), n) - p;
    }

    double calculateFutureValue(double p, double r, int n) {
        return p * Math.pow((1 + r / 100), n);
    }

    double calculateMonthlyLoanPayment(double p, double r, int n) {
        return 0;
    }
}

class LoanCalculator extends FinancialCalculator {

    double calculateCompoundInterest(double p, double r, int n) {
        return 0;
    }

    double calculateFutureValue(double p, double r, int n) {
        return 0;
    }

    double calculateMonthlyLoanPayment(double p, double r, int n) {
        double monthlyRate = r / (12 * 100);
        int months = n * 12;

        return (p * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }
}

class Unit3_CRPC_code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int duration = sc.nextInt();
        int choice = sc.nextInt();

        if (choice == 1) {
            InvestmentCalculator ic = new InvestmentCalculator();

            double ci = ic.calculateCompoundInterest(principal, rate, duration);
            double fv = ic.calculateFutureValue(principal, rate, duration);

            System.out.printf("Compound Interest: %.2f\n", ci);
            System.out.printf("Future Value: %.2f\n", fv);
        } 
        else if (choice == 2) {
            LoanCalculator lc = new LoanCalculator();

            double loan = lc.calculateMonthlyLoanPayment(principal, rate, duration);

            System.out.printf("Monthly Loan Payment: %.2f\n", loan);
        } 
        else {
            System.out.println("Invalid choice");
        }
    }
}