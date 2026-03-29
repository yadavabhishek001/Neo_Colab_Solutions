class OuterClass { //Local Class
    void outerMethod() {
        class LocalClass {
            void display() {
                System.out.println("Inside Local Class");
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}