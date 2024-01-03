public class JavaRecursion{
    public static void main(String[] args){
        int result = sum(9);
        System.out.println(result);
    }
    public static int sum(int x ){
        if (x > 0)
        {
            return x + sum(x - 1);
        }
        else
        {
            return 0;
        }
    }
}