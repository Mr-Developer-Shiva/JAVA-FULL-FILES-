public class AssignmentOperator{
    public static void main(String[] args){
        int x = 5 ;
        x += 5;                 //10
       System.out.println(x);
       minus();
       multiplication();
       division();
       modulus();
      
    }

    static void  minus(){
        int x = 110 ;
        x -= 90;                //20
       System.out.println(x);
    }
    static void multiplication(){
        int x = 10 ;
       x *= 5;                          //50
       System.out.println(x);
    }
    static void division(){
        int x = 10 ;
        x /= 5;                     //2
       System.out.println(x);
    }
    static void modulus(){
         int x = 10 ;                   //3
        x %= 7;
       System.out.println(x);
    }
    
}