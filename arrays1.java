package lavaproject;
import java.util.*;
public class arrays1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int size= Sc.nextInt();
		int numbers[]= new int[size];
		//input
		for(int i=0;i<size;i++) {
			numbers[i] = Sc.nextInt();
		}
		int x=Sc.nextInt();
		
		//output
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==x) {
				System.out.println("x found at index"+i);
			}
		}
	}

}
