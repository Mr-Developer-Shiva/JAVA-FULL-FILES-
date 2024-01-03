import java.util.*;

class Book{
    String hungerGame;
    String harryPotter;
    String pride;
    String bookThief;
    String twilight;  
}
class Card {
    int id;
    String pleace;
}
// class ReminderMessage{
//     boolean visit;
//     int bookName;
//     int bookPrice;
// }

public class Librarie{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User(null,0,0,0);
        Card card = new Card();
        System.out.println(card);   //Address.....
       
        int id = user.id = 1234;
        int cid = card.id = 1234;
        System.out.println("Enter Your Name :-" );
        String name = user.name = scan.next();
        System.out.println("Enter Your ID Number : ");
        int ucId = user.id = scan.nextInt() ;
    
       if(id!=ucId){
        System.out.println("_____________________Your ID Was Wrong____________");
       }
       else if(id == ucId){
        System.out.println("Your Name is : " + name + "\nYour ID Number is : " + ucId );
        boolean bool = true; 
       
        while(bool){
            System.out.println("1.Show Book Details");
            System.out.println("5.Exit");
            int choice = scan.nextInt();
            
            switch(choice){
                case 1:{
                    bookDetails();
                    break;
                }
                case 5:
                { 
                    bool = false;
                    break;
                }
                default:
                System.out.println("You Enter a invalid Number****");
            }
        }
       }

    }
    public static void bookDetails(){
        String[] arr  = {"1.hunger Game","2.harry Potter","3.Pride","4.Book Thief","5.Twilight"};
        for(String x : arr){
            System.out.println(x);
        }
    }
    public static void buy(){
        System.out.println();
    }
}