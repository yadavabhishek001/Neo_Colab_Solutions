@FunctionalInterface
interface Greeting {
    void greet(String name); // single abstract method
}

class TestFunctionalInterface {
    public static void main(String[] args) {

        // Using lambda to implement interface
        Greeting g = (name) -> {
            System.out.println("Hello " + name);
        };

        g.greet("Abhishek");
    }
}
