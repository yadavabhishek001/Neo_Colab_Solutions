    class A {
    public void printValue() {
        System.out.println("Value-A");
    }
}

class B extends A {
    public void printNameB() {
        System.out.println("Name-B");
    }
}

class C extends A {
    public void printNameC() {
        System.out.println("Name-C");
    }
}

class Unit3_Lec18_Mcq1 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        newPrint(b);
        newPrint(c);
    }

    public static void newPrint(A a) {
        a.printValue();
    }
}
