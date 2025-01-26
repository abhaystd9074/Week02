// E-Commerce Platform
// Description: Develop a simplified e-commerce platform:
// Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
// Extend it into concrete classes: Electronics, Clothing, and Groceries.
// Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
// Use encapsulation to protect product details, allowing updates only through setter methods.
// Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.


interface Taxable{
    public void calculateTax();
    public void getTaxDetails();
}
abstract class Product implements Taxable{
    private String name;
    private int price;
    private int productId;
    private int discount;
    private int tax;
    public  Product(String name,int price,int productId){
        this.name=name;
        this.price=price;
        this.productId=productId;
    }
    public abstract void calculateDiscount();
    public void setDiscount(int discount){
        this.discount=discount;
    }
    public void setTax(int tax){
        this.tax=tax;
    }
    public void calculateFinalPrice(){
        int finalPrice=price+tax-discount;
        System.out.println("product name is: "+ name);
        System.out.println("product id is: "+ productId);
        System.out.println("product mrp is: "+ price);
        System.out.println("given discount is: "+ discount);
        System.out.println("final price is after discount and tax: "+ finalPrice);
    }
}

class Electronics extends Product implements Taxable{
    private int discount;
    public Electronics(String name,int price,int productId,int discount){
        super(name, price, productId);
        this.discount=discount; 
    }
    public void calculateDiscount(){
        setDiscount(discount);
    }
    public void calculateTax(){
        super.setTax(10);
    }
    public void getTaxDetails(){
        System.out.println("tax is 10% for this item");
    }
}
class Clothing extends Product implements Taxable{
    private int discount;

    public Clothing(String name,int price,int productId,int discount){
        super(name, price, productId);
        this.discount=discount;
    }
    public void calculateDiscount(){
        setDiscount(discount);
    }
    public void calculateTax(){
        super.setTax(20);
    }
    public void getTaxDetails(){
        System.out.println("tax is 20% for this item");
    }
}
class Groceries extends Product implements Taxable{
    private int discount;
    public Groceries(String name,int price,int productId,int discount){
        super(name, price, productId);
        this.discount=discount;
    }
    public void calculateDiscount(){
        setDiscount(discount);
    }
    public void calculateTax(){
        super.setTax(20);
    }
    public void getTaxDetails(){
        System.out.println("tax is 20% for this item");
    }
}





public class ECommerce {
    public static void main(String[] args) {
        Product[] products=new Product[3];
        products[0]=new Electronics("laptop", 50000, 1, 5000);
        products[1]=new Clothing("shirt", 1000, 2, 100);
        products[2]=new Groceries("rice", 50, 3, 5);
        for(Product product:products){
            product.calculateDiscount();
            product.calculateTax();
            product.calculateFinalPrice();
            product.getTaxDetails();
            
            System.out.println();
        }
    }
    
}
