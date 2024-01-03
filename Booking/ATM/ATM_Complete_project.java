import java.util.*;

public class ATM_Complete_project {
    public static void main(String args[]){
        int pin =1234;
        int balance =10000;

        int addAmount = 0;
        int takeAmount = 0;

        String name;
//we have to take an input by an user
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your pin number:");

        int password = scanner.nextInt();

        //code arrangment shift+alt+f

        if (password==pin)
        {
            System.out.println("Enter your name:");
            name =scanner.next();
            System.out.println("welcome" + name);
            
                while(true){
                    System.out.println("Press 1 to check your balance:");
                    System.out.println("Press 2 to add Amount:");
                    System.out.println("Press 3 to take Amount:");
                    System.out.println("Press 4 to take Recipt:");
                    System.out.println("Press 5 to EXIT");

                    int opt=scanner.nextInt();
                    switch(opt)
                    {
                        case 1:
                            System.out.println("your current balance is:" + balance);
                            break;
                        case 2:
                            System.out.println("How much amount did you want to ADD to your account ?");
                            addAmount=scanner.nextInt();
                            System.out.println("Successfully credited");
                            balance = addAmount + balance;
                            //10000 = 100 + 10000
                            //balance =10100
                            break;
                        case 3:
                            System.out.println("How much amount did you want to take ?");
                            takeAmount=scanner.nextInt();
                            if(takeAmount>balance)
                            {
                                System.out.println("Your balance is insufficient");
                                System.out.println("try  less than your available balance");
                            }
                            else
                            {
                                System.out.println("Successfully your are Depited");
                                balance = balance - takeAmount;
                            }
                            //balance =10100 -100
                            //balance = 10000
                            break; 
                            case 4:

                                System.out.println("Welcome to All in One SHIVA ATM !");
                                System.out.println("Available balance is" + balance);
                                System.out.println("Amount deposited " + addAmount);
                                System.out.println("Amount taken" + takeAmount);
                                System.out.println("Thanks for Coming");
                                break;

                           
                                                           
                        }
                        if (opt==5){
                            System.out.println("Thank you");
                            break;
                        }
                }
        }
        else{
            System.out.println("Wrong Pin Numbr");
        }
    }
}