public class Fibonacciexample1 {
    public static void main(String args[]){
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        for(c=2;c<10;c++){
            c=a+b;
            System.out.println(c);
            b=c;
            a=b-a;
        }
    }
}
