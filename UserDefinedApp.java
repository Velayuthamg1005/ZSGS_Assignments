import java.util.*;
import arithmetic.ArithmeticOperations;
import stringutils.StringOperation;

public class UserDefinedApp{
	
	
	public static void main(String args[]){
		
		ArithmeticOperations ato=new ArithmeticOperations();
		StringOperation so=new StringOperation();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Options to Perform Operation: ");
		System.out.println("1. Arithmetic Operations");
		System.out.println("2. String Operations");
		System.out.println("3. Exit");
		int option=sc.nextInt();
		
		switch(option){
			case 1:
				System.out.print("Enter Number 1: ");
				int num1=sc.nextInt();
				
				System.out.print("Enter Number 2: ");
				int num2=sc.nextInt();
				
				System.out.println("Enter the operation to perform: ");
				System.out.println("1.Addition ");
				System.out.println("2.Subtraction ");
				System.out.println("3.Multiplication ");
				System.out.println("4.Division ");
				System.out.println("5.Modulo ");
				
				int choice=sc.nextInt();
				
				switch(choice){
					case 1:
						System.out.print("Addition: "+ato.addition(num1,num2));
						break;
					case 2:
						System.out.print("Subtraction: "+ato.subtract(num1,num2));
						break;
					case 3:
						System.out.print("Multiplication: "+ato.multiply(num1,num2));
						break;
					case 4:
						System.out.print("Division: "+ato.division(num1,num2));
						break;
					case 5:
						System.out.print("Modulo: "+ato.modulo(num1,num2));
						break;
					default:
						System.out.print("Please Give Correct Operations");
				}
				
				break;
			case 2:
				
				System.out.println("Enter the operation to perform: ");
				System.out.println("1.Concatenating two strings ");
				System.out.println("2.Reversing a string ");
				System.out.println("3.Finding the length of a string ");
				
				int whichOne=sc.nextInt();
				
				switch(whichOne){
					case 1:
						System.out.println("Enter String 1: ");
						String s1=sc.next();
						
						System.out.println("Enter String 2: ");
						String s2=sc.next();	
						
						System.out.print("Concatenating two strings: "+so.concatStrings(s1,s2));
						break;
					case 2:
						System.out.print("Enter String: ");
						String original=sc.next();
						
						System.out.print("Reversing a string: "+so.reverseString(original));
						break;
					case 3:
						System.out.print("Enter String: ");
						String str=sc.next();
						
						System.out.print("Finding the length of a string: "+so.stringLength(str));
						break;
					default:
						System.out.print("Please Give Correct Operations");
				}
				
				break;
				
				case 3:
					System.out.println("EXIT");
					break;	
		}
		
	}
}