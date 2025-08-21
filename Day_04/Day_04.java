import java.util.*;

/*
	1.We want to store the information about different vehicles. 
	Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
		---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
		---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), 
		   wheel type(alloys or spokes) and fuel tank size(in inches)
	Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
	Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
	Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) 
	Do the same for a Bajaj and a TVS bike.

*/


class Vehicle {
    private int mileage;
    private double price;

    public Vehicle(int mileage,double price) {
        this.mileage=mileage;
        this.price=price;
    }

    public int getMileage(){ 
		return mileage; 
	}
    public void setMileage(int mileage) { 
		this.mileage=mileage; 
	}

    public double getPrice() { 
		return price; 
		}
    public void setPrice(double price) { 
		this.price = price; 
		}
}


class Car extends Vehicle {
    private double ownershipCost;
    private int warranty;
    private int seatingCapacity;
    private String fuelType;

    public Car(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public void displayCarInfo() {
        System.out.println("Mileage: " +getMileage());
        System.out.println("Price: " +getPrice());
        System.out.println("Ownership Cost: " +ownershipCost);
        System.out.println("Warranty(years): " +warranty);
        System.out.println("Seating Capacity: " +seatingCapacity);
        System.out.println("Fuel Type: " +fuelType);
    }
}

class Audi extends Car {
    private String modelType;

    public Audi(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType=modelType;
    }

    public void display() {
        System.out.println("Audi Model: "+modelType);
        super.displayCarInfo();
    }
}

class Ford extends Car {
    private String modelType;

    public Ford(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    public void display() {
        System.out.println("Ford Model: "+modelType);
        super.displayCarInfo();
    }
}


class Bike extends Vehicle {
    private int noOfCylinders;
    private int noOfGears;
    private String coolingType;
    private String wheelType;
    private int fuelTankSize;

    public Bike(int mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, int fuelTankSize) {
        super(mileage, price);
        this.noOfCylinders = noOfCylinders;
        this.noOfGears = noOfGears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
    }

    public void displayBikeInfo() {
        System.out.println("Mileage: " + getMileage());
        System.out.println("Price: " + getPrice());
        System.out.println("No. of Cylinders: " + noOfCylinders);
        System.out.println("No. of Gears: " + noOfGears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize);
    }
}

class Bajaj extends Bike {
    private String makeType;

    public Bajaj(int mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    public void display() {
        System.out.println("Bajaj Make Type: " + makeType);
        super.displayBikeInfo();
    }
}

class TVS extends Bike {
    private String makeType;

    public TVS(int mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    public void display() {
        System.out.println("TVS Make Type: " + makeType);
        super.displayBikeInfo();
    }
}


class VehicleMain {
    public static void main(String args[]) {
        Audi audi = new Audi(14,5000000,4500000,5,5,"Petrol","A8L");
        audi.display();
        System.out.println();

        Ford ford = new Ford(14,3000000,2500000,5,5,"Diesel","Endeavour");
        ford.display();
        System.out.println();

        Bajaj bajaj = new Bajaj(45,95000,2,5,"Air","Alloys",12,"Pulsar");
        bajaj.display();
        System.out.println();

        TVS tvs = new TVS(42,85000,1,4,"Liquid","Spokes",10,"Apache");
        tvs.display();
    }
}



/* 2. 	Construct a base class called twoD contains x and y and methods to read and write the x and y. 
		Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. 
		Also write a method to find the distance of two threeD Points.
			sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
			
		In main:
		
		Create one ThreeD object using the default constructor.
		Use the setters to set x, y, and z.
		Create the second ThreeD object using the constructor with three arguments.
		in the TwoD class:
		Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
		Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
		
*/
		
class TwoD {
    int x;
    int y;

    public TwoD() {
        System.out.println("TwoD default constructor");
        this.x=0;
        this.y=0;
    }

    public TwoD(int x, int y) {
        System.out.println("TwoD constructor with two arguments");
        this.x=x;
        this.y=y;
    }

    public void setX(int x) { 
		this.x=x; 
	}
    public void setY(int y) { 
		this.y=y; 
		}
    public int getX() { 
		return x; 
		}
    public int getY() { 
		return y; 
		}
}

class ThreeD extends TwoD {
    private int z;

    public ThreeD() {
        super();
        this.z=0;
    }

    public ThreeD(int x,int y,int z) {
        super(x,y);
        this.z=z;
    }

    public void setZ(int z) { 
		this.z = z; 
		}
    public int getZ() { 
		return z; 
		}

