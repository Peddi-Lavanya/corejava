package lavanya;
import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		switch(age){
		case 18:
			System.out.println("you are an adult");
			break;
		case 23:
			System.out.println("you will get a job");
			break;
		case 60:
			System.out.println("you eill get retired");
			break;
		default:
			System.out.println("enjoy your life");
		}
		System.out.println("thanks for using the code language");

	}

}
