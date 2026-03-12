import java.util.Scanner;

class SuperClass {
    int variableA;

    SuperClass(int a) {
        variableA = a;
    }
}

class SubClass extends SuperClass {
    int variableB;

    SubClass(int a) {
        super(a);
        variableB = 2 * super.variableA;
    }

    void displayVariables() {
        System.out.println("The value of SuperClass: " + variableA);
        System.out.println("The value of SubClass: " + variableB);
    }
}

class Unit3_Lec19_Code1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        SubClass obj = new SubClass(value);
        obj.displayVariables();
        sc.close();
    }
}
