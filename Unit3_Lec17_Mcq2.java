class Base{
    int calculate(int a, int b){
        return a+b;
    }
}
class Derived extends Base{
    int calculate(int a, int b){
        return a * b;
    }
}
class Unit3_Lec17_Mcq2 {
    public static void main(String[] args) {
        Base obj = new Derived();
        int result1 = obj.calculate(4,3);
        int result2 = obj.calculate(2, 5);

        System.out.println(result1+result2); // 22
    }
}
