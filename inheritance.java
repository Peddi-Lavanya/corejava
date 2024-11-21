class Shape{
    int d1;
    int s;
    void setdim(int d1){
        this.d1=d1;
        this.s=5;
    }
    void display(){
        System.out.println("draw shape");
    }
}
class Square extends Shape{
void findArea(){
    System.out.println("Area of square="+s*s);
}
}

public class inheritance {
    public static void main(String args[]){
        Square s=new Square();
        s.setdim(10);
        s.display();
        s.findArea();
    }
}
