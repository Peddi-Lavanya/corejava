class Student{
    String name;
    String course;
    int id;
    int m1;
    int m2;
    int m3;
    Student(String name,String course,int id,int m1,int m2,int m3){
        this.name=name;
        this.course=course;
        this.id=id;
    }
    Student(){
        this.name=name;
        this.course=course=course;
        this.id=id;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void display(){
         System.out.println(name+calculate());
    }
    float calculate(){
      return(m1+m2+m3)/3.0f;
    }
}



public class This_pointer_ex3 {
    public static void main(String[] args) {
        Student s1=new Student("lavanya","java",1234,40,50,60);
        s1.display();
    }
}
