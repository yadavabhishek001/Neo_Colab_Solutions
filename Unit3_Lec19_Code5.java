import java.util.Scanner;

class Triangle {

    int a, b, c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void checkTriangle() {

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(this.toString());
        } else {
            System.out.println("Not a Triangle");
        }
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Triangle))
            return false;

        Triangle t = (Triangle) obj;

        return a == t.a && b == t.b && c == t.c;
    }
}

class Unit3_Lec19_Code5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        Triangle t = new Triangle(side1, side2, side3);
        t.checkTriangle();

        input.close();
    }
}