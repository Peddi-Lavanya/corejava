package corejava;
import java.util.Scanner;
public class ATMpin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int PIN=1234;
        if(PIN==1234) {
        	System.out.println("Enter new PIN");
             int a=sc.nextInt();
        	System.out.println("reenter new PIN");
        	 int b= sc.nextInt();
        	if(a==b) {
        		System.out.println(PIN=a);
        	}else {
        		System.out.println("PIN is not changed");
        	}
        }else {
        	System.out.println("the PIN is wrong");
        }
	}

}
