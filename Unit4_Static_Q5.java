import java.util.Scanner;

interface DaysCalculator {
    int calculateDays(int[] date1, int[] date2);
}

class DaysCalculatorImpl {

    public static DaysCalculator createCalculator() {

        return new DaysCalculator() {

            public int calculateDays(int[] date1, int[] date2) {
                return Math.abs(convertToDays(date2) - convertToDays(date1));
            }

            private int convertToDays(int[] date) {
                int y = date[0];
                int m = date[1];
                int d = date[2];

                int days = d;

                int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

                for (int i = 0; i < m - 1; i++) {
                    days += monthDays[i];
                }

                if (m > 2 && isLeap(y)) {
                    days += 1;
                }

                for (int i = 0; i < y; i++) {
                    days += isLeap(i) ? 366 : 365;
                }

                return days;
            }

            private boolean isLeap(int y) {
                return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            }
        };
    }
}

class Unit4_Static_Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] d1 = scanner.nextLine().split("-");
        String[] d2 = scanner.nextLine().split("-");

        int[] date1 = {
            Integer.parseInt(d1[0]),
            Integer.parseInt(d1[1]),
            Integer.parseInt(d1[2])
        };

        int[] date2 = {
            Integer.parseInt(d2[0]),
            Integer.parseInt(d2[1]),
            Integer.parseInt(d2[2])
        };

        DaysCalculator calculator = DaysCalculatorImpl.createCalculator();
        int days = calculator.calculateDays(date1, date2);

        System.out.println("Number of days between the two dates is: " + days);

        scanner.close();
    }
}