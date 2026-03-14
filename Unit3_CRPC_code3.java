import java.util.*;

class Ticket {
    double calculatePrice(int distance) {
        return distance * 0.05;
    }
}

class SeniorCitizenTicket extends Ticket {
    double calculatePrice(int distance) {
        double price = distance * 0.05;
        return price * 0.9;
    }
}

class Unit3_CRPC_code3{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int age = scanner.nextInt();

        Ticket ticketUtility;

        if (age >= 60) {
            ticketUtility = new SeniorCitizenTicket();
        } else {
            ticketUtility = new Ticket();
        }

        double ticketPrice = ticketUtility.calculatePrice(distance);

        if (age < 60) {
            System.out.printf("Regular Passenger Ticket Price: %.1f", ticketPrice);
        } else {
            System.out.printf("Senior Citizen Ticket Price: %.1f", ticketPrice);
        }

        scanner.close();
    }
}