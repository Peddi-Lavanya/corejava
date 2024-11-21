package lavanya;
import java.util.*;
public class percentage {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("the total marks: ");
		float a=Sc.nextFloat();
		System.out.println("enter english marks :");
		float b=Sc.nextFloat();
		System.out.println("enter physics marks :");
		float c=Sc.nextFloat();
		System.out.println("enter chemistry marks :");
		float d=Sc.nextFloat();
		System.out.println("enter computer science marks :");
		float e=Sc.nextFloat();
		System.out.println("enter Stastistics marks :");
		float f=Sc.nextFloat();
		float sum=b+c+d+e+f;
		System.out.println(sum);
		float percentage=(sum/a)*100;
		System.out.println(percentage);
		

	}

}
