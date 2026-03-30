interface Animal {
    void sound();
}
class OuterClass {
    void outerMethod() {
        // Creating an Anonymous Inner Class that implements Animal interface
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("Roar!");
            }
        };
        
        // Calling the method of the anonymous class
        animal.sound();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}

