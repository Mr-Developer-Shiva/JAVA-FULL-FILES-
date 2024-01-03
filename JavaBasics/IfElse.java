public class IfElse{
    public static void main(String[] args){
        //Java is conditions and If statements
        int x = 21;
        int y = 18;
        if(x > y){
            System.out.println(" X is greater than Y");
        }
        IfElse object = new IfElse();
        object.time();
        object.day(); 
    }
    public void time(){
        int time = 12 ;
        if(time < 10){
            System.out.println("Good day");
        }
        else{
            System.out.println("Good evening");
        }
    }

    public void day(){
        int day = 22;
        if (day <   10){
            System.out.println("Good Morning");
        } 
        else if(day < 18){
            System.out.println("Good Day");
        }
        else{
            System.out.println("Good Afternoon");
        }
    }
}