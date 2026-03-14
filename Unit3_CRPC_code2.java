import java.util.*;

class EnvironmentalMetrics {
    protected double electricityUsage;
    protected double transportationEmissions;

    EnvironmentalMetrics(double electricityUsage, double transportationEmissions) {
        this.electricityUsage = electricityUsage;
        this.transportationEmissions = transportationEmissions;
    }
}

final class CarbonFootprintCalculator extends EnvironmentalMetrics {

    final double electricityEmissionFactor = 0.4;
    final double transportationEmissionFactor = 2.5;

    CarbonFootprintCalculator(double electricityUsage, double transportationEmissions) {
        super(electricityUsage, transportationEmissions);
    }

    void estimateCarbonEmissions() {
        double electricity = electricityUsage * electricityEmissionFactor;
        double transportation = transportationEmissions * transportationEmissionFactor;
        double total = electricity + transportation;

        System.out.printf("Electricity: %.2f kgCO2\n", electricity);
        System.out.printf("Transportation: %.2f kgCO2\n", transportation);
        System.out.printf("Total: %.2f kgCO2", total);
    }
}

class Unit3_CRPC_code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double electricity = sc.nextDouble();
        double transportation = sc.nextDouble();

        CarbonFootprintCalculator calculator =
                new CarbonFootprintCalculator(electricity, transportation);

        calculator.estimateCarbonEmissions();
    }
}