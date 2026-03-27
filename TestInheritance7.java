import java.util.Scanner;

class Area7 {
    int l, b;
    Scanner sc = new Scanner(System.in);

    Area7() {
        l = 0;
        b = 0;
    }

    Area7(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void getData() {
        System.out.print("Enter Length: ");
        l = sc.nextInt();

        System.out.print("Enter Breadth: ");
        b = sc.nextInt();
    }

    void computeArea7() {
        System.out.println("Area is: " + (l * b));
    }
}

class Volume7 extends Area7 {
    int h;

    Volume7(int l, int b, int h) {
        super(l, b);
        this.h = h;
    }

    void getData() {
        super.getData();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height: ");
        h = sc.nextInt();
        sc.close();
    }

    void computeVolume7() {
        System.out.println("Volume is: " + (l * b * h));
    }
}

class TestInheritance7 {
    public static void main(String[] args) {

        Volume7 obj = new Volume7(2, 3, 4);

        obj.getData();
        obj.computeVolume7();
        obj.computeArea7();
        obj.sc.close();
    }
}


