package lavaproject;
import java.util.*;
public class condition {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("the number is equal");
		}
		else {
			if(a>b) {
				System.out.println("the number is greater");
			}
			else {
				System.out.println("the number is lesser");
			}
		}
	}

}
