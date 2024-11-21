import java.lang.Math.*;
import java.util.Scanner;
public class Ass2_problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X1:-");
        int X1=sc.nextInt();
        System.out.println("Enter the value of X2:-");
        int X2=sc.nextInt();
         System.out.println("Enter the value of Y1:-");
        int Y1=sc.nextInt();
        System.out.println("Enter the value of Y2:-");
        int Y2=sc.nextInt();
        double distance=Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
        System.out.println("the distance between two points is:-"+distance);
    }
}
