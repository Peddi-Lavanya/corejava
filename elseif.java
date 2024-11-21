package lavanya;
import java.util.*;
public class elseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>56) {
			System.out.println("you are experienced");
		}else if(age>46) {
			System.out.println("you are semi experienced");
		}else if(age>36) {
			System.out.println("you are semi-semi-experienced");
		}else {
			System.out.println("you are not experienced");
		}

	}

}
