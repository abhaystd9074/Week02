class Vehicle {
     static double registrationFee = 100.0;
     final String registrationNumber;
     String ownerName;
     String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void display() {
        System.out.println("Registration Number of vechile is : " + registrationNumber);
        System.out.println("Owner Name of vechile is : " + ownerName);
        System.out.println("Tpye of vechile is : " + vehicleType);
        System.out.println("Registration Fee is : " + registrationFee);
    }

   
}


public class VechileRegistration {
    public static void main(String[] args) {
        System.out.println("intially  registration fee is : " + Vehicle.registrationFee);   
        Vehicle.updateRegistrationFee(150.0);
        System.out.println("Updated registration fee is : " + Vehicle.registrationFee);

        Vehicle vehicle1 = new Vehicle("Abhay", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Nishank", "Motorcycle", "XYZ789");

        if (vehicle1 instanceof Vehicle) {
            System.out.println();
            System.out.println("vehicle1 is an instance of Vehicle");
            System.out.println("Displaying vehicle1 details");
            vehicle1.display();
        }

        if (vehicle2 instanceof Vehicle) {
            System.out.println();
            System.out.println("vehicle2 is an instance of Vehicle");
            System.out.println("Displaying vehicle2 details");
            vehicle2.display();
        }
    }
}