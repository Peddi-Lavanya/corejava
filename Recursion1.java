package lavaproject;


public class Recursion1 {

    /*public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+"from"+src+"to"+dest); 
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+"from"+src+"to"+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
            int n=2;
            towerOfHanoi(n,"S","H","D");
    }*/


    /*public static void printRev(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx-1);
    } 
    public static void main(String args[]){
        String str="abcd";
        printRev(str,str.length()-1);
    }*/

      /*public static int first=-1;
      public static int last=-1;
    public static void findOccurance(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    public static void main(String args[]){
        String str="abaacdaefaah";
        findOccurance(str,0,'a');
    }*/

    
}