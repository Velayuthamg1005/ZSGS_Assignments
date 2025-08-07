import java.util.*;
// Q.No-01 ScopeofVariables

class ScopeOfVariables{
	
	static int stu_id;
	String stu_name;	// Instance Variable
	
	final double weight=80;
	
	static String gender="Male";	// Static Variable
	
	public static void main(String args[]){
		
		ScopeOfVariables sov= new ScopeOfVariables();
		sov.stu_id=1;
		sov.stu_name="Velayutham";
		String nickName="Vels";		//Local Variable
		
		if(ScopeOfVariables.stu_id==1){				//Block Variable
			System.out.println("He is a Student");
		}
		
		System.out.println("Student Id is: "+sov.stu_id);
		System.out.println("Student Name is: "+sov.stu_name);
		System.out.println("Student NickName is: "+nickName);
		System.out.println("Student Gender is: "+ScopeOfVariables.gender);
		System.out.println("Student Number is: "+sov.weight);
	
	}
}

// Q.No-02 DeclareAndPrintDatatype

class DeclareAndPrintDT{
	public static void main(String args[]){
		

		byte n1=120;
		int emp_id=101;
		String emp_name="Velayutham";
		char emp_initial='G';
		boolean emp_isAlive=true;
		long emp_BankBalance=1000000000;
		float emp_height=5.7f;
		double emp_salary=150000;
		short emp_noOfAttempts=2;
		
		System.out.println("Employee Count: "+n1);
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Employee Initial: "+emp_initial);
		System.out.println("Employee Status: "+emp_isAlive);
		System.out.println("Employee BankBalance: "+emp_BankBalance);
		System.out.println("Employee Height: "+emp_height);
		System.out.println("Employee Salary: "+emp_salary);
		System.out.println("Employee No of Attempts: "+emp_noOfAttempts);
	}
}

// Q.No-03 Maxi of Two Numbers using Ternary operator

class MaxiOfTwoNumbers{
	
	static void printMax(int num1,int num2){
		int max=(num1>num2)?num1:num2;
		System.out.println(max+" is Maximum");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		printMax(num1,num2);
	}
}

// Q.No-04 Two Numbers are equal without Comparison operator

class TwoNumEqualOrNot{
	public static void main(String args[]){
		int x=16;
		int y=16;
		
		int result=x^y;		// XOR Approach
		
		boolean[] valid=new boolean[result+1];
		valid[result]=true;
		
		
		if(valid[0]){
			System.out.println("Two Numbers are Equal");
		}
		else{
			System.out.println("Two Numbers are Not Equal");
		}
	}
}	

// Q.No-05 Static and Initializer block

class StaticAndInitializer{
	
	{
		System.out.println("Initializer Block is Executing...");
	}
	
	static{
		System.out.println("Static Block is Executing...");
	}
	public static void main(String args[]){
		StaticAndInitializer sti=new StaticAndInitializer();
	}
}

// Q.No-06 Illustrate the Explicit type casting

class TypeCasting{
	public static void main(String args[]){
		int x=20;
		double y= 25.12455;
		
		double wideningCast=x;
		short narrowingCast=(short)y;
		
		System.out.println("After Widening: "+wideningCast);
		System.out.println("After Narrowing: "+narrowingCast);
	}
}

// Q.No-07 Check if number is a power of 2

class CheckPower{
	
	public static void main(String args[]){
		
		int num=16;
		
		if(num<=1){
			System.out.println("We can't perform Power");
			return;
		}
		
		int temp=num;
		
		while(temp>2){
			if(temp%2==0){
				temp=temp/2;
			}
			else{
				System.out.println(num+" is not a power of 2");
				break;
			}
		}
		
		if(temp==2){
			System.out.println(num+" is a power of 2");
		}
	}
}

// Q.No 08 Find First Set bit of the number

class FindFirstSet{
	public static void main(String args[]){
		
		int num=8;
		
		String binary="";
		
		while(num!=0){
			int rem=num%2;
			binary=rem+binary;
			num=num/2;
		}
		int position=1;
		
		for(int i=binary.length()-1;i>=0;i--){
			if(binary.charAt(i)=='0'){
				position++;
			}
			else{
				break;
			}
		}
		System.out.println("Finding First Set: "+position);
	}
}


// Q.No 09 Construct Class 

class Employee{
	int emp_id;
	String emp_name;
	String emp_dept;
	double emp_salary;
	
	Employee(int emp_id,String emp_name,String emp_dept,double emp_salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_dept=emp_dept;
		this.emp_salary=emp_salary;
	}
	
	void display(){
		System.out.println("Employee Id is: "+emp_id+"\nEmployee Name is: "+emp_name+"\nEmployee Department: "+emp_dept+"\nEmployee Salary: "+emp_salary);
	}
	
	public static void main(String args[]){
		Employee emp=new Employee(1,"Vels","Software Developer",150000);
		emp.display();
		
	}
}

// Q.No-10 Check whether the object is an instance of a particular class

class CheckInstance{
	
	int id;
	String name;
	String dept;
	
	public static void main(String args[]){
		
		CheckInstance chk=new CheckInstance();
		chk.id=101;
		chk.name="Karthi";
		chk.dept="BSC";
		
		if(chk instanceof CheckInstance){
			System.out.println("It is an Instance of a Class");
		}
		else{
			System.out.println("Not an Instance of a Class");
		}
		
	}
}