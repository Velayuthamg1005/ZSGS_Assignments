class Vehicle{
	
	private float mileage;
	private double price;
	
	public void setValue(float mileage,double price){
		this.mileage=mileage;
		this.price=price;
	}
	
}

class Car extends Vehicle{
	private double ownershipCost;
	private int warranty;
	private int seating_capacity;
	private String fuelType;
	
	public void setCarDetails(double ownershipCost,int warranty,int seating_capacity,String fuelType){
		this.ownershipCost=ownershipCost;
		this.warranty=warranty;
		this.seating_capacity=seating_capacity;
		this.fuelType=fuelType;
	}
	
}

class Bike extends Vehicle{
	private int noOfCylinders;
	private int noOfGears;
	private String coolingType;
	private String wheelType;
	private int tank_size;
	
	public void setBikeDetails(int noOfCylinders,int noOfGears,String coolingType,String wheelType,int tank_size){
		this.noOfCylinders=noOfCylinders;
		this.noOfGears=noOfGears;
		this.coolingType=coolingType;
		this.wheelType=wheelType;
		this.tank_size=tank_size;
	}
}
