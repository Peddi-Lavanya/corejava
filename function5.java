package lavaproject;
import java.util.*;
public class function5 {
public static void PrintSum(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
PrintSum(n);
	}

}