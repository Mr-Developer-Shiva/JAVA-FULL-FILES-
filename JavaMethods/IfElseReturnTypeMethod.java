public class IfElseReturnTypeMethod{
    static void voltingAge(int age){
        if(age > 18){
            System.out.println("You are Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public static void main(String[] args)
    {
        voltingAge(21);
    }
}