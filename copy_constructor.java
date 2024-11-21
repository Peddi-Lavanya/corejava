class Line{
    int len;
    Line(){

    }
    Line(int l){
      len=l;
    }
    Line(Line obj){
        len=obj.len;
    }
    void drawLine(){
        for(int i=1;i<=len;i++){
            System.out.println("____");
        }
        System.out.println();
    }
}

public class copy_constructor {
    public static void main(String[] args) {
       Line l1=new Line(10);
       l1.drawLine();
       Line l2=new Line(l1); 
       l2.drawLine();
    }
}
