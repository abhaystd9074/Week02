import java.util.*;
class Book{
    String title;
    String author;
    int price;
    public Book(){
        this.title="tiny habbit";
        this.author="Abhay";
        this.price=400;
    }
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void showDetails(){
        System.out.println("Book name  is : "+title);
        System.out.println("author name is : "+author);
        System.out.println("price of that book  is : "+price);
    }

}



public class Question1{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter Book title:  ");
        String title=sc.nextLine();
        System.out.print("enter author name:  ");
        String author=sc.nextLine();
        System.out.print("enter price of the book: ");
        int price=sc.nextInt();
        Book b= new Book(title,author,price);
        b.showDetails();
        Book b2=new Book();
        b2.showDetails();

       
    }
}