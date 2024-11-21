import java.util.*;
class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
public int compareTo(Student st){
if(age==st.age){
return 0;
}
else if(age>st.age){
return -1;
}
else{
return 1;
}
}
}

class comparable_interface {
   public static void main(String args[]){
    Student s1=new Student(13,"Abby",23);
    Student s2=new Student(25,"Eshwar",19);
    Student s3=new Student(16,"Lavanya",21);
    ArrayList<Student> list=new ArrayList<>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    Collections.sort(list);
    for(Student s:list){
        System.out.println(s.rollno+"  "+s.name+"  "+s.age);  
    }
    }
}
