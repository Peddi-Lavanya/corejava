package lavaproject;
class Student{
	String name;
	int age;
	
	public void Info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	//non parameter constructor
	/*Student(){
		System.out.println("constructor called");
	
}*/
	//parameter
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class opps_ex1 {

	public static void main(String[] args) {
		//Student s1=new Student();
		Student s1=new Student("lavanya",21);//parameter
		//s1.name="Lavanya";
		//s1.age=21;
		//s1.Info();
		s1.Info();//parameter 
	}

}
