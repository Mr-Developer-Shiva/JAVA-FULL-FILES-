public class Arrays{
    public static void main(String[] args){
        String[] cars =  { "BMW","Volvo","Mazda","Ford"};
        int[] myNumber = { 10 , 3, 54 , 86};
        System.out.println(myNumber[0]);
        System.out.println(cars[0]);
        LoopArray();
    }
    static void LoopArray(){
        String[] cars = {"BMW","Volvo","Mazda","Ford"} ;
        for (int i = 0;i < cars.length;i++ ){ 
        System.out.println(cars[i]);
        }
    }
}