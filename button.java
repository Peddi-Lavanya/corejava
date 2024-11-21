package lavaproject;
import java.util.*;
public class button {

	public static void main(String[] args) {
		System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
    if(button==1) {
    	System.out.println("hello");
    }
    else {
    	if(button==2) {
    		System.out.println("lava");
    	}
    	if(button==3) {
    		System.out.println("ammu");
    	}
    	if(button==4) {
    		System.out.println("hi");
    	}
    	else {
    		System.out.println("invallid");
    	}
    }
	}

}
