import java.util.Scanner;
import java.text.DecimalFormat;

class Pizza {
    double basePrice;
    double toppingCost;

    Pizza(double basePrice, double toppingCost) {
        this.basePrice = basePrice;
        this.toppingCost = toppingCost;
    }

    double calculatePrice(int numberOfToppings) {
        return basePrice + (toppingCost * numberOfToppings);
    }

}

class DiscountedPizza extends Pizza {

    DiscountedPizza(double basePrice, double toppingCost) {
        super(basePrice, toppingCost);
    }

    double calculatePrice(int numberOfToppings) {
        double price = basePrice + (toppingCost * numberOfToppings);

        if (numberOfToppings > 3) {
            price = price - (price * 0.10);
        }

        return price;
    }
}

class Unit3_CRPC_code8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double basePrice = scanner.nextDouble();
        double toppingCost = scanner.nextDouble();
        int numberOfToppings = scanner.nextInt();

        Pizza pizza = new Pizza(basePrice, toppingCost);
        DiscountedPizza discountedPizza = new DiscountedPizza(basePrice, toppingCost);

        DecimalFormat df = new DecimalFormat("#.00");

        double regularPrice = pizza.calculatePrice(numberOfToppings);
        double discountedPrice = discountedPizza.calculatePrice(numberOfToppings);

        System.out.println("Price without discount: Rs." + df.format(regularPrice));
        System.out.println("Price with discount: Rs." + df.format(discountedPrice));

        scanner.close();
    }

}
