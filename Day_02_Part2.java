import java.util.*;

// Q.No - 1 Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers

class ArrayFunctions{
	public static void main(String args[]){
		
		int[] arr = new int[10];	// Creates Array
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){		// Accept Values
			System.out.println("Enter "+(i+1)+" Value");
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				sum=sum+arr[i];
			}
		}
		
		System.out.println(sum);
		
	}
}

// Q.No - 2 Write a program to take in 10 values and print only those numbers which are prime.

class PrintPrime{
	
	public static boolean isPrime(int n){
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
					return false;
				}
			}
		return true;
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++){
			
			if(isPrime(arr[i])){
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}

// Q.No - 3 Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class GenerateFibo{
	public static void main(String args[]){
		int[] arr= new int[30];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<30;i++){
			arr[i]=arr[i-1]+arr[i-2];		
		}
		
		for(int i=0;i<30;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

// Q.No - 4 Design a function void print( ) with a single dimensional array x[] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ) 

class SumOfSingleDouble{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int length=sc.nextInt();
		
		int[] arr=new int[length];
		
		for(int i=0;i<arr.length-1;i++){
			arr[i]=sc.nextInt();
		}
		
		printSingleDouble(arr,length);
	}
	
	static void printSingleDouble(int arr[],int n){
		
		int singleNum=0;
		int doubleNum=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]>=0 && arr[i]<=9){
				singleNum=singleNum+arr[i];
			}
			else if(arr[i]>=10 && arr[i]<=99){
				doubleNum=doubleNum+arr[i];
			}
		}
		
		System.out.println("Sum of Single Digit: "+singleNum);
		System.out.println("Sum of Double Digit: "+doubleNum);
	}
}

// Q.No - 5 Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. 

class CheckChar{
	public static void main(String args[]){
		
		char[] x={'m','n','o','p'};
		char[] y={'m','x','o','p'};
		
		boolean isEqual = true;
		
		if(x.length!=y.length){
			isEqual=false;
		}
		else{
			for(int i=0;i<x.length;i++){
				if(x[i]!=y[i]){
					isEqual=false;
					break;
				}
			}
		}
		
		if(isEqual){
			System.out.println("They are Identical");
		}
		else{
			System.out.println("They are not identical");
		}
	}
}

// Q.No - 6 Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
// {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}

class CheckGraduationYear{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		int[] years={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
		
		Arrays.sort(years);
		
		boolean isValid=checkYear(years,year);
		
		if(isValid){
			System.out.println("Record Exists");
		}
		else{
			System.out.println("Record Not Exists");
		}	
	
	}
	
	static boolean checkYear(int[] arr,int year){
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right){
			int mid=(left+right)/2;
			
			if(arr[mid]==year){
				return true;
			}
			else if(arr[mid]<year){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		return false;
	}
}

// Q.No - 7  Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

class SortDisplayWeight{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		int[] weight=new int[10];
		
		for(int i=0;i<weight.length;i++){
			weight[i]=sc.nextInt();
		}
		
		for(int i=0;i<weight.length;i++){
			int max=i;
			
			for(int j=i+1;j<weight.length;j++){
				if(weight[j]>weight[max]){
					max=j;
				}
			}
			
			int temp=weight[i];
			weight[i]=weight[max];
			weight[max]=temp;
		}
		
		for(int i=0;i<weight.length;i++){
			System.out.print(weight[i]+" ");
		}
		
	}
}

// Q.No - 8 Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60

class CountCategory{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int[] age=new int[10];
		
		int lessThan18=0;
		int betweenRange=0;
		int greater60=0;
		
		for(int i=0;i<age.length;i++){
			age[i]=sc.nextInt();
			
			if(age[i]<18){
				lessThan18++;
			}
			else if(age[i]<=60){
				betweenRange++;
			}
			else{
				greater60++;
			}
		}
		
		System.out.println("Less Than 18: "+lessThan18);
		System.out.println("Between 18 to 60: "+betweenRange);
		System.out.println("Above 60: "+greater60);
	}
}

// Q.No - 9 Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

class StudentData{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int[] rollNo= new int[5];
		int[][] marks=new int[5][3];
		int[] totalMarks=new int[10];
		double[] average=new double[10];
		
		for(int i=0;i<rollNo.length;i++){
			
			System.out.println("Enter RollNo: ");
			rollNo[i]=sc.nextInt();
			
			int total=0;
			
			for(int j=0;j<3;j++){
				System.out.println("Enter Marks ");
				marks[i][j]=sc.nextInt();
				total=total+marks[i][j];
			}
			
			totalMarks[i]=total;
			average[i]=total/3.0;
			
		}
		
		System.out.printf("%-10s %-15s %-10s\n", "Roll No", "Total Marks", "Average");
		
		for(int i=0;i<rollNo.length;i++){
			System.out.printf("%-10s %-15s %-10s\n", rollNo[i],totalMarks[i],average[i]);
		}
		
	}
}
	
// Q.No - 10 Write a menu driven program to do following operation 

class MenuDrivenMatrix{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] matrix=new int[row][col];
		
		int option;
		
		do{
			System.out.println("1. Input Element");
			System.out.println("2. Display Matrix");
			System.out.println("3. Sum of all Elements");
			System.out.println("4. Row wise sum");
			System.out.println("5. Column wise sum");
			System.out.println("6. Exit");
			
			System.out.println("Enter the option: ");
			option=sc.nextInt();
			
			switch(option){
				case 1:
					inputElements(matrix,row,col,sc);
					break;
				case 2:
					display(matrix,row,col);
					break;
				case 3:
					sumElements(matrix,row,col);
					break;
				case 4:
					rowSum(matrix,row,col);
					break;
				case 5:
					colSum(matrix,row,col);
					break;
				case 6:
					transMatrix(matrix,row,col);
					break;
				case 7:
					System.out.println("Exiting Program");
					break;
				default:
					System.out.println("Incorrect Option");
			}
		}while(option!=7);
	}
	
	static void inputElements(int[][] matrix,int row,int col,Scanner sc){
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
	}
	
	static void display(int[][] matrix,int row,int col){
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	static void sumElements(int[][] matrix,int row,int col){
		
		int sum=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				sum=sum+matrix[i][j];
			}
		}
		System.out.println("Sum of all Elements "+sum);
	}
	
	static void rowSum(int[][] matrix,int row,int col){
		
		for(int i=0;i<row;i++){
			int rowSum=0;
			for(int j=0;j<col;j++){
				sum=sum+matrix[i][j];
			}
			System.out.println("Row Sum: "+rowSum);
		}
	}
	
	static void colSum(int[][] matrix,int row,int col){
		
		for(int j=0;j<col;j++){
			int colSum=0;
			for(int i=0;i<row;i++){
				sum=sum+matrix[i][j];
			}
			System.out.println("Column Sum: "+colSum);
		}
	}
	
	static void transMatrix(int[][] matrix,int row,int col){
		
		for(int j=0;j<col;j++){
			for(int i=0;i<row;i++){
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
	
	
	






