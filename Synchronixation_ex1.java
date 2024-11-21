class Institute{
    synchronized void classRoom(String facuilty_name){
        for(int i=1;i<=5;i++){
            System.out.println(i+"class taking by"+facuilty_name);
        }
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class MyThread extends Thread{
    Institute i;
    String facuilty_name;
    MyThread(Institute i,String facuilty_name){
        this.i=i;
        this.facuilty_name=facuilty_name;
    }
    public void run(){
        i.classRoom("lavanya");//or i.classRoom(facuilty_name)
    }
}
class MyThread1 extends Thread{
    Institute i;
    String facuilty_name;
    MyThread1(Institute i,String facuilty_name){
        this.i=i;
        this.facuilty_name=facuilty_name;
    }
    public void run(){
        i.classRoom("Abby");//or i.classRoom(facuilty_name)
    }
}
public class Synchronixation_ex1 {
    public static void main(String args[]){
        Institute obj=new Institute();
        MyThread f1=new MyThread(obj,"lavanya");
        MyThread1 f2=new MyThread1(obj,"Abby");
        f1.start();
        f2.start();

    }
}
