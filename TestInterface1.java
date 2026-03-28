interface Area {
    double pi = 3.14;
    double compute(double a, double b);
}

interface Display extends Area {
    void show();
}

class Rect implements Display {

    double result;

    public double compute(double a, double b) {
        result = a * b;
        return result;
    }

    public void show() {
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle implements Display {

    double result;

    public double compute(double a, double b) {
        result = pi * a * a;
        return result;
    }

    public void show() {
        System.out.println("Area of Circle: " + result);
    }
}

class TestInterface1 {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.compute(2.3,4);
        r.show();

        Circle c = new Circle();
        c.compute(2.3,0);
        c.show();
    }
}