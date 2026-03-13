class Car {
    void fuel() {
        System.out.println("Can have diesel or petrol as the fuel");
    }
}
class Sedan extends Car {
    void fuel() {
        System.out.println("Shiny Car, but runs on diesel.");
    }
}
class Engine extends Sedan {
    void fuel() {
        System.out.println("Converting diesel to smooth motion!");
    }
}

class Unit3_Lec17_Overriding {
    public static void main(String args[]) {

        Car a1, a2, a3;

        a1 = new Car();
        a2 = new Sedan();
        a3 = new Engine();

        a1.fuel();
        a2.fuel();
        a3.fuel();
    }
}
