import java.util.Scanner;
public class Ass4_problem3 {
    public static void main(String args[]){
        int a=65000;
        Scanner sc=new Scanner(System.in);
        System.out.println("total bank balanceis:-"+a);
        System.out.println("Enter the amount you wanted to debit");
        int b=sc.nextInt();
        for(int i=100;i<=2000;i++){
            if(i/2==100||i/2==200){
                System.out.println("multiple of i is"+i);
            }if(i>20000){
                System.out.println("your daily limit exceded");
            }if(i>a){
                System.out.println("Insufficient funds!please check");
            }else{
                System.out.println("collect your cash"+a);
                }
            }
        }
    }

