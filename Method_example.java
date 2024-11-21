class Square{
    private int side;
    private String color;
    void set_dim(int s,String c){
        side =s;
        color=c;
    }
    void findArea(){
System.out.println("Area="+side*side);
    }
    
}
public class Method_example {
    public static void main(String[] args) {
        Square s1=new Square();
        s1.set_dim(4,"Red");
        s1.findArea();
    }
}
