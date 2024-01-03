import java.util.*;
public class Array1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[10][10]; 
        for(int i = 1 ; i<=10; i++){
            for(int j=1;j<=10;j++){
                arr[i][j] = sc.nextInt();
            }
            int sum = 0;
            int j = 0;
            for( i=1;i<=10;i++)
            sum = sum + arr[i][j];
            System.out.println(sum);

        }  
    }
}