class cycle{
    void display(){
        System.out.println("I call the Cycle class");
    }
}
// class Tricycle extends cycle{
//     void display(){
//         System.out.println("I call the Tricycle class");
//     }
// }
public class AnomousClass {
    public static void main(String[] args) {
        cycle c1 = new cycle(){
            void display(){
                System.out.println("I call The Tricycle class");
            }
        };
        c1.display();
        cycle c2 = new cycle();
        c2.display();
    }
}
