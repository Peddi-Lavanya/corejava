class print{
    void display(){
        for(int i=1;i<=5;i++){
         System.out.println(i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
 
        }
         
    }
}

public class threads {
    public static void main(String args[]){
        print p1=new print();
        p1.display();
    }
}
