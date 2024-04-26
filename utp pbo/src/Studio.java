package src;
public class Studio  {
    private Movie movie;
    private String type;
    private boolean[][] seats;
    Studio(String type){
        this.type=type;
    }
    String getStudioInfo(){
        Ticket.getTicketPrice(type);
        getType();
        getMovie();
        return type;
    }
    int isBooked(char row, int col){
        return row;
    }
    boolean reserve(char row, int col){
        return true;
    }
    String getType(){
        return type;
    }
    String getMovie(){
        return movie.getTitle();
    }
    void setMovie(Movie movie){
        this.movie=movie;
    }
    private void setSeats(){}
}
