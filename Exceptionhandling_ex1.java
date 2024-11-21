class Sample1{
    void fun(){
        int arr[]={12,25,56,7};
        int a=100;
        int b=0;
        String str=null;
        String str1="abcde";
    System.out.println("Welcome");
    try{
        System.out.println("the 1st line of try");
        System.out.println(a/b);
        System.out.println("End of the try");
    }catch(ArithmeticException e){
        System.out.println("a is divided by zero");
        System.out.println(e);
    }
    try{
        System.out.println("1st line in try");
        System.out.println(arr[4]);
        System.out.println("End of the try");
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("length of array is out of range");
        System.out.println(e);
    }
     try{
        System.out.println(str.length());
    }
    catch(Exception e){
        System.out.println(e);
    }
    try{
        System.out.println(Integer.parseInt(str1));
    }
    catch(NumberFormatException e){
        System.out.println("converts string to int or int to string");
    }
    System.out.println("out of the method");
    }
}

//other method of this exactly code in one time:-

/*class Sample1{
    void fun(){
        int a=100;
        int b=0;
        int arr[]={12,23,56,7};
        String str=null;
        System.out.println("Welcome");
        try{
            System.out.println("the first line in try");
            System.out.println(a/b);
            System.out.println(arr[4]);
            System.out.println(str.length());
            System.out.println("End of the try");
        }
        catch(ArithmeticException e){
            System.out.println("the a value is divided by zero");
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("length of the array is out of range");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}*/


class Exceptionhandling_ex1 {
    public static void main(String args[]){
        Sample1 s=new Sample1();
        s.fun();
    }
}
