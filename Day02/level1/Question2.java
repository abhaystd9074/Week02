import java.util.*;
class Circle{
    double radius;
    public Circle(double radius){
       
        this.radius=radius;
    }
    public Circle(){
        this.radius=7;
    }
    public void calculate(){
      double area=Math.PI*radius*radius;
      double circumference=Math.PI*radius*radius;
        System.out.println("Area of a circle is  : "+area);
        System.out.println("Circumference of a circle is  : "+circumference);

    }

}



public class Question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the radius of a circle: ");
        double radius=sc.nextDouble();

        Circle emp= new Circle(radius);
        emp.calculate();
        Circle emp2=new Circle();
        emp2.calculate();
        
    }
}