import java.util.*;
// 1. Illustrate the concept-Encapsulation with the Payment Gateway System.

class PaymentGatewaySystem{
	
	private String transaction_id;
	private String payer_name;
	private String payee_name;
	private double amount;
	private String payment_method;
	private String payment_status;
	
	
	public String getTransId(){
		return transaction_id;
	}
	
	public void setTransId(String transaction_id){
		this.transaction_id=transaction_id;
	}
	
	public String getPayerName(){
		return payer_name;
	}
	
	public void setPayerName(String payer_name){
		this.payer_name=payer_name;
	}
	
	public String getPayeeName(){
		return payee_name;
	} 
	
	public void setPayeeName(String payee_name){
		this.payee_name=payee_name;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amount){
		this.amount=amount;
	}
	
	public String getPaymentMethod(){
		return payment_method;
	}
	
	public void setPaymentMethod(String payment_method){
		this.payment_method=payment_method;
	}
	
	private String getPaymentStatus(){
		return payment_status;
	}
	
	public void setPaymentStatus(String payment_status){
		this.payment_status=payment_status;
	}
	
	public void display(){
		
		System.out.println("-----TRANSACTION SUMMARY-----");
		System.out.println("Transaction ID: "+getTransId());
		System.out.println("Payer Name: "+getPayerName());
		System.out.println("Payee Name: "+getPayeeName());
		System.out.println("Amount: "+getAmount());
		System.out.println("Payment Method: "+getPaymentMethod());
		System.out.println("Payment Status: "+getPaymentStatus());
		
	}
	
	public static void main(String args[]){
		
		PaymentGatewaySystem psg1=new PaymentGatewaySystem();
		
		psg1.setTransId("ZO101");
		psg1.setPayerName("Siva Subramanian.J");
		psg1.setPayeeName("Velayutham.G");
		psg1.setAmount(2000);
		psg1.setPaymentMethod("UPI");
		psg1.setPaymentStatus("Success");
		
		psg1.display();
		
		
	}
	
	
}

// Q-No-3 Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.

class Employee{
	
	private String emp_id;
	private String emp_name;
	private String designation;
	private String department;
	private double monthly_salary;
	
	public String getEmpId(){
		return emp_id;
	}
	
	public void setEmpId(String emp_id){
		this.emp_id=emp_id;
	}
	
	public String getEmpName(){
		return emp_name;
	}
	
	public void setEmpName(String emp_name){
		this.emp_name=emp_name;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public void setDesignation(String designation){
		this.designation=designation;
	}

	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String department){
		this.department=department;
	}
	
	public double getMonthlySalary(){
		return monthly_salary;
	}
	
	public void setMonthlySalary(double monthly_salary){
		this.monthly_salary=monthly_salary;
	}
	
	public double CalculateAnnualSalary(){
		return getMonthlySalary()*12;
	}
	
	
	public static void main(String args[]){
		
		Employee emp=new Employee();
		
		emp.setEmpId("ZOHO101");
		emp.setEmpName("Vels");
		emp.setDesignation("Software Developer");
		emp.setDepartment("MTS");
		emp.setMonthlySalary(150000);
		

		
		System.out.println("\n-----Employee Details-----");
		
		System.out.println("Employee Id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Employee Designation: "+emp.getDesignation());
		System.out.println("Employee Department: "+emp.getDepartment());
		System.out.println("Employee MonthlySalary: "+emp.getMonthlySalary());
		
		System.out.println("----------------------------------------");
		
		System.out.println("Annual Salary of the Employee: "+emp.CalculateAnnualSalary());
		
	}
}

/* Q-No 5
		Design a class named `BankAccount` that uses the concept of encapsulation. 
		The class should have the following private data members: account number, account holder name, and balance. 
		Provide public getter and setter methods to access and modify these fields. 
		Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.	
*/

class BankAccount{
	private String accountNumber;
	private String accHolderName;
	private double balance;
	
	public String getAccNumber(){
		return accountNumber;
	}
	
	public void setAccNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public String getHolderName(){
		return accHolderName;
	}
	
	public void setHolderName(String accHolderName){
		this.accHolderName=accHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public double deposit(double amount){
			return balance=getBalance()+amount;
	}
	
	public void withdraw(double amount){
		if(amount>balance){
			System.out.println("Insufficient Funds");
		}
		if(amount<=balance){
			balance=getBalance()-amount;
			System.out.println("\nSuccesfully withdrawn,Your updated Balance: "+getBalance());
		}
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		BankAccount bankAcc=new BankAccount();
		
		bankAcc.setAccNumber("SBI1001");
		bankAcc.setHolderName("Viki");
		bankAcc.setBalance(5000);
		
		while(bankAcc.getBalance()>0){
			
		System.out.println("--------------------------------------------------");
		System.out.println("\nWelcome to Great Bank");
		System.out.println("\n1. Are you going to deposit? ");
		System.out.println("2. Are you going to withdraw? ");
		System.out.println("\nSelect Any one option (1 or 2): ");
		int option=sc.nextInt();
		
		
		
		switch(option){
			case 1:
				System.out.print("Enter the amount to deposit: ");
				double depAmount=sc.nextDouble();
				
				double result=bankAcc.deposit(depAmount);
				System.out.println("\nAccount Number: "+bankAcc.getAccNumber());
				System.out.println("Account HolderName: "+bankAcc.getHolderName());
				System.out.println("\nSuccesfully deposited,Your updated Balance: "+bankAcc.getBalance());
				break;
			case 2:
				System.out.print("\nEnter the amount to withdraw: ");
				double withdrawAmount=sc.nextDouble();
				
				System.out.println("\nAccount Number: "+bankAcc.getAccNumber());
				System.out.println("Account HolderName: "+bankAcc.getHolderName());
				bankAcc.withdraw(withdrawAmount);
				break;
		}
		}
	}
}