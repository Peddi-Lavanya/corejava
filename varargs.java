package lavanya;

public class varargs {
/*static int sum(int a,int b) {
	return a+b;
}
static int sum(int a,int b,int c) {
	return a+b+c;
}
static int sum(int a,int b,int c,int d) {
	return a+b+c+d;
}*/
	static int sum(int ...arr){
		int result=0;
		for(int a:arr) {
			result +=a;
		}
		return result; 
		
	}
	public static void main(String[] args) {
		System.out.println("welcome to var args");
       System.out.println("the value of 4 and 5is:"+sum(4,5));
       System.out.println("the value of 4,5and 8 is:"+sum(4,5,8));
       System.out.println("the value of 7,8,34 and 2 is:"+sum(7,8,34,2));
	}

}
