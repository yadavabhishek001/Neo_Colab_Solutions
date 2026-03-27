import java.util.Scanner;
class Area4 {
    int l,b;
    Scanner sc = new Scanner(System.in);
    Area4(){
        l = 5;
        b = 6;
    }
    Area4(int l, int b){
        this.l = l;
        this.b = b;
    }
    void getData(){
        int l = sc.nextInt();
        System.out.println("Length is : " + l);
        int b = sc.nextInt();
        System.out.println("Breadth is : " + b);
        
    }
    void computeArea4(){
        System.out.println("Area is : " + l*b);
    }
}
class Volume4 extends Area4{
    int l,b,h;
    Scanner sc = new Scanner(System.in);
    Volume4 (){
        l = 0;
        b = 0;
        h = 0;
    }
    Volume4(int l, int b, int h){
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
    void computeVolume4(){
        System.out.println("Volume is : " + l*b*h);
    }
}

class TestInheritance4{
    public static void main(String[] args) {
        Volume4 obj = new Volume4(2,3,4);
        obj.getData();
        obj.computeVolume4();
        obj.computeArea4();
    }
}

