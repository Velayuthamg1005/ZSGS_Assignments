package travel.user;
import travel.booking.Ticket;

public class User{
	
	private String user_name;
	private String gender;
	
	public User(String user_name,String gender){
		this.user_name=user_name;
		this.gender=gender;
	}
	
    public void bookTicket() {
    
        Ticket tkt=new Ticket("101","Chennai",8500.00);

        System.out.println("Passenger Name: " +user_name);
		System.out.println("Gender: "+gender);
        System.out.println("Proceed To Book Ticket");
        tkt.displayTicketInfo(); 
    }

		
}