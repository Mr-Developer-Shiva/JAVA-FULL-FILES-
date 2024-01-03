

public class Bus{
    private int busNo;
    private boolean ac;
    private int capacity; //get and set methods

    Bus(int busNo,boolean ac , int cap){
        this.busNo = busNo;
        this.ac = ac;
        this.capacity =cap;
    }
    public int getBusNo(){
        return busNo;
    }
    public boolean isAc(){
        return ac;
    }
    public int getCapacity(){ //accesser method
        return capacity;
    }
    public void setCapacity(int cap){ //mutetor method
        capacity = cap;
    }
    public void setAc(boolean val){ //mutetor method
        ac = val;
    }

    public void displayBusInfo(){
        System.out.println("Bus no: "+ busNo + " AC: " + ac + " Total Capacity: " + capacity);  
    }
}