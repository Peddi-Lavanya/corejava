package lavaproject;
class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("writing something on a paper");
	}
	public void color(){
		System.out.println(this.color);
	}
	public void type() {
		System.out.println(this.type);
	}
}
public class oops {

	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.color="black";
		pen1.type="jel type";
		
		
		Pen pen2=new Pen();
		pen2.color="yellow";
		pen2.type="ballpen";
		
		
		pen1.write();
		pen1.color();
		pen1.type();
		pen2.color();
		pen2.type();

	}

}
