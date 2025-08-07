import java.util.*;

/* 
	Q-No 1. Design a Java program to maintain hospital medical records.
		Create a base class named MedicalRecord that includes common attributes:
		--- recordId, patientName, dateOfVisit, and diagnosis.
		--- inputRecordDetails() – to input common record information.
		--- override displayRecord() – to display the common record details.
		‌
		Create a subclass InPatientRecord that extends MedicalRecord and adds:
		--- roomNumber, numberOfDaysAdmitted, roomCharges.
		--- calculateTotalCharges() – to compute and return total inpatient cost.
		--- displayRecord() – to include all details, including total charges.
		‌
		Create another subclass OutPatientRecord that extends MedicalRecord and adds:
		--- doctorName, consultationFee.
		--- override displayRecord() – to include all outpatient-specific details.
		Include all the necessary classes if its needed.

*/


class MedicalRecord {
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    Scanner sc=new Scanner(System.in);

    public void inputRecordDetails() {
        System.out.print("Record Id: ");
        recordId=sc.nextInt();
        sc.nextLine(); 

        System.out.print("Patient Name: ");
        patientName=sc.nextLine();

        System.out.print("Date of Visit: ");
        dateOfVisit=sc.nextLine();

        System.out.print("Diagnosis: ");
        diagnosis=sc.nextLine();
    }

    public void displayRecord() {
        System.out.println("Record Id: " +recordId);
        System.out.println("Patient Name: " +patientName);
        System.out.println("Date of Visit: " +dateOfVisit);
        System.out.println("Diagnosis: " +diagnosis);
    }
}

class InPatientRecord extends MedicalRecord {
    int roomNumber;
    int noOfDaysAdmitted;
    double roomCharges;

    public void inPatientDetails() {
        System.out.print("Enter Room Number: ");
        roomNumber=sc.nextInt();

        System.out.print("Enter No of Days Admitted: ");
        noOfDaysAdmitted=sc.nextInt();

        System.out.print("Enter Room Charges per Day: ");
        roomCharges=sc.nextDouble();
    }

    public double calculateTotalCharges() {
        return noOfDaysAdmitted*roomCharges;
    }

    public void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " +roomNumber);
        System.out.println("Days Admitted: " +noOfDaysAdmitted);
        System.out.println("Room Charges per Day: " +roomCharges);
        System.out.println("Total Charges: " +calculateTotalCharges());
    }
}

class OutPatientRecord extends MedicalRecord {
    String doctorName;
    double consultationFee;

    public void outPatientDetails() {
        System.out.print("Enter Doctor Name: ");
        doctorName=sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        consultationFee=sc.nextDouble();
    }

    public void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " +doctorName);
        System.out.println("Consultation Fee: " +consultationFee);
    }
}

class DoctorMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1. In-Patient Record");
        System.out.println("2. Out-Patient Record");
        System.out.print("Choose option: ");
        int option=sc.nextInt(); 

        if (option==1) {
            InPatientRecord inPatient = new InPatientRecord();
            inPatient.inputRecordDetails();
            inPatient.inPatientDetails();
            System.out.println("\n--- In-Patient Record ---");
            inPatient.displayRecord();

        } else if(option==2) {
            OutPatientRecord outPatient = new OutPatientRecord();
            outPatient.inputRecordDetails();
            outPatient.outPatientDetails();
            System.out.println("\n--- Out-Patient Record ---");
            outPatient.displayRecord();

        } else {
            System.out.println("Invalid Option!");
        }
    }
}



// Q-No 2. Can we override private method, constructor, static method, final method? Illustrate with an example.

class DemoMethods {

    private int id;
    private String name;

    public DemoMethods(int id,String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void display() {
        System.out.println("Id: " +getId());
        System.out.println("Name: " +getName());
    }

    static void displayRole() {
        System.out.println("Admin");
    }

    final double piValue() {
        return 3.14;
    }
}

class CheckMethods extends DemoMethods {

    public CheckMethods(int id, String name) {
        super(id, name);
    }

   // Not override because it's private
    public void display() {
        System.out.println("Trying to override private method");
    }

