class Line{
    int len;
    Line(int l){
        len=l;
    }
    void drawLine(){
        for(int i=0;i<=len;i++){
            System.out.print("_____");
        }
       System.out.println();
    }
}


public class construnctor_exa2 {
    public static void main(String[] args) {
        Line l1=new Line(10);
        l1.drawLine();
        Line l2=new Line(40);
        l2.drawLine();
    }
}
