package lavaproject;
import java.util.*;
public class switc {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
		switch(button){
			case 1 : System.out.println("hello");
			break;
			case 2 : System.out.println("lava");
			break;
			case 3 : System.out.println("ammu");
			break;
			case 4 : System.out.println("hi");
			break;
			case 5 : System.out.println("invallid");
		}
	}

}
