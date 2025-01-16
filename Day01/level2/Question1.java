import java.util.*;
class Student{
    String name;
    int roll;
    int marks;
    Student(String name,int roll,int marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    char grade;
   public  void calculateGrade(){
        if(marks >=75) grade='A';
       else if(marks >=60) grade='B';
        else if(marks >=45) grade='C';
        else grade='D';
    }

   public void displayDetails(){
        System.out.println("Name of the student: "+name);
        System.out.println("Roll of the student: "+roll);
        System.out.println("Marks of the student: "+marks);
        System.out.println("grade of the student: "+grade);
        
    }

}


public class Question1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the name of the student:  ");
       String name=sc.nextLine();
       System.out.print("Enter the roll number of the student: ");
       int roll=sc.nextInt();
       System.out.print("Enter the marks of the student:  ");
       int marks=sc.nextInt();
       Student st=new Student(name,roll,marks);
       st.calculateGrade();
       st.displayDetails();
       


    }
}