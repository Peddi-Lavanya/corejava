package lavaproject;

public class Recursion {
    //printing numbers using recursion from 5 to 1
    /*public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    public static void main(String args[]){
        int n=5;
        printNumbers(n);
    }*/

    ////printing numbers using recursion from 1 to 5
   /*public static void printNum(int n){
 if(n==6){
    return;
 }
   System.out.println(n);
   printNum(n+1);
   }
    public static void main(String args[]){
  int n=1;
  printNum(n);
    }*/

//printing numbers using recursion from 1 to 5 and sum these values:=
    /*public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void main(String args[]){
        printSum(1,5,0);
    }*/
  //printing numbers using recursion for factorial of 5:-
    /*public static int calcFactorial(int n){
        if(n==1 ||n==0){
            return 1;
        }
         int fac_nm1=calcFactorial(n-1);
         int fac_n=n*fac_nm1;
         return fac_n;
    }
    public static void main(String args[]){
  int n=5;
  int ans=calcFactorial(n);
  System.out.println(ans);
    }
}*/

//fibonacci series:-
/*public static void printFibonacci(int a,int b,int n){
    if(n==0){
        return;
    }
    int c=a+b;
    System.out.println(c);
    printFibonacci(b,c,n-1);
}
public static void main(String args[]){
   int a=0;
   int b=1;
    System.out.println(a);
    System.out.println(b);
    int n=7;
    printFibonacci(a,b,n-2);
} */

/*x^n stack height is n:-

public static int calcPower(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
int xPownm1=calcPower(x,n-1);
int xPown=x*xPownm1;
return xPown;
  
}
 public static void main(String args[]){
  int x=2, n=5;
  int ans=calcPower(x,n);
  System.out.println(ans);
   }*/

   //x^n staqck height is log n:-

   public static int calcPower(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    //if the case is in even we use:-
    if(n%2==0){
        return calcPower(x,n/2)*calcPower(x,n/2);
    }
    //if the case is in odd:-
    else{
        return calcPower(x,n/2)*calcPower(x,n/2)*x;
    }

   }
   public static void main(String args[]){
    int x=2,n=5;
    int ans=calcPower(x,n);
    System.out.println(ans);

   }
}
