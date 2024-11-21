class Student{
    int rollno;
    String name;
    void set_dim(int r,String n){
        r=rollno;
        n=name;
    }
}
class Method_example3 {
    public static void main(String args[]){
  Student s1=new Student();
  Student s2=new Student();
  s1.rollno=23;
  s1.name="Lava";
  System.out.println(s1.rollno+" "+s1.name);
  s2.rollno=34;
  s2.name="Abby";
  System.out.println(s2.rollno+" "+s2.name);
    }
}