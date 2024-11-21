public class Static_variable {
    static int add(int a,int b){
        int res=a+b;
         return res; 
          
    }
    static int diff(int a,int b){
        int res=a-b;
        return res;
    }
    public static void main(String args[]){
        System.out.println(add(5,5));
        System.out.println(diff(10,2));
    } 
}
