import java.util.Scanner;

class MovieTicket {
    Scanner sc=new Scanner(System.in);
     String movieName;
     int seatNumber;
     double price;
    static boolean []isBooked=new boolean[100];

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket() {
        if (!isBooked[seatNumber]) {
            isBooked[seatNumber] = true;
            System.out.println();
            System.out.println("Congratulations Ticket booked successfully.\n");
        } else {
            System.out.println(" This Seat is already booked.");

            // in case seat is already filled 
            while(true){
                System.out.println();
                System.out.print("Enter another seat number:  ");
                seatNumber=sc.nextInt();
                if(!isBooked[seatNumber]){
                    isBooked[seatNumber]=true;
                    System.out.println();
                    System.out.println("Congratulations Ticket booked successfully.\n");
                    break;
                }
                else System.out.println(" This Seat is already booked.");
            }
        }
    }

    public void displayTicketDetails() {
             System.out.println("Ticket details are :");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price is: " + price);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number from 1 to 100: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        ticket.bookTicket();

        ticket.displayTicketDetails();
         while(true){
            System.out.println("do you want to book another ticket? (yes/no)");
            String choice=scanner.next();
            if(choice.equals("yes")){
                System.out.print("Enter seat number from 1 to 100: ");
                seatNumber = scanner.nextInt();
                ticket = new MovieTicket(movieName, seatNumber, price);

                ticket.bookTicket();

                ticket.displayTicketDetails();
            }
            else break;
       
    }
}
}