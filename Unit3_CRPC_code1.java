import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class FitnessEnthusiast extends Person {
    int duration;
    double burnRate;

    FitnessEnthusiast(String name, int duration, double burnRate) {
        super(name);
        this.duration = duration;
        this.burnRate = burnRate;
    }

    double calculateCaloriesBurned() {
        return duration * burnRate;
    }
}

class Unit3_CRPC_code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int duration = sc.nextInt();
        double burnRate = sc.nextDouble();

        FitnessEnthusiast f = new FitnessEnthusiast(name, duration, burnRate);
        System.out.printf("Calories Burned: %.1f calories", f.calculateCaloriesBurned());
    }
}
