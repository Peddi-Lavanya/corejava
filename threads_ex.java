class print extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
    }




    public static void main(String args[]){
        print p1=new print();
        print p2=new print();
        p1.start();
        p2.start();
    }
}

