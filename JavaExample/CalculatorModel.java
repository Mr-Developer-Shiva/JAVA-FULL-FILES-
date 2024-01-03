import java.util.*;
public class CalculatorModel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       

        boolean loop = true;
        while(loop){    
        System.out.println("1.Addtion \n2.Substraction \n3.Multiplication \n4.Division \n5.Modulus \n6.Exit");
        int n = scan.nextInt();
         int a = scan.nextInt();
        int b = scan.nextInt();
        switch(n){
            case 1 :{
                int c = a + b;  
                System.out.println(c);
                break;
            }
            case 2 :{
                int c = a - b; 
                 System.out.println(c); 
                 break;
            }
             case 3 :{
                int c = a * b;  
                 System.out.println(c);
                 break;
            }

             case 4 :{
                int c = a / b; 
                 System.out.println(c); 
                 break;
            }
             case 5 :{
                int c = a % b;
                 System.out.println(c);  
                 break;
            }
            case 6:{
                loop = false;
                break;
            }
            default:{
                System.out.println("********Invalid Number*******");
            }
        }
    }

    }
}
