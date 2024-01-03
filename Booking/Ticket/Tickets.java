import java.util.*;
public class Tickets{
    public static void main(String[] args){
        int number; 
        int otp ;
        final int password = 9056;
        String name ;

        System.out.println("Press 1 to Booking the ticket.......");
        System.out.println("Press 2 to Booking the cancel.......");
        System.out.println("Press 3 to View the Seats.......");
        System.out.println("Press 4 to Exit.......");

        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();
        
        if(number == 1){
            System.out.println("Enter Your Name: " );
        }else{
            System.out.println("Thank You For Visiting........");
        }
    }
}