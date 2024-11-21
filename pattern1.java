package lavanya;
import java.util.*;
public class pattern1 {
	public static void main(String[] args) {
		System.out.println("enter the value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}

