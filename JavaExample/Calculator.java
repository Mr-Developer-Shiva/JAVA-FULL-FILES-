import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 Addition");
        System.out.println("Press 2 Substraction");
        System.out.println("Press 3 Multiplication");
        System.out.println("Press 4 Division");
        System.out.println("Press 5 Exit");
        
        int input = sc.nextInt();
        switch(input)
        {
            case 1:
                    System.out.println("Enter The two Numbers : ");
                    double firstNumber = sc.nextDouble();
                    System.out.println("Enter a First Number: " + firstNumber);
                    double secondNumber = sc.nextDouble();
                    System.out.println("Enter a Second Number: " + secondNumber);

                    double answer  = firstNumber + secondNumber;
                    System.out.println("Total = " + answer);
            break;
            case 2:
                    System.out.println("Enter The two Numbers : ");
                    double firstNumber2 = sc.nextDouble();
                    System.out.println("Enter a First Number: " + firstNumber2);
                    double secondNumber2 = sc.nextDouble();
                    System.out.println("Enter a Second Number: " + secondNumber2);

                    double answer2  = firstNumber2- secondNumber2;
                    System.out.println("Total = " + answer2);
            break;
            case 3:
                    System.out.println("Enter The two Numbers : ");
                    double firstNumber3 = sc.nextDouble();
                    System.out.println("Enter a First Number: " + firstNumber3);
                    double secondNumber3 = sc.nextDouble();
                    System.out.println("Enter a Second Number: " + secondNumber3);

                    double answer3  = firstNumber3 * secondNumber3;
                    System.out.println("Total = " + answer3);
            break;
            case 4:
                    System.out.println("Enter The two Numbers : ");
                    double firstNumber4 = sc.nextDouble();
                    System.out.println("Enter a First Number: " + firstNumber4);
                    double secondNumber4 = sc.nextDouble();
                    System.out.println("Enter a Second Number: " + secondNumber4);

                    double answer4 = firstNumber4 / secondNumber4;
                    System.out.println("Total = " + answer4);
            break;
            default:
                System.out.println("Thank you ");
            
        }
       }

    }

