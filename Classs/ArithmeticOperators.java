public class ArithmeticOperators{
    public static void main(String[] args){
        int a = 10 , b = 4 ,c1,c2,c3,c4,c5;
        c1 = a + b;
        c2 = a - b;
        c3 = a * b;
        c4 = a / b;
        c5 = a % b;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        compoundAssignment();
        incrementOperator();
        ExampleIncrement();
    }
    static void compoundAssignment(){
        int a  = 14 , b ,c ;
        a = a + 6;
        System.out.println(a);
        a += 80;
        System.out.println(a);
        a -= 90;
        System.out.println(a);
    }
    static void incrementOperator(){
        int a = 10 , b =90;
        
        System.out.println(a);
        System.out.println(b);

        a++;
        System.out.println(a);
        b++;
        System.out.println(b);
        
         System.out.println(a++);
         
         System.out.println(b++);
         System.out.println(a);
         System.out.println(b);

         int x = 1, y = 9 ,z =7;
         int c = x++ + ++x + z + y++ - ++z ;
         System.out.println(c);
    }
    static void ExampleIncrement(){
        int a = 4, b = 7, c = 5;
        int d = ++a + c++ + b++ + 2 + ++b + 7 + ++c + a;
        System.out.println(d);
        int x = 34 , y =78 , z  = 33;
        double v = x++  + ++z - ++x + 33 + z++ + ++x - x + ++y;
        System.out.println(v);
    }
}
