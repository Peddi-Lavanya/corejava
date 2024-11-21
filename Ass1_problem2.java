import java.util.Scanner;
public class Ass1_problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your total bill=");
        int bill=sc.nextInt();
        System.out.println("Enter your percentage:-");
        int percentage=sc.nextInt();
        float discount=(percentage*bill)/100;
        System.out.println("the discount value is:"+discount);
    }
}
