class A {
    int i = 10;
}
class B extends A{
    int j = 20;

    void display(){
        System.out.println(j + " " + i);
    }
}
public class Unit3_Lec17_Mcq4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // 20 10
    }
}