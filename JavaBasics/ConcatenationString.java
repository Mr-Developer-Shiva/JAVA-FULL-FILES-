public class ConcatenationString{
    public static void main(String[] args){
        String fName = "Shiva";
        String lName = "Kumar";
        System.out.println(fName + " " + lName);
        ConcatenationString myObj = new ConcatenationString();
        myObj.concatenate();
    }

    public void concatenate(){
        String firstName = "Time ";
        String LastName = "On";
        System.out.println(firstName.concat(LastName));
    }
}