    // Not overriding
    static void displayRole() {
        System.out.println("User");
    }

    // Not override final method
    /*
    double piValue() {
        return 3.14159;
    }
    */

    public static void main(String[] args) {
        CheckMethods cm = new CheckMethods(1, "Velayutham");

        DemoMethods.displayRole();  
        CheckMethods.displayRole(); 

        cm.display();

        System.out.println("Pi value: " + cm.piValue());
    }
}


/*
	Q-No 3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). 
	Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.

*/

class Employee{
	private int emp_id;
	private String emp_name;
	
	public Employee(int emp_id,String emp_name){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
	}
	
	public int getEmpId(){
		return emp_id;
	}
	
	public String getEmpName(){
		return emp_name;
	}
	
	public void calculateSalary(){
		System.out.println("Employee Salary is defined by PartTime/FullTime Employee");
	}
}

class FullTimeEmployee extends Employee{
	
	static double fullOneDaySalary=1000;
	double fullTimeSalary;
	private int noOfDays;
	
	public FullTimeEmployee(int emp_id,String emp_name,int noOfDays){
		super(emp_id,emp_name);
		this.noOfDays=noOfDays;
	}
	
	public int getNoOfDays(){
		return noOfDays;
	}
	
	public void calculateSalary(){
		fullTimeSalary=noOfDays*FullTimeEmployee.fullOneDaySalary;
		System.out.println("Employee ID: "+getEmpId());
		System.out.println("Employee Name: "+getEmpName());
		System.out.println("Salary :"+fullTimeSalary);
	}
}

class PartTimeEmployee extends Employee{
	
	static double hourSalary=350;
	double partTimeSalary;
	private int noOfHours;
	
	public PartTimeEmployee(int emp_id,String emp_name,int noOfHours){
		super(emp_id,emp_name);
		this.noOfHours=noOfHours;
	}
	
	public int getNoOfHours(){
		return noOfHours;
	}
	
	public void calculateSalary(){
		partTimeSalary=noOfHours*PartTimeEmployee.hourSalary;
		System.out.println("Employee ID: "+getEmpId());
		System.out.println("Employee Name: "+getEmpName());
		System.out.println("Salary :"+partTimeSalary);
	}
}

class EmployeeMain{
	public static void main(String args[]){
	
	Employee emp1=new FullTimeEmployee(101,"Karthi",12);
	emp1.calculateSalary();
	
	System.out.println("-------------------------------------");
	
	Employee emp2=new PartTimeEmployee(102,"Siva",15);
	emp2.calculateSalary();
	
	}	
}

// Q-No 4 Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.

class BookingSystem{
	
	private int passengerId;
	private String passengerName;
	private double fare;
	
	public BookingSystem(int passengerId,String passengerName,double fare){
		this.passengerId=passengerId;
		this.passengerName=passengerName;
		this.fare=fare;
	}
	
	public int getPassengerId(){
		return passengerId;
	}
	
	public String getPassengerName(){
		return passengerName;
	}
	
	public double getFare(){
		return fare;
	}
	
	public void displayInfo(){
		System.out.println("Passenger Id: "+getPassengerId());
		System.out.println("Passenger Name: "+getPassengerName());
		System.out.println("Fare: "+getFare());
	}
}

class Bus extends BookingSystem{
	
	public Bus(int passengerId,String passengerName,double fare){
		super(passengerId,passengerName,fare);
		displayInfo();
	}
	
}

class Train extends BookingSystem{
	
	public Train(int passengerId,String passengerName,double fare){
		super(passengerId,passengerName,fare);
		displayInfo();
	}
}

class Flight extends BookingSystem{
	
	public Flight(int passengerId,String passengerName,double fare){
		super(passengerId,passengerName,fare);
		displayInfo();
	}
}

class BookingMain{
	public static void main(String args[]){
		BookingSystem bk1=new Bus(101,"Vels",1300);
		
		System.out.println("------------------------------------------");
		
		BookingSystem bk2=new Train(201,"Rashuu",3450);
		
		System.out.println("------------------------------------------");
		
		BookingSystem bk3=new Flight(501,"Pandian",65000);
	}
}

