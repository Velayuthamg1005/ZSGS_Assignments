import java.util.*;

// Q.No - 01 if statement to find the minimum of three numbers.

class MinOfThreeNum{
	public static void main(String args[]){
		
		int num1=34;
		int num2=14;
		int num3=6;
		
		if(num1<num2 && num1<num3){
			System.out.println(num1+" is Minimum");
		}
		else if(num2<num3 && num2<num1){
			System.out.println(num2+" is Minimum"); 
		}
		else{
			System.out.println(num3+" is Minimum");
		}
	}
}

// Q.No - 02 Following patterns using for loop

	class XForLoop {

		static void oneLoop(int number, int n) {
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {
					if(i==j || j==n-i- 1) {
						System.out.print(number + " ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

		public static void main(String args[]) {
			int number = 1;
			int n = 5;

			oneLoop(number, n);
		}
	}

	class RPatternForLoop {

		static void RLoop(int n) {
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {
					if ((i==0 && j<n - 1) || j == 0 || (i==n/2 && j<n-1)) {
						System.out.print("R ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

		public static void main(String args[]) {
			int n = 5;
			RLoop(n);
		}
	}



// Q.No - 03. Write a program to do the following patterns using while loop


	class NumberIncreasePattern {

		public static void numberIncrease(int n,int number) {
			int i=0;
			while(i<n) {
				int s=0;
				while(s<Math.abs(n/2-i)) {
					System.out.print(" ");
					s++;
				}

				if(i>n/2) {
					int k=0;
					while (k<n-i) {
						System.out.print((number++) + " ");
						k++;
					}
				} else {
					int j=0;
					while (j<=i) {
						System.out.print((number++) + " ");
						j++;
					}
				}

				System.out.println();
				i++;
			}
		}

		public static void main(String[] args) {
			int n=5;
			int start=1;
			numberIncrease(n,start);
		}
	}

	class WPatternWhileLoop {

		public static void wPattern(int n, char ch) {
			int i=0;
			while (i<n) {
				if(i>n/2) {
					int k=0;
					while(k<n-i) {
						System.out.print(ch + " ");
						k++;
					}
				} else {
					int j=0;
					while(j<=i) {
						System.out.print(ch + " ");
						j++;
					}
				}

				System.out.println();
				i++;
			}
		}

		public static void main(String[] args) {
			int n=5;
			char ch='w';
			wPattern(n, ch);
		}
	}
		

// Q.No 04 Write a program to do the following patterns using do...while loop
   
		class PascalDoWhile {

			public static void pascalTriangle(int n) {
				int i=0;
				do{
					int j=0;
					do{
						if(j>=n-i) {
							break;
						}
						System.out.print(" ");
						j++;
					} while(true);

					int number=1;
					j=0;
					do{
						if(j>i) {
							break;
						}
						System.out.print(number + " ");
						number=number*(i-j)/(j+1);
						j++;
					} while(true);

					System.out.println();
					i++;

				} while(i<n);
			}

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter Rows: ");
				int n=scan.nextInt();

				pascalTriangle(n);
			}
		}



	class MatrixDoWhile {

		public static void printString(String s) {
			s = s.replaceAll(" ", "");
			int ind=0;
			int size=(int)Math.ceil(Math.sqrt(s.length()));
			char[][] mat=new char[size][size];

			int i=0;
			do{
				if(ind>=s.length()) {
					break;
				}
				int j=0;
				do{
					if(j>= size || ind >= s.length()) {
						break;
					}
					mat[i][j] = s.charAt(ind++);
					System.out.print(mat[i][j] + " ");
					j++;
				} while(true);

				System.out.println();
				i++;
			} while(i<size);

			System.out.println();
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String str = scan.nextLine();

			printString(str);
		}
	}



// Q.No - 5 Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class SumOfEvenNumbers{
	
	public static int sumEven(int n){
		
		int sum=0;
		
		for(int i=0;i<=n;i++){
			if(i%2!=0){
				continue;
			}
			else{
				sum=sum+i;
			}
		}
		return sum;
		
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int result=sumEven(num);
		System.out.println(result);
	}
}	

//  Q.No - 6 Define a method to convert the decimal number to a binary number?

class ConvertBinary{
	
	public static void convertBin(int num){
		
		String binary="";
		
		while(num!=0){
			int rem=num%2;
			binary=rem+binary;
			num=num/2;
		}
		
		System.out.println(binary);
		
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		convertBin(num);
	}
}


// Q.No - 7  Use both if and switch case statement  as two ways to find the grade of a student.

// Using if statement

class FindGrade1{
	
	public static void printGrade(int percentage){
		if(percentage>=85 && percentage<=100){
			System.out.println("Grade 'A'");
		}
		else if(percentage>=70){
			System.out.println("Grade 'B'");
		}
		else if(percentage>=50){
			System.out.println("Grade 'C'");
		}
		else{
			System.out.println("Fail");
		}
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int percentage=sc.nextInt();
		printGrade(percentage);
	}
}

// Using switch statement

class FindGrade2{
	
	public static void findGrade(int percentage){
		
		int avg=percentage/10;
		
		switch(avg){
			case 10:
				System.out.println("Grade 'A'");
				break;
			case 9:
				System.out.println("Grade 'A'");
				break;
			case 8:
				if(percentage>=85){
				System.out.println("Grade 'A'");
				break;
				}	
			case 7:
				System.out.println("Grade 'B'");
				break;
			case 5:
				System.out.println("Grade 'C'");
				break;
			default:
				System.out.println("Fail");
		}
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int percentage=sc.nextInt();
		findGrade(percentage);
		
	}
}


