import java.util.Scanner;

class Shape{
    double r1;
    double r2;

    double calculateArea(){
        return .5*r1*r2;
    }
}

final class Rhombus extends Shape{
    private final double d1;
    private final double d2;

    Rhombus(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    double calculateArea(){
        return .5*d1*d2;
    }
}

class Unit3_Lec18_Code1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diagonal1 = sc.nextDouble();
        double diagonal2 = sc.nextDouble();

        Rhombus rhombus = new Rhombus(diagonal1, diagonal2);

        double area = rhombus.calculateArea();
        System.out.printf("%.2f\n",area);
        sc.close();
        //Input Format
        //15.3 12.5 --> 95.63
    }
}
