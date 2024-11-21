package lavaproject;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int sum=a+b;
	    System.out.println(sum);
	    int diff=a-b;
	    System.out.println(diff);
	    int mul=a*b;
	    System.out.println(mul);
	    int div=a/b;
	    System.out.println(div);
	    int mod=a%b;
	    System.out.println(mod);
	}

}
