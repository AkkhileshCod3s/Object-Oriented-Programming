import java.util.*;

class Invoice {
    int invoiceNumber;
    String itemName;
    int quantity;
    double price;
    double taxPercentage;

    Invoice(int invoiceNumber,String itemName,int quantity,double price,double taxPercentage) {
        this.invoiceNumber = invoiceNumber;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.taxPercentage = taxPercentage;
    }

    double finalAmount() {
        double baseCost = this.price * this.quantity;
        double taxAmount = baseCost * (this.taxPercentage / 100.0);
        return baseCost + taxAmount;
    }
}

class Result {
    static double calculateInvoice(int invoiceNumber,String itemName,int quantity,double price,double taxPercentage) {
        Invoice i = new Invoice(invoiceNumber, itemName, quantity, price, taxPercentage);
        return i.finalAmount();
    }
}

class Twenty {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int invoiceNumber = s.nextInt();
        s.nextLine();

        String itemName = s.nextLine();

        int quantity = s.nextInt();
        double price = s.nextDouble();
        double taxPercentage = s.nextDouble();

        System.out.println(Result.calculateInvoice(invoiceNumber, itemName, quantity,price, taxPercentage));
        s.close();
    }
}