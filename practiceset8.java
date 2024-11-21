package lavanya;
class Employee{
	
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	
	
}
public class practiceset8 {
	public static void main(String[] args) {
	 Employee lava=new Employee();
     lava.setName("Code with lava");
     lava.salary=233;
     System.out.println(lava.getSalary());
     System.out.println(lava.getName());
	}

}
