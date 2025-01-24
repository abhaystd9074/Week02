// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager 
//and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

class Employee{
    String designation;
    int id;
    double salary;
    public Employee(String designation, int id, double salary){
        this.designation = designation;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("designation is : "+designation);
        System.out.println("ID is : "+id);
        System.out.println("Salary is : "+salary);
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size is : "+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language is : "+programmingLanguage);
    }
}
class Intern extends Employee{
    String project;
    public Intern(String name, int id, double salary, String project){
        super(name, id, salary);
        this.project = project;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Project is : "+project);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e = new Employee("Employee", 1, 10000);
        e.displayDetails();
        e = new Manager("Manager", 2, 20000, 10);
        e.displayDetails();
        e= new Developer("Developer", 3, 30000, "Java");
        e.displayDetails();
        e = new Intern("Intern", 4, 40000, "Web Development");
        e.displayDetails();
    }

    
}
