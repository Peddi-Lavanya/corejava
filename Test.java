class Test1{
    static int a=0,b=1,c;
    static void fibonacci(int counter){
        while(counter>=1){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            counter--;
        }
    }
}
class Test {
    public static void main(String[] args) {
        Test1.fibonacci(10);
    }
}
