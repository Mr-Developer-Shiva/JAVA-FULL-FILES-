
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo{
    public static void main(String[] args){ 
                                                    //ArrayList - collection
        ArrayList<Bus> buses = new ArrayList<Bus>(); 
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,true,1));
        buses.add(new Bus(2,false,1));
        buses.add(new Bus(3,true,1));

        int userOption =1;
        Scanner sc =new Scanner(System.in);

        for(Bus b:buses){
            b.displayBusInfo();
        }

        while(userOption==1){
             System.out.println("Enter 1 to Book and 2 to Exit");
             userOption=sc.nextInt();
             if(userOption == 1){
               Booking booking = new  Booking();
               if(booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                System.out.println("Your Booking is confirmed...");
               }else{
                System.out.println("Sorry, Bus is full. Try Another bus or date.");
               }
             }
        }
    }
}