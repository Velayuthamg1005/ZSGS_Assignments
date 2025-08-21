import java.util.*;


// Q-No 01 Given two binary strings a and b, return their sum as a binary string

class ReturnSum{
	public static void main(String args[]){
		String a="10";
		String b="11";
		
		int x=a.length()-1;
		int y=b.length()-1;
		
		int carry=0;
		String sum="";
		
		while(x>=0 || y>=0 || carry>0){
			int solveA=0;
			int solveB=0;
			
			if(x>=0){
				solveA=a.charAt(x)-'0';
			}
			if(y>=0){
				solveB=b.charAt(y)-'0';
			}
			
			int total=solveA+solveB+carry;
			int digit=total%2;
			carry=total/2;
			
			sum=digit+sum;
			x--;
			y--;
		}
		
		System.out.println("Result: "+sum);
	}
}


// Q-No 06 Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

class SumString{
	public static void main(String args[]){
		String a="11";
		String b="123";
		
		int x=a.length()-1;
		int y=b.length()-1;
		
		int carry=0;
		String sum="";
		
		while(x>=0 || y>=0 || carry>0){
			int solveA=0;
			int solveB=0;
			
			if(x>=0){
				solveA=a.charAt(x)-'0';
			}
			if(y>=0){
				solveB=b.charAt(y)-'0';
			}
			
			int total=solveA+solveB+carry;
			int digit=total%10;
			carry=total/10;
			
			sum=digit+sum;
			x--;
			y--;
		}
		System.out.println("Result: "+sum);
	}
}
