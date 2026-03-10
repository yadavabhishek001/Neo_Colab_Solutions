import java.util.Scanner;

class Product{
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product Name: " + name + ", Price: Rs. " + price;
    }

    public boolean equals(Object obj){
        if(obj instanceof Product){
            Product p = (Product) obj;
            return this.price == p.price;
        }
        return false;
    }
}
class PriceComparator{
    public final void sortByPrice(Product[] products, int n){
        for(int i = 0; i<n-1 ; i++){
            for(int j = i+1; j<n ; j++){
                if(products[i].price > products[j].price){
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
    }
}

class Unit3_Lec18_Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] products = new Product[n];

        for(int i = 0; i<n ; i++){
            String name = sc.next();
            double price = sc.nextDouble();
            products[i] = new Product(name ,price);
        }

        PriceComparator pc = new PriceComparator();
        pc.sortByPrice(products, n);

        for(int i = 0; i<n ; i++){
            System.out.println(products[i]);
        }
        sc.close();

        //Input Format
        // 3
        //Laptop 50000.0
        //Mobile 25000.0
        //Tablet 35000.0
    }  
}
