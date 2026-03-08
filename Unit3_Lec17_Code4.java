import java.util.Scanner;
class Customer{
    int a;
    int calculateLoyaltyPoints(int a){
        return a/10;
    }
}
class PremiumCustomer extends Customer{
    int calculateLoyaltyPoints(int a){
        return 2 * (a / 10);
    }
}
class Unit3_Lec17_Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountSpent = sc.nextInt();
        String isPremium = sc.next().toLowerCase();

        Customer customer;

        if(isPremium.equals("yes")){
            customer = new PremiumCustomer();
        }
        else{
            customer = new Customer();
        }

        int loyaltyPoints = customer.calculateLoyaltyPoints(amountSpent);

        System.out.println(loyaltyPoints);
    }
}
