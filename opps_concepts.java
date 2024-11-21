package lavaproject;
class Students{
	String name;
	int age;
	//polymorphism or overloading
	public void Info(String name){
		System.out.println(name);
	}
	public void Info(int age) {
		System.out.println(age);
	}
	public void Info(String name,int age) {
		System.out.println(name+" "+age);
	}
}
public class opps_concepts {

	public static void main(String[] args) {
		Students s1=new Students();
		s1.name="Lavanya";
		s1.age=21;
		
		s1.Info(s1.name);
		s1.Info(s1.age);
		s1.Info(s1.name,s1.age);

	}

}
