package src;
public class User  {
  private String email;
  private String password;
  private String fullname;
  private double balance;
  private Ticket[] ticketslist;
  
  static private int MAXTICKET;

 User(String email, String password, String fullName, double balance){
    this.email=email; this.password=password; 
    this.fullname=fullName; this.balance=balance;
    
  }  
 
 
  boolean addTicket(Ticket ticket){
    
    return true;
  }
  void displayAllTickets(){

  }

  boolean isMatch(String email, String password){
    return true;
  }
  String getEmail(){
    return email;
  }
  String getPassword(){
    return password;
  }
  String getFullName(){
    return fullname;
  }
  double getBalance(){
    return balance;
  }
  void setBalance(double balance){}
}
