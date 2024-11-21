class Test{
    static int n1=0,n2=1,n3;
    static void fibonacci(int counter){
        if(counter>=1){
    System.out.println(n1);
     n3=n1+n2;
     n1=n2;
     n2=n3;
     fibonacci(counter-1);
        }        
    }

}
class Test_fibonnaci_recursion {
    public static void main(String[] args) {
        Test.fibonacci(10);
    }
}
