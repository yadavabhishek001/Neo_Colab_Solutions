class Bank{
    double interest(double amount){
        return amount * 0.06;
    }
}
class SBI extends Bank{
    double interest(double amount){
        return amount * 0.06;
    }
}
public class Unit3_Lec17_Mcq1 {
    public static void main(String[] args) {
        Bank b = new SBI();
        double i1 = b.interest(1000);
        double i2 = b.interest(2000);

        System.out.println(i1 + i2); // 180.0
    }
}