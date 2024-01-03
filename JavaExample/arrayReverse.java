import java.util.Scanner;
public class arrayReverse {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];

        for(int i = 0 ; i < num.length;i++){
            num[i] = n;
        }

        System.out.println(num[0]);
        System.out.println(num[2]);
        System.out.println(num[3]);
    }   
}
