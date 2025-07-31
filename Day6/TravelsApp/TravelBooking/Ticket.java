
public class Ticket {
    private String ticketId;
    private String destination;
    private double fare;
    
    
     public Ticket(String ticketId, String destination, double fare) {
        this.ticketId = ticketId;
        this.destination = destination;
        this.fare = fare;
    }

    public String getTicketId() {
        return ticketId;
    }
    public String getDestination() {
        return destination;
    }
    public double getFare() {
        return fare;
    }


    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }

    
    
}
