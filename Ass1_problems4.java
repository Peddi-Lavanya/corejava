import java.util.Scanner;
public class Ass1_problems4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String name= sc.nextString();
       System.out.println("Enter your name"+name);
       long Mobile= sc.nextLong();
       System.out.println("Enter your number"+Mobile);
       String Email= sc.nextString();
       System.out.println("Enter your Email"+Email);
       System.out.println("hello! this is"+ name +"i am great you have asked my personal information yesturday right!i am really sorry i was a bit busy.now you can access my number here you go" +Mobile +"and my Mail Id is" +Email);
      
    }
}
