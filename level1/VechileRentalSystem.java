// Vehicle Rental System
// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

interface Insurable{
    public void calculateInsurance();
    public void getInsuranceDetails();
}
abstract class Vehicle implements Insurable{
    private String vehicleNumber;
    private String type;
    private int rentalRate;
    private int insurance;
    public Vehicle(String vehicleNumber,String type,int rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public abstract void calculateRentalCost(int days);
    public void setInsurance(int insurance){
        this.insurance=insurance;
    }
    public void displayDetails(){
        System.out.println("vehicle number is: "+ vehicleNumber);
        System.out.println("vehicle type is: "+ type);
        System.out.println("vehicle rental rate is: "+ rentalRate);
        System.out.println("vehicle insurance is: "+ insurance);
    }
}
class Car extends Vehicle implements Insurable{
    private int rentalRate;
    public Car(String vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
        this.rentalRate=rentalRate;
    }
    public void calculateRentalCost(int days){
        int totalCost=days*rentalRate;
        System.out.println("total cost for car is: "+ totalCost);
    }
    public void calculateInsurance(){
        super.setInsurance(1000);
    }
    public void getInsuranceDetails(){
        System.out.println("insurance for car is 1000");
    }
}
class Bike extends Vehicle implements Insurable{
    private int rentalRate;
   
    public Bike(String vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
        this.rentalRate=rentalRate;
    }
    public void calculateRentalCost(int days){
        int totalCost=days*rentalRate;
        System.out.println("total cost for bike is: "+ totalCost);
    }
    public void calculateInsurance(){
        super.setInsurance(500);
    }
    public void getInsuranceDetails(){
        System.out.println("insurance for bike is 500");
    }
}
class Truck extends Vehicle implements Insurable{
    private int rentalRate;
    public Truck(String vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
        this.rentalRate=rentalRate;
    }
    public void calculateRentalCost(int days){
        int totalCost=days*rentalRate;
        System.out.println("total cost for truck is: "+ totalCost);
    }
    public void calculateInsurance(){
        super.setInsurance(2000);
    }
    public void getInsuranceDetails(){
        System.out.println("insurance for truck is 2000");
    }
}
public class VechileRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car("1234","car",1000);
        vehicles[1]=new Bike("5678","bike",500);
        vehicles[2]=new Truck("91011","truck",2000);
       
        for(Vehicle vehicle:vehicles){
            
            vehicle.calculateInsurance();
            vehicle.displayDetails();
            vehicle.calculateRentalCost(5);
            System.out.println();
            
        }
    }
    
}
