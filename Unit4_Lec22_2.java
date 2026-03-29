class OuterClass { // Non Static class
    class InnerClass {
        void display() {
            System.out.println("Inside Non Static Inner Class");
        }
    }

    public static void main(String[] args) {
        // 1. Create an object of the Outer class
        OuterClass outerObject = new OuterClass();

        // 2. Create an object of the Inner class using the Outer class object
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        // 3. Call the method of the Inner class
        innerObject.display();
    }
}
