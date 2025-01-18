import java.util.Scanner;

class  HotelBooking{
    String guestName;
    String roomType;
    int nights;
    public HotelBooking(){
        this.guestName="Abhay";
        this.roomType="deluxe";
        this.nights=2;
    }
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    public HotelBooking(HotelBooking h){
        this.guestName=h.guestName;
        this.roomType=h.roomType;
        this.nights=h.nights;
    }
    public void showDetails(){
        System.out.println("Guest name is : "+guestName);
        System.out.println("Room type is : "+roomType);
        System.out.println("Number of nights is : "+nights);
    }

}

public class Queston4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in); 
        System.out.println("enter the guest name: ");
        String name=sc.nextLine();
        System.out.println("enter the room type: ");
        String roomType=sc.nextLine();
        System.out.println("enter the number of nights: ");
        int nights=sc.nextInt();
        HotelBooking h= new HotelBooking();
        h.showDetails();
        HotelBooking h2=new HotelBooking(name,roomType,nights);
        h2.showDetails();
        HotelBooking h3=new HotelBooking(h);
        h3.showDetails();
    }
    
}
