import java.util.Scanner;

class BusinessUtility{
    double revenue;
    double cost;

    BusinessUtility(double a, double b){
        revenue = a;
        cost = b;
    }
    double calculateMargin(){
        return ((revenue - cost) / revenue) * 100 ;
    }
}
class SeasonalBusinessUtility extends BusinessUtility{
    SeasonalBusinessUtility(double x1, double x2){
        super(x1,x2);
    }
    double calculateMargin(){
        return ( ( (revenue - cost) / revenue) * 100) + 10;
    }
}

class Unit3_Lec17_Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double revenue = sc.nextDouble();
        double cost = sc.nextDouble();

        BusinessUtility bu = new BusinessUtility(revenue, cost);
        SeasonalBusinessUtility sbu = new SeasonalBusinessUtility(revenue, cost);

        double regularMargin = bu.calculateMargin();
        double seasonalMargin = sbu.calculateMargin();

        System.out.printf("Regular Margin: %.2f%%%n", regularMargin);
        System.out.printf("Seasonal Margin: %.2f%%%n", seasonalMargin);

        if(regularMargin < 10){
            System.out.println("Business is not profitable.");
        }
        else{
            System.out.println("Business is profitable.");
        }
    }
}
