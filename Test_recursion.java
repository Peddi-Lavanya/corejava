class Sample{
    static int factorial(int n){
        if(n==1)
        return 1;
        return n * factorial(n-1);
    }
}
class Test_recursion {
   public static void main(String[] args) {
    Sample s1=new Sample();
    System.out.println(s1.factorial(5));
   } 
}
