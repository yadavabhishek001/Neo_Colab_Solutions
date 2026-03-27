class Area3 {
    int l,b;
    Area3(){
        l = 5;
        b = 6;
    }
    Area3(int l, int b){
        this.l = l;
        this.b = b;
    }
    void computeArea3(){
        System.out.println("Area is : " + l*b);
    }
}
class Volume3 extends Area3{
    int l,b,h;

    Volume3(){
        super();
        l = 0;
        b = 0;
        h = 0;
    }
    Volume3(int l, int b, int h){
        super(5,4);
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void computeVolume3(){
        System.out.println("Volume is : " + l*b*h);
    }
}

class TestInheritance3{
    public static void main(String[] args) {
        Volume3 obj = new Volume3(2,3,4);
        obj.computeVolume3();
        obj.computeArea3();
    }
}
