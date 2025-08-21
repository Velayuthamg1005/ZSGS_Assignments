import java.util.*;

//1. Illustrates with an example of using Singleton class.

class Singleton
{
	private static Singleton object;
	
	private Singleton()
	{
		System.out.println("Singleton Private Constructor");
	}
	
	public static Singleton getObject()
	{
		if(object == null)
		{
			object = new Singleton();
		}
		return object;
	}
	
	public void showObject(String s)
	{
		System.out.println(s);
	}
}

class SingletonOperation
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getObject();
		s1.showObject("Singleton Object 1");
		Singleton s2 = Singleton.getObject();
		s2.showObject("Singleton Object 2");
		if(s1 == s2)
		{
			System.out.println("Both Objects are Same");
		}
		else
		{
			System.out.println("Both are different object");
		}
	}
}

//2. Develop a Java program which illustrates the usage of Comparator Interface.

class Student
{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "Roll No : "+rollno + ", Name : " + ", Age : " + age;
	}
}

class SortedAges implements Comparator<Student>
{
	public int compare(Student a, Student b)
	{
		return a.age - b.age;
	}
}

class ComparatorOperation
{	
	public static void main(String[] args)
	{
		ArrayList<Student> li = new ArrayList<>();
		Student s1 = new Student(01, "Viki", 24);
		Student s2 = new Student(03, "Rajaaa", 19);
		Student s3 = new Student(39, "Bharath", 10);
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		SortedAges sa = new SortedAges();
		
		Collections.sort(li, sa);
		
		for(Student s : li)
		{
			System.out.println(s);
		}
	}
}

//3. Develop a Java program which illustrates the usage of Comparable Interface.

class Students implements Comparable<Students>
{
	int rollno;
	String name;
	int age;
	
	Students(int rollno, String name, int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Students other)
	{
		return this.rollno - other.rollno;
	}
	
	public String toString()
	{
		return "Roll No : " + rollno + ", Name : " + name + ", Age : " + age;
	}
}

class ComparableOperation
{	
	public static void main(String[] args)
	{
		ArrayList<Students> list = new ArrayList<>();
		Students s1 = new Students(12, "Fathima", 23);
		Students s2 = new Students(11, "Farhana", 22);
		Students s3 = new Students(17, "Thiru", 21);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list);
		
		for(Students s : list)
		{
			System.out.println(s);
		}
	}
}

//4. Get some strings through the command-line prompt and use an array to store and display them.

class CommandLineArgs
{
	public static void main(String[] args)
	{
		String[] words = new String[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			words[i]=args[i];
		}
		
		for(String s:words)
	    {
		    System.out.println(s);
	    }
	}
}

//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

class Address implements Cloneable 
{
    String city;

    Address(String city) 
	{
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException 
	{
        return super.clone();
    }
}

class Person implements Cloneable 
{
    String name;
    Address address;

    Person(String name, Address address) 
	{
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException 
	{
        return super.clone();
    }
}

class CloneOperation
{
    public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address addr = new Address("Madurai");
		Person oldObj = new Person("Rajaa", addr);
        Person newObj = (Person) oObj.clone();

        System.out.println("Original: Name : "+oldObj.name + ", Address : " + oldObj.address.city);
        System.out.println("Copied: Name : "+newObj.name + ", Address : " + newObj.address.city);
		
	    cObj.address.city = "Mumbai";
		
		System.out.println("Original: Name : " +oldObj.name + ", Address : " + oldObj.address.city);
        System.out.println("Copied: Name : " +newObj.name + ", Address : " + newObj.address.city);
    }
}

//6. Develop a Java program to illustrate pass-by-value.

class PersonName
{
	String name;
	
	PersonName(String name)
	{
		this.name = name;
	}
}

class PassByValue
{
	public static void numberChange(int n)
	{
		n = n*40;
		System.out.println("Inside n = " +n);
	}
	
	public static void reAssign(PersonName p)
	{
		p = new PersonName("New String");
		System.out.println("Inside reAssign Method p.name = "+p.name);
	}
	
	public static void objectChange(PersonName p)
	{
		p.name = "Changing";
		System.out.println("Inside Method p.name = " + p.name);
	}		
	
	public static void main(String[] args)
	{
		int n = 10;
		PersonName p = new PersonName("Before"); 
		
		System.out.println("Before numberChange n = " + n);
		numberChange(n);
		System.out.println("After numberChange n = " + n + "\n");
		
		System.out.println("Before ChangeReAssign p.name = " + p.name);
		reAssign(p);
		System.out.println("After ChangeReAssign p.name = " + p.name + "\n");
		
		System.out.println("Before objectChange p.name = " + p.name);
		objectChange(p);
		System.out.println("After objectChange p.name = " + p.name);
	}
} 

//7. Develop a Java program to illustrate the usage of toString() method.

class StudentDetails
{
	private int rollno;
	private String name;
	private double mark;
	
	StudentDetails(int rollno, String name, double mark)
	{
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}
	
	public String toString()
	{
		return "Student RollNo : " +rollno + ",Name : " + name + ", Mark : " + mark;
	}
}

class ToStringOperation
{
	public static void main(String[] args)
	{
		StudentDetails s1 = new StudentDetails(107, "Prince",78);
		StudentDetails s2 = new StudentDetails(102, "Durai", 97);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}


/*8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
-->Create a class Student with fields like name, rollNo, and department.
-->Attempt to clone an object of this class using the clone() method.
-->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable*/

class student implements Cloneable
{
	String name;
	int rollNo;
	String department;
	
	student(String name, int rollNo, String department)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public String toString()
	{
		return "Student Name : " +name+ ", RollNo : " +rollNo + ", Department : " +department;
	}
}
 
class ClonableInterface
{
	public static void main(String[] args)
	{
		student s1 = new student("Gautam", 134, "MCA");
		
		try{
			student s2 = (student) s1.clone();
			
			System.out.println("Original : "+s1);
			System.out.println("Cloning : "+s2);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("CloneNotSupportedException : "+e.getMessage());
		}
	}
}