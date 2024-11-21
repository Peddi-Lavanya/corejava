class Student{
    String name;
    int id;
    String course;
    Student(){
        System.out.println("Welcome");
    }
    Student(String n,int i,String c){
        name=n;
        id=i;
        course=c;
    }
    Student(String n,int i){
       name=n;
       id=i;
    }
    void display(){
        System.out.println((name+","+id+",")+course);
    }
}
class constructors {
    public static void main(String[] args) {
        Student s1=new Student("Abby",1234,"java"+",");
        Student s2=new Student("Lavanya",1235,"java"+",");
        Student s3=new Student("Eshwar",1236,"java"+",");
        s1.display();
        s2.display();
        s3.display();
    }
}
