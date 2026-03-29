class Outer { // Static class
    static int staticVar = 10;

    static class StaticNested {
        void print() {
            // Static nested classes can access static members of the outer class directly
            System.out.println("Static Var: " + staticVar);
        }
    }

    public static void main(String[] args) {
        // You do not need an instance of 'Outer' to create an instance of 'StaticNested'
        StaticNested nestedObject = new StaticNested();
        
        nestedObject.print();
    }
}
