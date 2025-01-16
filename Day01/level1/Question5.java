import java.util.*;

class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Brand name is : " + brand);
        System.out.println("Model name is: " + model);
        System.out.println("Price name is  " + price);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Phone Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Mobile Phone Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Mobile Phone Price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.showDetails();
    }
}