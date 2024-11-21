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


public class Method_overriding {
    public static void main(String args[]){
      Square s=new Square();
        s.setdim(10);
        s.display();
        s.findArea();
    }
}
