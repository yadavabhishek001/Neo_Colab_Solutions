// Outer class
class Outer {

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner Class");
        }
    }
}

class TestInner {
    public static void main(String[] args) {
        Outer outer = new Outer();              // create outer object
        Outer.Inner inner = outer.new Inner();  // create inner object
        inner.display();                        // call method
    }
}