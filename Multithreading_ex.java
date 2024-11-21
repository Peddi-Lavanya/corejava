class print{
    void display(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

}
class Threadex extends Thread{
    print p1=new print();
    public void run(){
        p1.display();
    }
}
class Multithreading_ex {
    public static void main(String args[]){
        Threadex t1=new Threadex();
        t1.start();
        Threadex t2=new Threadex();
        t2.start();
        System.out.println("main");
    }
}
