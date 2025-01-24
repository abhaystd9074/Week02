// Online Retail Order Management
// Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
// Tasks:
// Define a base class Order with common attributes like orderId and orderDate.
// Create a subclass ShippedOrder with additional attributes like trackingNumber.
// Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
// Implement a method getOrderStatus() to return the current order status based on the class level.
// Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

class Order{
    int orderId;
    String OrderDate;
    public Order(int orderId, String OrderDate){
        this.orderId = orderId;
        this.OrderDate = OrderDate;
    }

}
class ShippOrder extends Order{
    int trackNumer;
    public ShippOrder(int orderId, String OrderDate, int trackNumer){
        super(orderId, OrderDate);
        this.trackNumer = trackNumer;
    }

}

class DeliveredOrder extends ShippOrder{
    String deliveryDate;
    public DeliveredOrder(int orderId, String OrderDate,int trackNumber, String deliveryDate){
        super(orderId, OrderDate,trackNumber);
        this.deliveryDate = deliveryDate;
    }
    public void displayDetails(){
        System.out.println("Order ID is: "+orderId);
        System.out.println("Order Date is : "+OrderDate);
        System.out.println("Tracking Number is : "+trackNumer);
        System.out.println("Delivery Date is : "+deliveryDate);
    }
}


public class OrderManagement {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "21/01/2026", 837456873, "26/01/2026");
        d.displayDetails();
    }
    
}
