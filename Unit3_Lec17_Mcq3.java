class A{
    public int i;
    protected int j;
}

class B extends A{
    int j;

    void display(){
        super.j = 3;
        super.i = 10;
        System.out.println(super.i + " " + super.j);
        System.out.println(i + " " + j);
    }
}
class Unit3_Lec17_Mcq3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.i = 1;
        obj.j = 2;
        obj.display(); // 10 3 | 10 2
    }
}
