package src;
public class Ticket  {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;
   
    Ticket(Movie movie, int studioNumber, String seat){
        this.movie=movie; this.studioNumber=studioNumber; this.seat=seat;
    }
    String getTicketInfo(){
        return getSeat();
    }
    Movie getMovie(){
        return movie;
    }
    int getStudioNumber(){
        return studioNumber;
    }
    void setprice(double price){}

    double getPrice(){
        return price;
    }
    String getSeat(){
        return seat;
    }
    static double getTicketPrice(String type){
        if (type.equals("Premiere")) {
            return 120000;
        } else if (type.equals("Imax")) {
            return 100000;
        } else if (type.equals("Reguler")) {
            return 50000;
        }
            
        
        return getTicketPrice(type);
    }
}
