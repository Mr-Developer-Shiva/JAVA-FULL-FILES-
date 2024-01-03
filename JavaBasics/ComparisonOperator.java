public class ComparisonOperator{
    public static void main(String[] args){
        int x =10;
        int y = 9;
        //The return value of a comparison is either true or false
        System.out.println(x < y);  //false
        equalTo();
        notEqual();         
        lessThan();
        greaterThanEqual();
        lessThanEqual();
    }
    static void equalTo(){      //true
        int x = 10;
        int y =10;
        System.out.println(x == y);;
    }
    static void notEqual(){
        int x = 10;    //false
        int y =10;
        System.out.println(x != y);
    }
    static void lessThan(){
        int x = 10;         //true
        int y =9;
        System.out.println(x > y);;
    }
     static void greaterThanEqual(){
        int x = 10;
        int y =9;               //true
        System.out.println(x >= y);
    }
     static void lessThanEqual(){
        int x = 10;             //false
        int y =9;
        System.out.println(x <= y);
    }
}