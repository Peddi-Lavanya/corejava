import java.util.*;
class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
class AgeComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
     if(s1.age==s2.age){
        return 0;
     }else if(s1.age>s2.age){
        return 1;
     }else{
        return -1;
     }
    }
}
class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
public class Comparator_interface {
    public static void main(String args[]){
Student s1=new Student(16,"Abby",23);
Student s2=new Student(35,"Eshwar",19);
Student s3=new Student(45,"Lava",21);
ArrayList<Student>al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        for(Student s:al){
            System.out.println(s.rollno+"  "+s.name+"  "+s.age);
        }
        System.out.println("Sorting by age");
        AgeComparator ag=new AgeComparator();
        Collections.sort(al,ag);
        for(Student s:al){
            System.out.println(s.rollno+"  "+s.name+"  "+s.age);
        }
        System.out.println("Sorting by name");
        Collections.sort(al,new NameComparator());
        for(Student s:al){
            System.out.println(s.rollno+"  "+s.name+"  "+s.age);
        }

    }
}
