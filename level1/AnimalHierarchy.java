
// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
class Animal{
    String name;
    String age;
    public Animal(String name, String age){
        this.name = name;
        this.age = age;
    }
    public  void makeSound(){
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal{
    public Dog(){
        super("Dog", "5");
    }
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }

}
class cat extends Animal{
    public cat(){
        super("Cat", "3");
    }
    @Override
  public void makeSound(){
      System.out.println("Cat meows");
  }
    
}
class Bird extends Animal{
    public Bird(){
        super("Bird", "2");
    }
    @Override
   public void makeSound(){
       System.out.println("Bird chirps");
   }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a = new Animal("Animal", "10");
        a.makeSound();
        a = new Dog();
        a.makeSound();
        a = new cat();
        a.makeSound();
        a = new Bird();
        a.makeSound();
    }
}