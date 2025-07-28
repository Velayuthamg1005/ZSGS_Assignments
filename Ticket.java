package travel.booking;

public class Ticket{
	private String ticketId;
	private String destination;
	private double fare;
	
	public Ticket(String ticketId,String destination,double fare){
		this.ticketId=ticketId;
		this.destination=destination;
		this.fare=fare;
	}
	
	public String getTicketId(){
		return ticketId;
	}
	
	public String getDestination(){
		return destination;
	}
	
	public double getFare(){
		return fare;
	}
	
    public void displayTicketInfo() {
        System.out.println("Ticket ID: "+ticketId);
        System.out.println("Destination: "+destination);
        System.out.println("Fare: Rs:" +fare);
    }
}