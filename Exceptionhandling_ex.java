class sample{
    void function(){
        int a,b;
        a=100;
        b=0;
        System.out.println("Welcome");
        try{
            System.out.println("line 1 in try");
        System.out.println(a/b);
        System.out.println("try block ending");
        }
        catch(ArithmeticException e){
            System.out.println("a is divides by zero");
        }
        System.out.println("end of the method");
    }
}


public class Exceptionhandling_ex {
    public static void main(String args[]){
        sample s=new sample();
        s.function();
    }
}
