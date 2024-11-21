package lavaproject;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<5;i++) {
			for(int j=1;j<6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
