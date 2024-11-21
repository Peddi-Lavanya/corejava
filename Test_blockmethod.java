class Blocks{
    public static void main(String[] args) {
       System.out.println("instance blocks");  
    }
    static
    {
        System.out.println("Static block");
    }
   
}
class Test_blockmethod {
    public static void main(String[] args) {
       Blocks b1=new Blocks();
       Blocks b2=new Blocks();
       Blocks b3=new Blocks(); 
    }
}
