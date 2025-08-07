import java.util.*;
import java.io.*;
/*

	1. int[] arr = {2, 5, 1, 4, 0, 7};
	int quotient = arr[7] / arr[4];
	Develop a Java program which handles any unexpected situations that may arise during execution.

*/

class FindQuotient{
	public static void main(String args[]){
		int[] arr={2,5,1,4,0,7};
		
		try{
			int quotient=arr[7]/arr[4];
			System.out.println(quotient);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

/*
	2. Demonstrate multiple catch blocks: 
	
	accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: 
	InputMismatchException, NumberFormatException, ArithmeticException and Exception.
	
*/

class MultipleCatch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		try{
/*			System.out.print("Enter String 1: ");
			String s1=sc.nextLine();
		
			System.out.print("Enter String 2: ");
			String s2=sc.nextLine();
*/

				
			System.out.print("Enter Any Number: ");
			int num=sc.nextInt();
			
/*			int result1=Integer.parseInt(s1);
			int result2=Integer.parseInt(s2);
			
			int division=result1/result2;
*/
		}
		catch(InputMismatchException e){
			e.printStackTrace();
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}

	}
}

/*
	3. Write a program to illustrate how to throw a ClassNotFoundException.
	
*/

class ClassNotFound{
	public static void main(String args[]){
		try{
			Class.forName("arithmetic.ArithmeticOperation");
			System.out.print("Class Found");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}

/*
	4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

*/

class StringValidOrNot{
	
	public static int stringParse(String s){
		return Integer.parseInt(s);
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("Enter a String: ");
			String str=sc.nextLine();
			
			System.out.println("Result: "+stringParse(str));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
	5. Create a program where try block contains a return statement.
	   Ensure that finally block executes before the method returns. Show this with output.

*/

class ExampleFinally{
	
	public static int add(int a,int b){
		try{
			return a+b;	
		}
		finally{
			System.out.println("Finally Block Execution");
		}
		
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("Enter Num1: ");
			int n1=sc.nextInt();
		
			System.out.print("Enter Num2: ");
			int n2=sc.nextInt();	
			
			System.out.println("Result: "+add(n1,n2));
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
}

/*
	6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
			--->It must be exactly 4 digits long.
			--->It should contain only numeric characters.
			--->It must not start with 0.
	   Display an appropriate message whether the PIN is valid or invalid.

*/


class ValidatePin{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("Enter PIN: ");
			String str=sc.nextLine();
			
			if(str.length()!=4){
				throw new Exception("NotValidIndex Exception");
			}
			
			for(int i=0;i<4;i++){
				if(!Character.isDigit(str.charAt(i))){
					throw new Exception("ShouldContainNumeric");
				}
			}
			
			if(str.charAt(0)=='0'){
				throw new Exception("MustNotStartZero");
			}
			System.out.print("Valid");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
	7.Write a Java program that shows exception propagation across multiple methods 
	(method1 calls method2 calls method3, which throws the exception). 
	Handle the exception in method1.
	
*/

class HandlePropogation{
	
	static void method3(int a,int b){
		int result=a/b;
		System.out.println("Result is: "+result);
	}
	
	static void method2(int a,int b){
		method3(a,b);
	}
	
	static void method1(int a,int b){
		try{
			method2(a,b);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Num1: ");
		int n1=sc.nextInt();
		
		System.out.print("Enter Num2: ");
		int n2=sc.nextInt();
		
		method1(n1,n2);
	}
}

/*
	Design a login system that throws AuthenticationException if the username or password is incorrect. 
	Handle it and display a login failure message.
	
*/

class LoginSystem{
	public static void main(String args[]){
		
		String username="Vels@gmail.com";
		String password="vels1005";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String inputUser=sc.nextLine();
		
		try{
		if(!inputUser.equals(username)){
			throw new Exception("UsernameFailed Exception");
		}
		
		System.out.print("Enter Password: ");
		String inputPass=sc.nextLine();
		
		if(!inputPass.equals(password)){
			throw new Exception("PasswordFailed Exception");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}


	// 9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
	
	class ReadFile{
		
		public static void readAFile(File file){
			try{
			FileReader reader=new FileReader(file);
			int i;
			while((i=reader.read())!=-1){
				System.out.print((char)i);
			}
			}catch(IOException e){
				System.out.println("Exception occured. "+e.getMessage());
			}
		}
		public static void main(String args[]){
			File file=new File("LearnFil.txt");
			readAFile(file);
			
		}
	}
	
	


/*
	10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote.
	Use a custom exception to handle the scenario when an ineligible person tries to register for voting.
	Display appropriate messages for eligible and ineligible voters.

*/

class VotingSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter ur Age: ");
		int age=sc.nextInt();
		
		try{
			if(age<18){
				throw new Exception("AgeRestricted Exception");
			}else{
			System.out.println("You are eligible to vote");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

