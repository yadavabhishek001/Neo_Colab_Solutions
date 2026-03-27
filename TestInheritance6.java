class Animal{
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking..");
    }
}
class BabyDog extends Dog{
    void cry(){
        System.out.println("Crying..");
    }
}
class TestInheritance6 {
    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.bark();
        obj.cry();
    }
}
