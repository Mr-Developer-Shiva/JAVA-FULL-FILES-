class Outer{
    int out ; 
    void outerDisplay(){
        System.out.println("Outer File");
    }
    Outer(int num){
    this.out = num;
    }
    static class Inner{
        int n = 0 ;
        void innerDisplay(){
            System.out.println("Inner File");
        }
    }
}
public class Outer_Inner {
    public static void main(String[] ars){
        Outer outer = new Outer(10);
        outer.outerDisplay();
       // Outer.Inner inner = outer.new Inner();
        Outer.Inner inner = new Outer.Inner();  //static class 
        inner.innerDisplay();
    }
}
