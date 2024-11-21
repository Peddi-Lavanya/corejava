public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        while(c<100){
            c=a+b;
            System.out.println(c);
            b=c;
            a=b-a;
        }
    }
}
