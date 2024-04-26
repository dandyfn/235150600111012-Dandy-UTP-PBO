package src;

import java.util.Scanner;

public class main {
    /**
     * Innermain
     */
    public class Innermain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaberiktunya;
        do {
             System.out.println("UTP A CINEMA");
         System.out.println("\n1.Login \n2.Register \n3.Exit\nPick your choice");
          angkaberiktunya = input.nextInt();
          if (angkaberiktunya==1) {
            User user1 = new User("dandy.com", "1234", "Dandy Al-Farisi Natanegara", 4.0);
            
          }
        } while (true);


        
    }
        
    }
}