    public double distance(ThreeD other) {
        int dx=this.x-other.x;
        int dy=this.y-other.y;
        int dz=this.z-other.z;
        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }
}

class Main {
    public static void main(String[] args) {
       
        ThreeD t1 = new ThreeD();
        t1.setX(1);
        t1.setY(2);
        t1.setZ(3);

        ThreeD t2 = new ThreeD(4, 6, 8);

        System.out.println("Distance: " +t1.distance(t2));
    }
}

/*
	3. A class Point is declared as follows:
	
			class Point{
			public:
			Point(){int=0;int=0;} //default constructor
			void setPoint(int,int); //set coordinates
			int getX() const {return x;} //get x coordinates
			int getY() const {return y;} //get y coordinates
			void printPoint(); // print (x,y) coordinates
			private int x;
			private int y;
			};
			
			Write the implementation of the class Point in the same file.
			Then, declare a class called Circle that is derived from the class Point. 
			The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. 
			The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. 
			The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
			
			Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
			Implement the class Circle and write a driver program to test the class Circle. 
			An example of the output of the driver program is.
			Enter x: 2
			Enter y: 2
			Enter radius: 1
			Circle center is (2,2)
			Radius is 1
			Area is 3.14

*/

class Point{
	
	private int x;
	private int y;
	
	public Point(){
		x=0;
		y=0;
	}
	
	public void setPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void printPoint(){
		System.out.println("("+x+","+y+")");
	}
}

class Circle extends Point{
	
	private int radius;
	
	public Circle(){
		super();
		radius=1;
	}
	
	public void setRadius(int radius){
		if(radius>0){
			this.radius=radius;		
		}
		else{
			this.radius=1;
		}	
	}
	
	public int getRadius(){
		return radius;
	}
	
	public double area(){
		return 3.14*radius*radius;
	}

    public void printCircle() {
        System.out.println("Coordinate ("+getX()+","+getY()+")");
        System.out.println("Radius is "+radius);
        System.out.println("Area is "+area());
    }
	
}

class PointMain{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		Circle c=new Circle();
		
		System.out.print("Enter the Value of x: ");
		int valX=sc.nextInt();
		
		System.out.print("Enter the Value of y: ");
		int valY=sc.nextInt();
		
		System.out.print("Enter the Radius: ");
		int r=sc.nextInt();
		
		c.setPoint(valX,valY);
		c.setRadius(r);
		c.printCircle();
		
	}
}

// 4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

/*

class Parent1{
	String name="Parvathy";
	int age=25;
	
	void display(){
		System.out.println("Name is: "+name+"\nAge is: "+age);
	}
}

class Parent2{
	String name="Karthik";
	int age=23;
	
	void display(){
		System.out.println("Name is: "+name+"\nAge is: "+age);
	}
}

class Child extends Parent1,Parent2{		
}

*/

/*  Q-No - 5

	Create a class named Shape with a method that prints "This is a shape". 
	Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". 
	Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. 
	Again, make another class named Square having the same method which prints "Square is a rectangle".
	Now, try calling the method by the object of each of these classes.

*/

class Shape{
	public void display(){
		System.out.println("This is a Shape");
	}
}

class Polygon extends Shape{
	public void display(){
		System.out.println("Polygon is a Shape");
	}
}

class Rectangle extends Polygon{
	public void display(){
		System.out.println("Rectangle is a polygon");
	}
}

class Triangle extends Polygon{
	public void display(){
		System.out.println("Triangle is a polygon");
	}
}

class Square extends Rectangle{
	public void display(){
		System.out.println("Square is a rectangle");
	}
}
	
class ShapeMain{
	public static void main(String args[]){
		
		Shape sh=new Shape();
		sh.display();
	
		Shape pl=new Polygon();
		pl.display();
		
		Shape rt=new Rectangle();
		rt.display();
		
		Shape tr=new Triangle();
		tr.display();
		
		Shape sq=new Square();
		sq.display();
		
	}	
}

/*
 
	6 - Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. 
	Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods

*/

// 1. int length() – Returns the number of characters

class MyString
{
	private char[] ch;
	MyString(String s)
	{
		this.ch = s.toCharArray();
	}
	
	public int length()
	{
		return ch.length;
	}
	
	
//2. char charAt(int index) – Returns the character at the specified index.
	
	public char charAt(int i)
	{
		return ch[i-1];
	}
	
//3. boolean equals(MyString other) – Checks if two MyString objects are equal.
	
	public boolean equals(String s1)
	{
		char[] ch1 = s1.toCharArray();
		for(int i = 0; i < ch1.length; i++)
		{
			if(ch[i] != ch1[i])
			{
				return false; 
			}
		}
		return true;
	}
	
//4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
	
	public String toUpperCase()
	{
		String str = "";
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
			{
			    str += (char) (ch[i] - 32);
			}
			else
			{
				str += ch[i];
			}
		}
		return str;
	}
	
//5. MyString toLowerCase() – Returns a new string with all characters in lowercase.

