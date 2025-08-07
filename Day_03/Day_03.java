import java.util.*;

// Q.No 01 Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{
	
	int stu_rollno;
	String stu_name;
	
	
	public static void main(String args[]){
		
		Student stu1= new Student();
		
		stu1.stu_rollno=101;
		stu1.stu_name="Velayutham.G";
		
		System.out.println("Roll No: "+stu1.stu_rollno);
		System.out.println("Name: "+stu1.stu_name);
	}
}

// Q-No 02 Create a class named Student that has the following attributes:

class Studentt{
	
	int stu_rollno;
	String stu_name;
	String stu_address;
	int stu_phonenum;
	
	Studentt(int stu_rollno,String stu_name,String stu_address,int stu_phonenum){
		this.stu_rollno=stu_rollno;
		this.stu_name=stu_name;
		this.stu_address=stu_address;
		this.stu_phonenum=stu_phonenum;
	}
	
	void display(){
		System.out.println("Roll No :"+stu_rollno+"\nName: "+stu_name+"\nAddress: "+stu_address+"\nPhone No: "+stu_phonenum);
		System.out.println();
	}
	
	public static void main(String args[]){
		
		Studentt stu1=new Studentt(101,"Vels","No.2,Pillaiyar Kovil Street",2934920);
		Studentt stu2=new Studentt(102,"Rashuu","363,Express Avenune,CBE",435355);
		
		stu1.display();
		stu2.display();
	}
}

// Q-No 03 Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.

class Employee{
	int emp_id;
	String emp_name;
	String emp_designation;
	double emp_salary;
	
	Employee(){
		emp_id=0;
		emp_name="";
		emp_designation="";
		emp_salary=0.0;
	}
	
	Employee(int emp_id,String emp_name,String emp_designation,double emp_salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_designation=emp_designation;
		this.emp_salary=emp_salary;
	}
	
	Employee(Employee emp){
		this.emp_id=emp.emp_id;
		this.emp_name=emp.emp_name;
		this.emp_designation=emp.emp_designation;
		this.emp_salary=emp.emp_salary;		
	}
	
	void display(){
		System.out.println("Emp ID :"+emp_id+"\nEmp Name: "+emp_name+"\nEmp Designation: "+emp_designation+"\nEmp Salary: "+emp_salary);
		System.out.println();		
	}
	
	public static void main(String args[]){
		
		Employee emp1=new Employee();
		
		Employee emp2=new Employee(1,"Vels","Software Dev",1500000);
		
		Employee emp3=new Employee(emp2);
		
		emp1.display();
		emp2.display();
		emp3.display();
	}
}

/* 
	Q.No 04 Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, 
	such that it can internally keep track of how many vehicles have been created so far, 
	without requiring manual counting from outside the class.
*/

class Vehicle{
	int vehicle_id;
	String brandName;
	double vehicle_price;
	
	static int vehicle_count=0;
	
	Vehicle(String brandName,double vehicle_price){
		vehicle_count++;
		this.vehicle_id=vehicle_count;
		this.brandName=brandName;
		this.vehicle_price=vehicle_price;
	}
	
	void display(){
		System.out.println("Vehicle ID: "+vehicle_id+"\nBrand Name: "+brandName+"\nPrice: "+vehicle_price);
		System.out.println();
	}
	
	static int getCount(){
		return vehicle_count;
	}
	
	public static void main(String args[]){
		
		Vehicle vh1=new Vehicle("Honda",300000);
		Vehicle vh2=new Vehicle("Yahama",500000);
		Vehicle vh3=new Vehicle("Ferori",700000);
		
		System.out.println("Vehicles Count: "+Vehicle.getCount());
		
		vh1.display();
		vh2.display();
		vh3.display();
		
	}
} 



// Q-No 06 Write a program that would print the information.Can use format method to format the above said output.

class Employeee{
	String emp_name;
	int emp_yoj;
	double emp_salary;
	String emp_address;
	
	Employeee(String emp_name,int emp_yoj,double emp_salary,String emp_address){
		this.emp_name=emp_name;
		this.emp_yoj=emp_yoj;
		this.emp_salary=emp_salary;
		this.emp_address=emp_address;
	}
	
	void display(){
		System.out.printf("%-10s %-15d %s\n",emp_name,emp_yoj,emp_address);
	}
	
	public static void main(String args[]){
		
		Employeee emp1=new Employeee("Siva",2024,12000,"43-Texas");
		Employeee emp2=new Employeee("Sri",2022,10000,"76-California");
		Employeee emp3=new Employeee("Viki",2025,11110,"10-Pluto");
		
		emp1.display();
		emp2.display();
		emp3.display();
	}
	
}

// Q-No 5 Simple inventory system 

class Store {
    private static String store_name;
    private static String store_location;
	
    public static void setStoreDetails(String store_name,String store_location) {
        store_name=store_name;
        store_location=store_location;
    }

    private List<Product> productList;

    public Store() {
        productList=new ArrayList<>();
    }

    public static void displayStoreDetails() {
        System.out.println("Store Name     : " +store_name);
        System.out.println("Store Location : " +store_location);
    }

    public void add_product(Product product) {
        productList.add(product);
    }

    public void displayAllProducts() {
        System.out.println("Product List:");

        for (Product product:productList) {
            product.displayProduct();
        }
    }
}

class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Product ID   : " +productId);
        System.out.println("Product Name : " +name);
        System.out.println("Price        : Rs. " +price);
        System.out.println("Quantity     : " +quantity);
    }
}


class InventorySystem {
    public static void main(String[] args) {
        Store.setStoreDetails("Vicky Electronics", "Tirunelveli");

        Store store = new Store();

        Product p1 = new Product(101, "Bluetooth Speaker", 1599.00, 10);
        Product p2 = new Product(102, "Wireless Mouse", 699.00, 25);
        Product p3 = new Product(103, "USB Cable", 149.00, 50);
		
        store.add_product(p1);
        store.add_product(p2);
        store.add_product(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}


