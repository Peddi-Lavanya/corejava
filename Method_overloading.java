class Calculator{
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        Calculator.add(10,20);
        Calculator.add(10,20,30);
    }
}
