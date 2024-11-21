class Student{
    int rollno;
    String name;
void insertRecord(int r,String name){
    rollno=r;
     name=n; 
}
void displayInformation(){
    System.out.println(rollno+" "+name);
}
}

class Test_method {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(123,"Lava");
        s2.insertRecord(456,"Abby");
        s1.displayInformation();
        s2.displayInformation();
}
}
