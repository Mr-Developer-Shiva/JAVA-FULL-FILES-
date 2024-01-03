public class ForLoop{
    public static void main(String[] args){
        for ( int i = 0 ;i <= 3; i++){
            System.out.println(i);
        }
        nestedLoop();
    }
    static void nestedLoop(){
        for ( int i = 1 ; i<=3 ; i++){
            for(int j =1 ; j<=3;j++)
            {
                System.out.print(i + " ");   
            }
            
        }
    }
}