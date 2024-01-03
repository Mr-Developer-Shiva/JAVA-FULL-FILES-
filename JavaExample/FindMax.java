import java.util.*;
public class FindMax{
    public static void main(String[] args) {
        int[] arr = {10,4,35,78,33,98,100,678,45,34};
        // int max = Integer.MIN_VALUE ;
        // for(int i = 0 ; i <= arr.length - 1;i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);
        //maxvalue(arr);
    }
    public static void maxvalue(int[] arr){
        int i = 0;
        int max = arr[0];
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        } 
        System.out.println(max);
    }
}