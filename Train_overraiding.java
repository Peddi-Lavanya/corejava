class Train{
    int train_no;
    String train_name;
    String source;
    String destination;
    int distance;
    Train(int train_no,String train_name,String source,String destination,int distance){
        this.train_no=train_no;
        this.train_name=train_name;
        this.source=source;
        this.destination=destination;
        this.distance=distance;
    }
    public String toString(){
     return"Train{"+"train_number="+train_no+",train_name="+train_name+",train source="+source+",train destinatation="+destination+",train distance="+distance+"}";
    }
}
class IRCTC{
    static Train t1=new Train(15236,"vijayawadaexpress","secundrabad","vijayawada",1564);
    static Train t2=new Train(45612,"shabariexpress","secundrabad","vijag",1054);
       static void search(int train_no){
        if(t1.train_no==train_no){
            System.out.println(t1);
        }else if(t2.train_no==train_no){
            System.out.println(t2);
        }else{
            System.out.println("your number not found!please check your number");
        }
    }
        static void search(String train_name){
        if(t1.train_name.equals(train_name)){
            System.out.println(t1);
        }
        else if(t2.train_name.equals(train_name)){
            System.out.println(t2);
        }else{
            System.out.println("your name not found!please check your name");
        }
    }
}

public class Train_overraiding {
    public static void main(String[] args) {
        IRCTC.search(15236);
        IRCTC.search("shabariexpress");
    }
}
