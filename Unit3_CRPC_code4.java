import java.util.*;

class CarUtility {
    double calculateRange(double fuel, double mileage) {
        double range = fuel * mileage;
        if (range < 50) {
            System.out.println("Low Range Warning!");
        }
        return range;
    }
}

class EcoCarUtility extends CarUtility {
    double calculateRange(double fuel, double mileage) {
        double range = fuel * mileage;

        if (range < 50) {
            System.out.println("Low Range Warning!");
            return range;
        }

        return range + 20;
    }
}

class Unit3_CRPC_code4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double regularFuel = scanner.nextDouble();
        double regularMileage = scanner.nextDouble();

        double ecoFuel = scanner.nextDouble();
        double ecoMileage = scanner.nextDouble();

        CarUtility car = new CarUtility();
        double regularRange = car.calculateRange(regularFuel, regularMileage);
        System.out.println("Regular Car Range: " + regularRange + " miles");

        EcoCarUtility ecoCar = new EcoCarUtility();
        double ecoRange = ecoCar.calculateRange(ecoFuel, ecoMileage);
        System.out.println("Eco Car Range: " + ecoRange + " miles");

        scanner.close();
    }
}