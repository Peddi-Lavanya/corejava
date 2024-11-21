import java.util.Scanner;
public class Ass3_problem1 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Telangana electricity slab or traiff rates");
      int i,j,k;
        for(i=0;i<=100;i++){
            int a=sc.nextInt();
            if(i>=0 &&i<=50){
                System.out.println("the amount is="+1.45+"rupees");
                System.out.println("The customer charges for this units is="+25+"rupees");
            }
        }if(i>=51 &&i<=100){
            System.out.println("the amount is="+2.60+"rupees");
                System.out.println("The customer charges for this units is="+30+"rupees");
        }
        for(j=100;j<=200;j++){
            if(j>=0 && j<=100){
                System.out.println("the amount is="+3.30+"rupees");
                System.out.println("The customer charges for this units is="+50+"rupees");
            }
        }if(j>=101 && j<=200){
            System.out.println("the amount is="+4.30+"rupees");
                System.out.println("The customer charges for this units is="+50+"rupees");
        }else if(j>200){
            if(j>0&&j<=200){
                System.out.println("the amount is="+5+"rupees");
                System.out.println("The customer charges for this units is="+60+"rupees");
            }
            if(j>=201&&j<=300){
                System.out.println("the amount is="+7.20+"rupees");
                System.out.println("The customer charges for this units is="+60+"rupees");
            }
            if(j>=301&&j<=400){
                System.out.println("the amount is="+8.50+"rupees");
                System.out.println("The customer charges for this units is="+80+"rupees");
            }
            if(j>=401&&j<=800){
                System.out.println("the amount is="+9+"rupees");
                System.out.println("The customer charges for this units is="+80+"rupees");
            }
            if(j>800){
                System.out.println("the amount is="+9.5+"rupees");
                System.out.println("The customer charges for this units is="+80+"rupees");
            }
        }


    }
}
