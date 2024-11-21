package lavanya;
import java.util.*;
public class condationprac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks in java language");
		int marks1=sc.nextInt();
		System.out.println("enter your marks in physical science");
		int marks2=sc.nextInt();
		System.out.println("enter your marks in chemistry");
		int marks3=sc.nextInt();
		int avg=(marks1+marks2+marks3)/3;
		System.out.println("your overall percentage is:"+avg);
		if(avg>=40 && marks1>=33&&marks2>=33&&marks3>=33) {
			System.out.println("congradulations,you are promoted");
		}else {
			System.out.println("sorry,you are not promoted");
		}
	}

}
