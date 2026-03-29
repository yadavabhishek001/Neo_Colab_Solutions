class Outer { // nested Class
    int instanceVar = 20;

    class Inner {
        void print() {
            // Inner class can access private/instance members of Outer class
            System.out.println("Instance Var: " + instanceVar);
        }
    }

    public static void main(String[] args) {
        // 1. Create an object of the Outer class
        Outer outerObject = new Outer();

        // 2. Create an object of the Inner class using the Outer object
        Outer.Inner innerObject = outerObject.new Inner();

        // 3. Call the method
        innerObject.print();
    }
}
