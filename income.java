package lavanya;
import java.util.*;
public class income {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your income in lakhs per annum");
		int tax=0;
		int income=sc.nextInt();
		if(income<=2.5) {
			tax=tax+0;
		}
		else if(income>2.5&&income<=5) {
			tax=tax +0.05f *(5.0f-2.5f);
		}

	}

}
