public class TaxiHold extends Thread{
    taxi t ;
    TaxiHold(taxi t){
        this.t = t;
    }
    public void run(){
        t.isFree = false;
        try{
            System.out.println("Taxi is" + t.id + " is Assigned");
            Thread.sleep(60000);     //10 sec but calculation  = Math.abs(pp-dp) * 60 * 60 *1000
            t.isFree = true ;
        }catch(Exception e ){
            System.out.println(e);
        }
    }
}
