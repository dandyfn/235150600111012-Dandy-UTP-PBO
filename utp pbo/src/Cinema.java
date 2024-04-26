package src;
/**
 * Cinema
 */
public class Cinema {
private String name;
private User[] listUsers;
private Studio[] listStudio;
int studioCapacity;
private User user;
private boolean Studio;
private boolean User;
Cinema(String name, int studioCapacity ){}

private void init(){}

boolean registerUser(User user){
    this.user=user;
    boolean berhasil;
    if (berhasil=true) {
        return true;
    } else {
        return false;
    }
    
}
User authenticateUser(String email, String password){
    return user;
}
void displayListStudio(){
    int t=0;
    for (int i = 0; i < listStudio.length; i++) {
        System.out.println(listUsers[t]);
    }
    
}

void displayStudioDetail(int studioNumber){}

boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres){
    return Studio;
}
boolean bookTicket(User user, int studioNumber, char row, int col){
    return User;
}
String getname(){
    return name;
}
}