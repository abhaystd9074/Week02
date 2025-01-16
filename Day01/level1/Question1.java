import java.util.*;
class Employee{
    String name;
    int id;
    int salary;
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void showDetails(){
        System.out.println("Employee name is : "+name);
        System.out.println("Employee id is : "+id);
        System.out.println("Employee salary is : "+salary);
    }

}



public class Question1{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter   employee name:  ");
        String name=sc.nextLine();
        System.out.print("enter  employee id: ");
        int id=sc.nextInt();
        System.out.print("enter  employee salary:  ");
        int salary=sc.nextInt();

        Employee emp= new Employee(name,id, salary);
        emp.showDetails();
        
    }
}