    public String toLowerCase() 
	{
        String str = "";
        for (int i = 0; i < ch.length; i++) 
		{
            if (ch[i] >= 'A' && ch[i] <= 'Z') 
			{
                str += (char)(ch[i] + 32);
            } 
			else 
			{
                str += ch[i];
            }
        }
        return str;
    }
	
//6. MyString substring(int start, int end) – Returns a substring from start to end-1.
	
	public String substring(int start, int end)
	{
		String str = "";
		for(int i = start; i < end; i++)
		{
			str += ch[i];
		}
		return str;
	}
	
//7. MyString concat(MyString other) – Concatenates another string to the current one.
	
	public String concat(String s2)
	{
		String str = s2;
		for(int i = 0; i < ch.length; i++)
		{
			str += ch[i];
		}
		return str;
	}
	
//8. boolean contains(MyString sub) – Checks if a substring exists.
	
	public boolean contains(String sub)
	{
		char[] ch2 = sub.toCharArray();
		if(ch2.length > ch.length)
		{
			return false;
		}
		for(int i = 0; i <= ch.length-ch2.length; i++)
		{
			int j = 0;
			while(j < ch2.length && ch[i+j] == ch2[j])
			{
				j++;
			}
			if(j == ch2.length)
			{
				return true;
			}
		}
		return false;
	}
	
//9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
	
	public int indexOf(char c)
	{
		int index = -1;
        for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == c)
			{
				index = i;
			}
		}			
		return index;
	}
	
//10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
	
	public String replace(char oldc, char newc)
	{
		String str = "";
	 	char oldc2 = (char) (oldc + 32);
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == oldc)
			{
				str += newc;
			}
			else if(ch[i] == oldc2)
			{
				str += (char) (newc + 32);
			}
			else
			{
				str += ch[i];
			}
		}
		return str;
	}
}



/*

	7. Design a calculator application using Java Inheritance.
‌
	Create the following class hierarchy:
‌
	--->BasicCalculator (Base class):
	Implement at least three basic arithmetic methods, such as:
‌
	--->add(int a, int b)
	--->subtract(int a, int b)
	--->multiply(int a, int b)
	--->divide(int a, int b)
‌
	--->AdvancedCalculator (Inherits from BasicCalculator):
	Add 3 to 4 advanced mathematical operations, such as:
‌
	--->power(int base, int exponent)
	--->modulus(int a, int b)
	--->squareRoot(double number)
‌
	--->ScientificCalculator (Inherits from AdvancedCalculator):
	Add scientific functions, such as:
‌
	--->sin(double angle)
	--->cos(double angle)
	--->log(double value)
	--->exp(double value)
	* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
	* Use appropriate access specifiers and method overrides where required.
	* Add a main() method to test all operations.
*/

class BasicCalculator
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public int subtract(int a, int b)
	{
		return a - b;
	}
	
	public int multiply(int a, int b)
	{
		return a * b;
	}
	
	public int divide(int a, int b)
	{
		return a / b;
	}
}

class AdvancedCalculator extends BasicCalculator
{
	public double power(int base, int exponent)
	{
		return Math.pow(base, exponent);
	}
	
	public int modulus(int a, int b)
	{
		return a % b;
	}
	
	public double squareRoot(double number)
	{
		return Math.sqrt(number);
	}
}

class ScientificCalculator extends AdvancedCalculator
{
	public double sin(double angle)
	{
		return Math.sin(Math.toRadians(angle));
	}
	
	public double cos(double angle)
	{
		return Math.cos(Math.toRadians(angle));
	}
	
	public double log(double value)
	{
		return Math.log(value);
	}
	
	public double exp(double value)
	{
		return Math.exp(value);
	}
}

class Calculator
{
	public static void main(String[] args)
	{
		ScientificCalculator c = new ScientificCalculator();
		
		System.out.println("---Basic Calculator---");
		System.out.println("Addition : " + c.add(10, 5));
		System.out.println("Substraction : " + c.subtract(10, 5));
		System.out.println("Multiplication : " + c.multiply(10, 5));
		System.out.println("Division : " + c.divide(10, 5));
		
		System.out.println("---Advanced Calculator---");
		System.out.println("Power : " + c.power(2, 3));
		System.out.println("Modulus : " + c.modulus(10, 3));
		System.out.println("Square Root : " + c.squareRoot(25));
	
	    System.out.println("---Scientific Calculator---");
		System.out.println("Sine : " + c.sin(30));
		System.out.println("Cosine : " + c.cos(60));
		System.out.println("Log : " + c.log(10));
		System.out.println("Exponential : " + c.exp(2));
	
	}
}


