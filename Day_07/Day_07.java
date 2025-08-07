import java.util.*;

/*	Q-NO 1
	All the banks operating in India are controlled by RBI. 
	RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. 
	For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; 
	however, banks are free to use 4% interest rate or to set any rates above it.
	
	Write a program to implement bank functionality in the above scenario. 
	Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). 
	Assume and implement required member variables and methods in each class.

*/

class Customer{
	private int cus_id;
	private String cus_name;
	
	public Customer(int cus_id,String cus_name){
		this.cus_id=cus_id;
		this.cus_name=cus_name;
	}
	
	public int getCusId(){
		return cus_id;
	}
	
	public String getCusName(){
		return cus_name;
	}
	
	public void customerInfo(){
		System.out.println("Customer ID: "+getCusId());
		System.out.println("Customer Name: "+getCusName());
	}
}

class Account{
	
	private String acc_no;
	private String acc_aadhaar;
	
	public Account(String acc_no,String acc_aadhaar){
		this.acc_no=acc_no;
		this.acc_aadhaar=acc_aadhaar;
	}
	
	public String getAccNo(){
		return acc_no;
	}
	
	public String getAccAadhaar(){
		return acc_aadhaar;
	}
	
	public void accountInfo(){
		System.out.println("Account No: "+getAccNo());
		System.out.println("Acc Aadhaar: "+getAccAadhaar());
	}
}

class RBI{
	
	Customer c;
	Account a;
	
	protected float min_interest;
	protected double min_balance;
	protected double max_withdrawl;
	
	public RBI(Customer c, Account a, float min_interest, double min_balance, double max_withdrawl) {
		this.c = c; 
		this.a = a;
		this.min_interest = min_interest;
		this.min_balance = min_balance;
		this.max_withdrawl = max_withdrawl;
	}

	
	public float getMinInterest(){
		return min_interest;
	}
	
	public double getMinBalance(){
		return min_balance;
	}
	
	public double getMaxWithdrawl(){
		return max_withdrawl;
	}
	
	public void RBIInfo(){
		c.customerInfo();
		a.accountInfo();
		System.out.println("RBI Interest: "+getMinInterest());
		System.out.println("RBI Minimum Balance: "+getMinBalance());
		System.out.println("RBI Maximum Withdrawl: "+getMaxWithdrawl());
	}
	
}

class SBI extends RBI{
	
	public SBI(Customer c,Account a,float min_interest,double min_balance,double max_withdrawl){
		super(c,a,min_interest,min_balance,max_withdrawl);
	}
	
	public void RBIInfo(){
		System.out.println("RBI Information");
		c.customerInfo();
		a.accountInfo();
		System.out.println("SBI Interest: "+getMinInterest());
		System.out.println("SBI Minimum Balance: "+getMinBalance());
		System.out.println("SBI Maximum Withdrawl: "+getMaxWithdrawl());
	}
	
}

class ICICI extends RBI{
	
	public ICICI(Customer c,Account a,float min_interest,double min_balance,double max_withdrawl){
		super(c,a,min_interest,min_balance,max_withdrawl);
	}

	public void RBIInfo(){
		System.out.println("ICICI Information");
		c.customerInfo();
		a.accountInfo();
		System.out.println("ICICI Interest: "+getMinInterest());
		System.out.println("ICICI Minimum Balance: "+getMinBalance());
		System.out.println("ICICI Maximum Withdrawl: "+getMaxWithdrawl());
	}
	
}

class PNB extends RBI{
	
	public PNB(Customer c,Account a,float min_interest,double min_balance,double max_withdrawl){
		super(c,a,min_interest,min_balance,max_withdrawl);
	}

	public void RBIInfo(){
		System.out.println("PNB Information");
		c.customerInfo();
		a.accountInfo();
		System.out.println("PNB Interest: "+getMinInterest());
		System.out.println("PNB Minimum Balance: "+getMinBalance());
		System.out.println("PNB Maximum Withdrawl: "+getMaxWithdrawl());
	}
	
}

class BankMain{
	
	public static void main(String args[]){
		
		Customer c1=new Customer(101, "Vels");
		Account a1=new Account("ZOHO101", "356622");
		RBI r1=new SBI(c1, a1, 4.0f, 100000, 34533);
		r1.RBIInfo();
		
		System.out.println("-------------------------------------------");
		Customer c2=new Customer(102, "Rashuu");
		Account a2=new Account("INFO54", "76532");
		PNB r2=new PNB(c2, a2,7.6f, 560000, 50000);
		r2.RBIInfo();
	}
}

/* Q-No 2
	
	Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). 
	Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. 
	Write a main class where you can accept payment using different methods.
	
*/

interface PaymentMethod{
	void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
	public void pay(double amount){
		System.out.println("Payment Credited - CreditCardPayment: "+amount);
	}
}

class DebitCardPayment implements PaymentMethod{
	public void pay(double amount){
		System.out.println("Payment Debited - DebitCardPayment: "+amount);
	}
}

class UPIPayment implements PaymentMethod{
	public void pay(double amount){
		System.out.println("Payment Paid/Recieved - UPIPayment: "+amount);
	}
}

class PaymentMain{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		PaymentMethod creditPayment=new CreditCardPayment();
		PaymentMethod debitPayment=new DebitCardPayment();
		PaymentMethod upiPayment=new UPIPayment();
		
		System.out.println("Choose the Type (1/2/3)");
		System.out.println("1. CreditCardPayment");
		System.out.println("2. DebitCardPayment");
		System.out.println("3. UPIPayment");
		
		int option=sc.nextInt();
		
		switch(option){
			case 1:
				creditPayment.pay(5000);
				break;
			case 2:
				debitPayment.pay(6700);
				break;
			case 3:
				upiPayment.pay(8000);
				break;
			default:
				System.out.println("Please Choose the Correct One");
		}		
		
	}
}

/* Q-No 3
	Create a Java application to manage employees in a company. 
	Define an abstract class Employee with a method calculateSalary(). 
	Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
	Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
*/

abstract class Employee 
{
    String name;
    int id;

    Employee(String name, int id) 
	{
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayInfo() 
	{
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class FullTimeEmployee extends Employee 
{
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) 
	{
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() 
	{
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee 
{
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) 
	{
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() 
	{
        return hourlyRate * hoursWorked;
    }
}

class Company 
{
    public static void main(String[] args) 
	{
        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 500, 40);

        emp1.displayInfo();
        System.out.println("Full-Time Salary: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayInfo();
        System.out.println("Part-Time Salary: " + emp2.calculateSalary());
    }
}

/*
	Q-No -4 4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
	Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference

*/

interface Employees
{
    double calculateSalary();
    void displayInfo();
}

class FullTimeEmployees implements Employees 
{
    private String name;
    private int id;
    private double monthlySalary;

    FullTimeEmployees(String name, int id, double monthlySalary) 
	{
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() 
	{
        return monthlySalary;
    }

    public void displayInfo() 
	{
        System.out.println("Full-Time Employee - ID: " + id + ", Name: " + name);
    }
}

class PartTimeEmployees implements Employees 
{
    private String name;
    private int id;
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployees(String name, int id, double hourlyRate, int hoursWorked) 
	{
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() 
	{
        return hourlyRate * hoursWorked;
    }

    public void displayInfo() 
	{
        System.out.println("Part-Time Employee - ID: " + id + ", Name: " + name);
    }
}

class Companys 
{
    public static void main(String[] args) 
	{
        Employees emp1 = new FullTimeEmployees("Alice", 101, 55000);
        Employees emp2 = new PartTimeEmployees("Bob", 102, 500, 40);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}

	

