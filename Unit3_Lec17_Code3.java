import java.util.Scanner;

class Parcel{
    int a;

    Parcel(int a){
        this.a = a;
    }
    int getRegularCost(){
        return a;
    }
}
class FragileParcel extends Parcel{
    int b;
    int c;
    FragileParcel(int a, int b, int c){
        super(a);
        this.b = b;
        this.c = c;
    }

    int getFragileCost(){
        return a+b+c;
    }
}
class Unit3_Lec17_Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int regularCost = sc.nextInt();
        int packingCost = sc.nextInt();
        int insuranceCost = sc.nextInt();

        Parcel p = new Parcel(regularCost);
        FragileParcel fp = new FragileParcel(regularCost, packingCost, insuranceCost);

        System.out.println("Regular Parcel Cost: " + p.getRegularCost() + " rupees");
        System.out.println("Fragile Parcel Cost: " + fp.getFragileCost() + "rupees");

    }
}
