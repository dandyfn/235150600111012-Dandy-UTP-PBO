package src;
public class Movie  {
   private String title;
   private double rating;
   private String[] genres;
  
   Movie(String title, double rating){
    this.title=title; this.rating=rating;
   } 
   Movie(String title, double rating, String[] genres){
    this.title=title; this.rating=rating; this.genres=genres;
   }
   String getTitle(){
    return title;
   }
   double getRating(){
    return rating;
   }
   String[] getGenres(){
    return genres;
   }
   void setGenres(String[] genres){}
}
