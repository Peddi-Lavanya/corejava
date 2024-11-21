package lavaproject;
import java.util.*;
public class bitmask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int oper= sc.nextInt();
		
			
		int n=5;//0101->0111->dec 7
		int pos=1;
		int bitMask= 1<<pos;
		if(oper==1) {
			//set
			int newNumber =bitMask | n;
			System.out.println(newNumber);
		}else {
			int newBitmask=~(bitMask);
			int newNumber=newBitmask & n;
			System.out.println(newNumber);
		}

	}

}
