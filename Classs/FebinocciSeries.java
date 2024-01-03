import java.util.*;
public class FebinocciSeries{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first = 0 ;
        int second = 1 ;
        while(n > 0){
            
            System.out.print(first);
                int third = first + second;
                first = second ;
                second = third ;  
        }
    }
}