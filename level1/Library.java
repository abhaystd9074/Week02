

class Book{
    String title;
    String author;
    final int isbn;
    static String LibraryName="Abhay Libraries";
    public Book(String title, String author, int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public void display(){
        System.out.println("Title of the book is : "+title);
        System.out.println("Author of the book is : "+author);
        System.out.println("ISBN of the book is : "+isbn);
        
    }
    static void displayLibraryName(){
        System.out.println("Our Library Name is : "+LibraryName);
    }
}


public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Abhay", 123456);
        Book book2 = new Book("Atomic Habbit", "Vikash", 123457);
        Book.displayLibraryName();
        System.out.println();
        
        if(book1 instanceof Book){
            System.out.println("book1 is an instance of Book\n");
            System.out.println("displaying book1 details\n");
            book1.display();
        }
        if(book2 instanceof Book){
            System.out.println("book2 is an instance of Book\n");
            System.out.println("displaying book2 details\n");
            book2.display();
        }
    }
    
}
