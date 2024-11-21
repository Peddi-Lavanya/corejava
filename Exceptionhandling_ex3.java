class Sample2{
    void function1(){
        int a=100;
        int b=0;
        System.out.println("Welcome");
        try{
            System.out.println("first line of the try block");
            System.out.println(a/b);
            System.out.println("end of the try block");
        }
        catch(ArithmeticException e){
            System.out.println("a is divides by zero");
            System.out.println(e);
        }
        finally{
            System.out.println("this is finally block");
            System.out.println("all connections are closed");
        }
        System.out.println("the method is closed");

    }
}

public class Exceptionhandling_ex3 {
    public static void main(String args[]){
        Sample2 s=new Sample2();
        s.function1();
    }
}
