public class NonStatic_variables_calc {
    int calc=0;
    int add(int a,int b){
        int res=a+b;
        return res;
    }
    int diff(int a,int b){
        int res=a-b;
        return res;
        
    }
    public static void main(String args[]){
        NonStatic_variables_calc c1=new NonStatic_variables_calc();
        System.out.println(c1.add(100,20));
        System.out.println(c1.diff(100,20));
        
    }
}
