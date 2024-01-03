public class ArithMeticOperator{
    public static void main(String[] args){
        int x = 5 ;
        int y = 5 ;
        int z = x + y ;
       System.out.println(z);
       minus();
       multiplication();
       division();
       modulus();
       increament();
       decreament();
    }

    static void  minus(){
        int x = 10 ;
        int y = 3 ;
        int z = x - y ;
       System.out.println(z);
    }
    static void multiplication(){
        int x = 10 ;
        int y = 3 ;
        int z = x * y ;
       System.out.println(z);
    }
    static void division(){
        int x = 10 ;
        int y = 2 ;
        int z = x / y ;
       System.out.println(z);
    }
    static void modulus(){
         int x = 10 ;
        int y = 3 ;
        int z = x % y ;
       System.out.println(z);
    }
    static void increament(){
        int x = 10;
        x++;
        System.out.println(x);
    }
    static void decreament(){
        int x = 10;
        x--;
        System.out.println(x);
    }
}