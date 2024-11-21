class Institute{
    synchronized void classroom(String facuilty_name){
        for(int i=1;i<=5;i++){
            System.out.println(i+"class taking by"+facuilty_name);
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }

}
class Facuilty extends Thread{
    String facuilty_name;
    Institute i;
    Facuilty(Institute i,String facuilty_name){
        this.facuilty_name=facuilty_name;
        this.i=i;
    }
    public void run(){
      i.classroom(facuilty_name);
    }
}


public class Synchronized_ex {
    public static void main(String args[]){
        Institute i=new Institute();
        Facuilty f1=new Facuilty(i,"lavanya");
        Facuilty f2=new Facuilty(i,"Abby");
        f1.start();
        f2.start();

    }
}
