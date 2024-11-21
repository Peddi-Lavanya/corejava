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
     public String toString(){

            return rollno+" "+name+" "+age;
    }

}
public class ArrayList_userdefined {
    public static void main(String args[]){
        Student s1=new Student(21,"lavaa",21);
        Student s2=new Student(45,"bhanu",23);
        Student s3=new Student(25,"abhi",56);
        ArrayList<Student>list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       for(Student st:list){
        System.out.println(list);
       }

    }
}
