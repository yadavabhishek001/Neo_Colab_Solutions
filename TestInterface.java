import java.util.Scanner;

interface Area {
    public final float PI = 3.14f;
    public abstract double compute(double a, double b); // public abstract is not necesarry
}
class Rect implements Area{
    public double compute(double a, double b){
        return (a*b);
    }
}
class Circle implements Area{
    public double compute(double a, double b){
        return PI*a*a;
    }
}

class TestInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rect obj = new Rect();
        System.out.println(obj.compute(2.3, 5.4));
        Circle ref = new Circle();
        System.out.println(ref.compute(5.0, 0));
        sc.close();
    }
}
