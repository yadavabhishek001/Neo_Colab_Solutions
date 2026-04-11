import java.util.Scanner;

class GrowthLogger {

    double height;

    GrowthLogger(double initialHeight) {
        this.height = initialHeight;
    }

    class PlantGrowth {
        double grow(double dailyGrowth) {
            height += dailyGrowth;
            return height;
        }
    }

    public double[] startMonitoring(int days, double dailyGrowth) {
        double[] result = new double[days];
        PlantGrowth pg = new PlantGrowth();

        for (int i = 0; i < days; i++) {
            result[i] = pg.grow(dailyGrowth);
        }

        return result;
    }
}

class Unit4_Static_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialHeight = scanner.nextDouble();
        double dailyGrowth = scanner.nextDouble();
        int days = scanner.nextInt();

        GrowthLogger growthLogger = new GrowthLogger(initialHeight);
        double[] growthLogs = growthLogger.startMonitoring(days, dailyGrowth);

        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + ": " + String.format("%.2f", growthLogs[i]) + " inches");
        }

        scanner.close();
    }
}