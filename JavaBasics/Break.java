public class Break{
    public static void main(String[] args){
        for(int i = 0 ;i<=5;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        Break statement  = new Break();
        statement.continueMethod();
    }
    public void continueMethod(){
        System.out.println("Missing the number of : 4");
        for(int i=1;i<=5;i++){
            if(i==4){
                continue;
            }
            System.out.print( i + " ");
        }
    }
}