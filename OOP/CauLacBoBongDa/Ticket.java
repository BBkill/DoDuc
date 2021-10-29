package CauLacBoBongDa;

public class Ticket {
    private String idClub;
    private long ticketPrice;
    Ticket(){}
    public long getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getId() {
        return idClub.substring(1,3);
    }
    public  String getIdClub()
    {
        return idClub;
    }


    public void setIdClub(String idClub) {
        this.idClub = idClub;
    }
}
