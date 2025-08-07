// 1. Illustrates with an example of using Singleton class.

class Singleton{
	private static final Singleton INSTANCE=new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		return INSTANCE;
	}
}

class SingletonDemo{
	public static void main(String args[]){
		System.out.println("Instance First Time");
		Singleton obj1=Singleton.getInstance();
		
		System.out.println("Instance Second Time");
		Singleton obj2=Singleton.getInstance();
		
		System.out.println("Are Both Instance same? "+(obj1==obj2));
	}
}

// 2. 