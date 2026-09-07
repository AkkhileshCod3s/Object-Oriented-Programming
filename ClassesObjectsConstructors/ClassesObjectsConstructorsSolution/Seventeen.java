import java.util.*;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double cost() {
        return this.price * this.quantity;
    }
}

class Result {
    static double totalCost(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.cost();
        }
        return total;
    }
}

class Seventeen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Product[] products = new Product[N];

        for (int i = 0; i < N; i++) {
            String name = s.next();
            double price = s.nextDouble();
            int quantity = s.nextInt();

            products[i] = new Product(name, price, quantity);
        }

        System.out.println(Result.totalCost(products));
        s.close();
    }
}