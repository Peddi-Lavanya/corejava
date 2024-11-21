package Practice_problems;

public class Fibonacciexample2 {
    static int a=0,b=1,c=0;
    static void display(){
        if(c>0){
            c=a+b;
            System.out.println(c);
            b=c;
            a=b-a;
            
        }
    }
}
class test{
    public static void main(String args[]){
        display(a);
        display(b);
    }
}

