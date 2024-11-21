class print extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
            Thread.sleep(1000);
            }catch(Exception e){}
            
    }
        
    }
}
public class Threads_ex1{
    public static void main(String args[]){
        print  p1=new print();
        print p2=new print();
        print p3=new print();
        p1.start();
        try{
             p1.join();
        }
        catch(InterruptedException e){

        }
        p2.start();
        p3.start();
    }
}