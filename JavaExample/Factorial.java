import java.util.*;
public class Factorial{
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number Find the Factorial value : ");
        int n = 5;
        int result = 1 ;
        for(int i = 2 ;i <= n ; i++){
          result *= i;
        }
        System.out.println(result);
    }
}