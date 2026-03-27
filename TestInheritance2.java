class Area2 {
    int l,b;
    Area2(){
        l = 5;
        b = 6;
    }
    Area2(int l, int b){
        this.l = l;
        this.b = b;
    }
    void computeArea2(){
        System.out.println("Area is : " + l*b);
    }
}
class Volume2 extends Area2{
    int l,b,h;

    Volume2(){
        l = 0;
        b = 0;
        h = 0;
    }
    Volume2(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void computeVolume2(){
        System.out.println("Volume is : " + l*b*h);
    }
}

class TestInheritance2{
    public static void main(String[] args) {
        Volume2 obj = new Volume2(2,3,4);
        obj.computeVolume2();
        obj.computeArea2();
    }
}
