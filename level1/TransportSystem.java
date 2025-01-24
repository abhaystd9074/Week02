// Vehicle and Transport System
// Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, 
//and Motorcycle are subclasses with unique attributes.
// Tasks:
// Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
// Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.


class Vehicle{
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed is : "+maxSpeed);
        System.out.println("Fuel Type is : "+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity is : "+seatCapacity);
    }
}
class Truck extends Vehicle{
    int loadCapacity;
    public Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity is : "+loadCapacity);
    }
}
class Motorcycle extends Vehicle{
    String name;
    public Motorcycle(int maxSpeed, String fuelType, String name){
        super(maxSpeed, fuelType);
        this.name = name;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type is : "+name);
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(120, "Petrol", 5);
        vehicles[0].displayInfo();
        System.out.println();
        vehicles[1] = new Truck(80, "Diesel", 1000);
        vehicles[1].displayInfo();
        System.out.println();
        vehicles[2] = new Motorcycle(150, "Petrol", "Sportsbike");
        vehicles[2].displayInfo();
    }
    
}
