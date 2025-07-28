import java.util.*;

class RBI{
	
	double get_Interest(){
		return 5.0;
	}
	
}

class Axis extends RBI{
	
	double get_Interest(){
		return 8.5;
	}

}

class Canara extends RBI{
	
	double get_Interest(){
		return 9;
	}
	
}

class KarurVysa extends RBI{
	
	double get_Interest(){
		return 7;
	}
}


class Main{
	
	static double calculateCompoundInterest(double p, int t, RBI r) {
		
		
		return p*Math.pow((1+r.get_Interest()/100),t);
	}

	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to RBI Interest System");
		System.out.println("------------------------------");
		
		System.out.println("Select your Bank: ");
		
		System.out.println("------------------------------");
		System.out.println("1. AXIS ");
		System.out.println("2. CANARA");
		System.out.println("3. KARUR VYSA");
		System.out.println("------------------------------");
		
		System.out.print("Enter Choice: ");
		int option=sc.nextInt();
		
		RBI rbiObj= null;
		
		
		switch(option){
			case 1:
				rbiObj=new Axis();
				System.out.println("You have choosed AXIS ");
				break;
			case 2:
				rbiObj=new Canara();
				System.out.println("You have choosed CANARA");
				break;
			case 3:
				rbiObj=new KarurVysa();
				System.out.println("You have choosed KARUR VYSA");
				break;
			default:
				System.out.println("You do not Choose Any Bank");
		}
		
		boolean exit=true;
		
		while(exit){
		
		System.out.println("\n------------MENU-------------");
		System.out.println("1. View Interest Rate: ");
		System.out.println("2. Calculate Compound Interest: ");
		System.out.println("3. Exit");
		System.out.println("------------------------------");
		
		System.out.print("Enter your Choice: ");
		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Interest is: "+rbiObj.get_Interest());
				break;
			case 2:
				System.out.println("Enter Principal Amount ");
				double principal=sc.nextDouble();
				
				System.out.println("Enter Years ");
				int year=sc.nextInt();
				
				double result= calculateCompoundInterest(principal,year,rbiObj);
				System.out.printf("Total Amount: %.2f\n",result);
				System.out.printf("Compound Interest: %.2f\n",(result-principal));
				break;
			case 3:
				exit=false;
				System.out.println("EXIT");
				break;
			default:
				System.out.println("Please try Correctly");
		}
		}	
	}
}