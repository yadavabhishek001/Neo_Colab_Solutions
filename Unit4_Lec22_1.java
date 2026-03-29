class OuterClass {
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    public static void main(String[] args) {
        // Accessing the static nested class without an OuterClass instance
        StaticNestedClass nestedObject = new StaticNestedClass();
        
        // Calling the method
        nestedObject.display();
    }
}
