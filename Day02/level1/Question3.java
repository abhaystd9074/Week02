
 class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //copy constructor is called 
    public Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }   
 }

public class Question3 {
    public static void main(String[] args) {
        Person p1 = new Person("Abhay",21);
        p1.display();
        Person p2 = new Person(p1);
        p2.display();
    }
    
}
