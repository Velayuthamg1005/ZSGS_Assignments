/*
Q-No -1 All the banks operating in India are controlled by RBI. RBI has set a well defined guideline
(e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. 

For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; 
however, banks are free to use 4% interest rate or to set any rates above it.

Write a program to implement bank functionality in the above scenario. 

Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). 
Assume and implement required member variables and methods in each class.

*/

class Customer{
	
	private String name;
	private String mobileNumber;
	private String address;
	
	public Customer(String name,String mobileNumber,String address){
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.address=address;
	}
	
	public void display(){
		System.out.println("Customer Name: "+name);
		System.out.println("Customer MobileNumber: "+mobileNumber);
		System.out.println("Customer Address: "+address);
	}
	
}

class Account{
	
	private String accountNo;
	private String 
}
