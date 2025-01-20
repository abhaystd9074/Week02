class Employee {
     static String companyName = "Sharda Chitfund";
     static int totalEmployees = 0;
     final int id;
     String name;
     String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }

    public static void getCompanyName() {
       System.out.println("our Company Name is : " + companyName);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Babu Rao Ganpat Rao Apte", 101, "Chief Managing Director");
        Employee employee2 = new Employee("Raju ", 102, "Chif Financial Officer");
        Employee employee3 = new Employee("Shyam", 103, "Chief Technical Officer");

        Employee.getCompanyName();
        Employee.displayTotalEmployees();
        System.out.println();

        if (employee1 instanceof Employee) {
            System.out.println("employee1 is an instance of Employee\n");
            System.out.println("Displaying employee1 details\n");
            employee1.display();
        }

        if (employee2 instanceof Employee) {
            System.out.println("employee2 is an instance of Employee\n");
            System.out.println("Displaying employee2 details\n");
            employee2.display();
        }
        if (employee3 instanceof Employee) {
            System.out.println("employee3 is an instance of Employee\n");
            System.out.println("Displaying employee3 details\n");
            employee3.display();
        }
    }
}