package lavaproject;
import java.util.*;
public class function1 {
public static int calculateProduct(int a, int b) {
return a*b;
}
	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(calculateProduct(a,b));
	}

}

