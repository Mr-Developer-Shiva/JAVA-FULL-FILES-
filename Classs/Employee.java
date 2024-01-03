public class Employee{

    public static void main(String[] args) {
      Company e1 = new Company("Shiva", 35000);
      e1.isPercentage(10);
      System.out.println(e1.getName());
      System.out.println(e1.getSalary());
     
    }
}
class Company{
    String name;
    double salary;
    
    Company(String n,int s){
        this.name = n;
        this.salary = s;
    }
    String getName(){
        return name;
    }
    void setName(String n){
         n = name ;
    }
    double getSalary(){
        return salary;
    }
    void setdouble(double s){
        s =  salary ;
    }
    void isPercentage(int percent){
       salary += salary*percent/100;
    }
}