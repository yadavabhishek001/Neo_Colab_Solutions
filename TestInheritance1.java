class Area1 {
    int l,b;
    Area1(){
        l = 0;
        b = 0;
    }
    Area1(int l, int b){
        this.l = l;
        this.b = b;
    }
    void computeArea1(){
        System.out.println("Area is : " + l*b);
    }
}
class Volume1 extends Area1{
    int l,b,h;

    Volume1(){
        l = 0;
        b = 0;
        h = 0;
    }
    Volume1(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void computeVolume1(){
        System.out.println("Volume is : " + l*b*h);
    }
}

class TestInheritance1{
    public static void main(String[] args) {
        Volume1 obj = new Volume1();
        obj.computeVolume1();
        obj.computeArea1();
    }
}
