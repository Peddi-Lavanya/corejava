package lavaproject;
import java.util.*;
public class pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4;
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
