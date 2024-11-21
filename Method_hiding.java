class A{
    static int x=100;
    int y=200;
    static void displayx(){
        System.out.println("parent class x="+x);
    }
    void displayy(){
        System.out.println("parent class y="+y);
    }
    static void print(){
        System.out.println(x);
    }
}
class B extends A{
    static int x=10;
    int y=20;
    static void displayx(){
        System.out.println("child class x="+x);
    }
    void displayy(){
        System.out.println("child class y="+y);
        super.displayy();
        System.out.println(super.y);
    }
}



public class Method_hiding {
    public static void main(String[] args) {
        B obj=new B();
        obj.displayx();
        obj.displayy();
        obj.print();
    }
}
