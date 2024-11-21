import java.util.Scanner;
import java.util.Random;
public class customerid_password {
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    Random rd=new Random();
    int n1,n2, n3,max;
       System.out.println("Enter the customer Id:-");
       long cust_id=Sc.nextInt();
       System.out.println("Enter your password:-");
       String password=Sc.next();
      n1=rd.nextInt(1000);
      n2=rd.nextInt(1000);
      n3=rd.nextInt(1000);
      System.out.println("Verification");
      System.out.println("identify max of three numbers:-"+n1 +" "+n2+" "+n3);
      System.out.println("Enter max value:-");
      max=Sc.nextInt();
      int max_number=((n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3);
       if(cust_id==1234567  && password.equals("#3betrayed")){
        System.out.println("your account logged in successfully");
       }else{
        System.out.println("your account login failed");
       }

    }
}
