class Shape{
    int d1;
    int s;
    void setdim(int d1){
        this.d1=d1;
        this.s=10;
    }
    void display(){
        System.out.println("Shape drawn");
    }
}
class Square extends Shape{
    void findArea(){
        System.out.println("Area of square="+s*s);
    }
    void display(){
        System.out.println("square with dimention="+d1);
    }
}
class Rectangle extends Shape{
    int d2;
    Rectangle(int d1,int d2){
        super(d);
        this.d2=d2;
    }
    void findArea(){
        System.out.println("Area of Rectangle="+ d1*d2);
    }
    void display(){
        super.display();
        System.out.println("Square with div="+d1);
    }
}
public class Super_keyword_inheritance {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,15);
        r1.display();
        r1.findArea();
    }
}
