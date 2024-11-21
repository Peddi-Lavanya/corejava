package lavaproject;
import java.util.*;
public class age {

	public static void main(String[] args) {
		System.out.println("enter the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18){
			System.out.println("adult");
		}
		else{
			System.out.println("not an adult");
		}

	}

}
