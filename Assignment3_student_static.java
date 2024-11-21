import java.util.Scanner;
public class Assignment3_student_static {
  Scanner sc=new Scanner(System.in);
  static int reg_no_series=1234;
  String Student_username;
  String password;
  void register(){
    int std_reg_no=reg_no_series;
    reg_no_series++;
    System.out.println("std_reg no:-"+reg_no_series);
    String Student_username="peddi Lavanya";
    System.out.println("username:-"+Student_username);
    long mobile=70756457;
    System.out.println("mobile number:-"+mobile);
    String email="peddilavanya42@gmail.com";
    System.out.println("emaid id is:-"+email);
    String password="Abby@23";
    System.out.println("password:-"+password);
  }
  void login(){
    if(Student_username==password){
     System.out.println("your login succesfully");
    }else{
      System.out.println("cannot login your account! your password is incorrect");
    }
  }
  void changePassword(){
    System.out.println("enter your old password:-");
    String old_password=sc.next();
    System.out.println("enter new_password:-");
    String new_password=sc.next();
    System.out.println("enter confirm password:-");
    String confirm_password=sc.next();
    if(new_password==confirm_password){
      System.out.println("your account password changed succesfully");
    }else{
      System.out.println("check your password its failure");
    }
  }
  void uploadMarks(){
     int s1=56;
     System.out.print(s1+",");
     int s2=65;
     System.out.print(s2+",");
     int s3=75;
     System.out.print(s3+",");;
     int s4=52;
     System.out.print(s4+",");
     int s5=78;
     System.out.print(s5+",");
     int s6=89;
     System.out.print(s6);
     findTotal(s1,s2,s3,s4,s5,s6);
     viewSemisterMarks(s1,s2,s3,s4,s5,s6);
    }
   void findTotal(int s1,int s2,int s3,int s4,int s5,int s6){
    int sem_total=s1+s2+s3+s4+s5+s6;
    System.out.println("total marks of a student="+sem_total);
    viewSemisterTotal(sem_total);
    }
    void viewSemisterMarks(int s1,int s2, int s3,int s4,int s5,int s6 ){
    System.out.println("viewSemisterMarks of a student=");
    System.out.print(s1+",");
    System.out.print(s2+",");
    System.out.print(s3+",");
    System.out.print(s4+",");
    System.out.print(s5+",");
    System.out.print(s6);
    }
  void viewSemisterTotal(int sem_total){
    System.out.println("viewSemistertotal of a student="+sem_total);
  }
}

class Test_Student{
public static void main(String[] args) {
    Assignment3_student_static s1=new Assignment3_student_static();
    s1. register();
    s1.login();
    s1.changePassword();
    s1.uploadMarks();
    Assignment3_student_static s2=new Assignment3_student_static();
    s1. register();
    s1.login();
    s1.changePassword();
    s1.uploadMarks();
}
}
