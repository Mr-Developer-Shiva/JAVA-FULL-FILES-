public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3,4,6,8,13,34,55,78,88,99};
        
        System.out.println(Binary(arr));
    }
    public static int Binary(int[] arr){
        int high = arr.length - 1, low = 0,mid ;
        int key = 13;
     

        while( low <= high){

            mid = (high + low)/2;

           if(key == arr[mid]){
                 return mid;
           }
           else if(key <= arr[low]){
                 high = mid + 1;
                // high = high;
                return high;
           }
           else{
            low = mid - 1;
           // low = low;
           return low;
           }
        }
        return -1;
    }
}
