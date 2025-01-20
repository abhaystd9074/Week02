class Patient {
     static String hospitalName = "AIIMs Hospital";
     static int totalPatients = 0;
     final int patientID;
     String name;
     int age;
     String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void display() {
        System.out.println("Patient ID is: " + patientID);
        System.out.println("Name of the patient: " + name);
        System.out.println("Ageof the patient is: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }

    
}

public class Hospital {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Rahul", 30, "Feaver", 101);
        Patient patient2 = new Patient("Shyam", 45, "Fracture", 102);

        System.out.println("Our Hospital Name is : " + Patient.hospitalName);
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        System.out.println();

        if (patient1 instanceof Patient) {
            System.out.println();
            System.out.println("patient1 is an instance of Patient");
            System.out.println("Displaying patient1 details");
            patient1.display();
        }

        if (patient2 instanceof Patient) {
            System.out.println();
            System.out.println("patient2 is an instance of Patient");
            System.out.println("Displaying patient2 details");
            patient2.display();
        }
    }
}