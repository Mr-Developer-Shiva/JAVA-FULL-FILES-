class Department{
    int id ;
    String name ;
    Department(int i , String n){
        this.id = i;
        this.name = n;
    }
    void display()
    {
        System.out.println("ID id " + id);
        System.out.println("name is " + name);
    }
}
class Student implements Clonable{
    int id;
    String name ;
    Department dept ;
    Student(int i , String n , Department d){
        this.id = i ;
        this.name = n ;
        this.dept = d ;
    }
    void display(){
        System.out.println("ID is " + id);
        System.out.println("name is " + name);
        System.out.println("Department is " + dept);
    }
}
public class CloningDemo {

    public static void main(String[] args) {
        Department department = new Department(1,"Shiva");
        Student student = new Student(1,"Shiva",department);
        Student student2 = (Student)student.clone();
    }
}