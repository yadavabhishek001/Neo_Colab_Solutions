import java.util.Scanner;

class Product{
    public double price;
}

class DiscountedProduct extends Product{
    private double discountRate;

    DiscountedProduct(double a, double b){
        price = a;
        discountRate = b;
    }
    double calculateSellingPrice(){
        return price*(1-discountRate);
    }
}

class Unit3_Lec17_Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialPrice = sc.nextDouble();
        double discountRate = sc.nextDouble();

        DiscountedProduct discountedProduct = new DiscountedProduct(initialPrice, discountRate);
        Double sellingPrice = discountedProduct.calculateSellingPrice();

        if(sellingPrice >= 0){
            System.out.println("Rs. %.2f%n" + sellingPrice);
        }
        else{
            System.out.println("not applicable");
        }
        sc.close();
    }
}
