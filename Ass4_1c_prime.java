import java.util.Scanner;
public class Ass4_1c_prime {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your number");
      int n=sc.nextInt();
      int count=0;
      for(int i=2;i<n;i++){
       if(n%i==0){
        count++;
       }
       if(count==0){
        System.out.println("The number is prime number");
       }else{
        System.out.println("The number is not a prime number");
       }
      }
    }
}
