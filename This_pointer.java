class Student{
    String name;
    String course;
    int id;
    Student(String name,String course,int id){
    this.name=name;
    this.course=course;
    this.id=id;
    }
    void display(){
        System.out.println(name+course+id);
    }
}
public class This_pointer {
    public static void main(String[] args) {
        Student s1=new Student("Lavanya","java",1234);
        s1.display();
    }
}
