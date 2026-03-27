import java.util.Scanner;
class Area5 {
    int l,b;
    Scanner sc = new Scanner(System.in);
    Area5(){
        l = 5;
        b = 6;
    }
    Area5(int l, int b){
        this.l = l;
        this.b = b;
    }
    void getData(){
        int l = sc.nextInt();
        System.out.println("Length is : " + l);
        int b = sc.nextInt();
        System.out.println("Breadth is : " + b);
        
    }
    void computeArea5(){
        System.out.println("Area is : " + l*b);
    }
}
class Volume5 extends Area5{
    int l,b,h;
    Scanner sc = new Scanner(System.in);
    Volume5 (){
        l = 0;
        b = 0;
        h = 0;
    }
    Volume5(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void getData(){
        super.getData();
        int l = sc.nextInt();
        System.out.println("Length is : " + l);
        int b = sc.nextInt();
        System.out.println("Breadth is : " + b);
        int h = sc.nextInt();
        System.out.println("Height is : " + h);
        
    }
    void computeVolume5(){
        System.out.println("Volume is : " + l*b*h);
    }
}

class TestInheritance5{
    public static void main(String[] args) {
        Volume5 obj = new Volume5(2,3,4);
        obj.getData();
        obj.computeVolume5();
        obj.computeArea5();
    }
}


