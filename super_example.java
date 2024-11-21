class A{
    int x;
    A(int x){
        this.x=x;
    }
    void display(){
        System.out.println(x);
    }
}
class B extends A{
    int y,x=200;
    B(int x,int y){
        super(x);
        this.y=y;
    }
    void display(){
        System.out.println(y);
        System.out.println(x);
        System.out.println(super.x);
        super.display();
    }
}

public class super_example{
    public static void main(String[] args) {
        B obj=new B(10,20);
        obj.display();
    }
}
