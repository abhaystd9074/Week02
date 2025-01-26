// Description: Build an employee management system with the following requirements:
// Use an abstract class Employee with fields like employeeId, name, and baseSalary.
// Provide an abstract method calculateSalary() and a concrete method displayDetails().
// Create two subclasses: HalfTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
// Use encapsulation to restrict direct access to fields and provide getter and setter methods.
// Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
// Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

abstract class Employee{
    private String name;
    private int employeeId;
    private int baseSalary=15000;
    private String  time;
    private int totalSalary;
    public Employee(String name,int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
   public abstract  void calculateSalary();
   public abstract  void TimeDuration();
    public void setSalary(int salary){
      this.totalSalary=salary;
    }
     public int getBaseSalary(){
         return baseSalary;
     }

     public void setTime(String time){
        this.time=time;
      }
       public String getTime(){
           return time;
       }

    public void displayDetails(){
        System.out.println("employee name is: "+ name);
        System.out.println("employee id is: "+ employeeId);
        System.out.println("employee salary is: "+ totalSalary);
        System.out.println("this employee works "+ time);

    
    }
}
class FullTimeEmployee extends Employee{
    String time;
    int FullTimeSalary;
    public FullTimeEmployee(String name,int EmployeeId,int FullTimeSalary){
        super(name, EmployeeId);
         this.time="full time";
         this.FullTimeSalary=FullTimeSalary;
    }
      public void calculateSalary(){
        int total=FullTimeSalary+getBaseSalary();
        setSalary(total);
    }
    public void TimeDuration(){
        setTime(time);
    }
   
}

class HalfTimeEmployee extends Employee{
    String time;
    int HalfTimeSalary;
    public HalfTimeEmployee(String name,int EmployeeId,int HalfTimeSalary){
        super(name, EmployeeId);
         this.time="Half time";
         this.HalfTimeSalary=HalfTimeSalary;
    }
      public void calculateSalary(){
        setSalary(HalfTimeSalary+getBaseSalary());
    }
    public void TimeDuration(){
        setTime(time);
    }
   
}





public class EmployeeManagementSystem{
    public static void main(String[] args) {
        FullTimeEmployee [] empf=new FullTimeEmployee[2];
        HalfTimeEmployee [] emph=new HalfTimeEmployee[2];
        empf[0]=new FullTimeEmployee("Abhay", 23442, 100000);
        empf[0].calculateSalary();
        empf[0].TimeDuration();
        empf[0].displayDetails();
        System.out.println();
        empf[1]=new FullTimeEmployee("NIshank", 23442, 200000);
        empf[1].TimeDuration();
        empf[1].calculateSalary();
        empf[1].displayDetails();
        System.out.println();

        emph[0]=new HalfTimeEmployee("Rahul", 23442, 6000);
        emph[0].calculateSalary();
        emph[0].TimeDuration();
        emph[0].displayDetails();
        System.out.println();
        emph[1]=new HalfTimeEmployee("Nilesh", 23442, 6000);
        emph[1].calculateSalary();
        emph[1].TimeDuration();
        emph[1].displayDetails();
        
        

    }

}