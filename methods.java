package lavanya;

public class methods {
	static int logic(int x,int y) {
		int z;
		if(x>y) {
			z=x+y;
		}else {
			z=(x+y)*5;
		}
		return z;
	}

	public static void main(String[] args) {
		int a=6;
		int b=7;
		int c;
		c=logic(a,b);
		System.out.println(c);
		int a1=2;
		int b1=1;
		int c1;
		c1=logic(a1,b1);
		System.out.println(c1);

	}

}
//same method of calling in different way
/*package lavanya;

public class javamethods {
	 int logic(int x,int y) {//removes static
		int z;
		if(x>y) {
			z=x+y;
		}else {
			z=(x+y)*5;
		}
		return z;
	}

	public static void main(String[] args) {
		int a=8;
		int b=7;
		int c;
		javamethods obj=new javamethods();//class name with object created
		c=obj.logic(a,b);//obj
		System.out.println(c);
		int a1=2;
		int b1=1;
		int c1;
		c1=obj.logic(a1,b1);//obj
		System.out.println(c1);

	}

}*/
