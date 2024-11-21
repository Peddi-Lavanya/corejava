package lavanya;
import java.util.*;
public class website {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String website=sc.next();
		if(website.endsWith(".org")) {
			System.out.println("this is an organizational website");
		}else if(website.endsWith(".com")) {
			System.out.println("this is an commertial website");
		}else if(website.endsWith(".in")) {
			System.out.println("this is an indian website");
		}
		

	}

}
