import java.util.Scanner;
public class Ass4_problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a=1;
        int n=sc.nextInt();
        System.out.print(a+" ");
        for(int i=1;i<=n;i++){
            a=a*2;
            System.out.print(a+" ");
        }
    }
}
             