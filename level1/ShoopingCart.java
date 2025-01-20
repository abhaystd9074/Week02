class Product {
     static double discount = 10;
     final int productID;
     String productName;
     double price;
     int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void display() {
        System.out.println("Product ID is: " + productID);
        System.out.println("Product Name is : " + productName);
        System.out.println("Price of product is : " + price);
        System.out.println("Quantity is : " + quantity);
        System.out.println("Discount % is : " + discount );
        System.out.println();
    }

    public static double getDiscount() {
        return discount;
    }
}


public class ShoopingCart {
    public static void main(String[] args) {
        System.out.println("intially Discount % is : " + Product.getDiscount());
        System.out.println();
        Product.updateDiscount(20.0);
        System.out.println("After updating Discount % is : " + Product.getDiscount());

        Product product1 = new Product(1, "Laptop", 1000.0, 2);
        Product product2 = new Product(2, "Phone", 500.0, 5);

        if (product1 instanceof Product) {
            System.out.println();
            System.out.println("product1 is an instance of Product\n");
            System.out.println("Displaying product1 details\n");
            product1.display();
        }

        if (product2 instanceof Product) {
            System.out.println("product2 is an instance of Product\n");
            System.out.println("Displaying product2 details\n");
            product2.display();
        }
    }
}