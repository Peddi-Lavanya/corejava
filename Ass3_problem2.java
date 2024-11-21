import java.util.Scanner;
public class Ass3_problem2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to wonderla...!Here you can purchase tickets");
        System.out.println("please Enter your age");
        int a=sc.nextInt();
        for(int i=0;i<=99;i++){
            if(i>0 &&i<12){
                System.out.println("this ticket is for a child of rupees:-"+846.61);
            }
            else if(i>18&&i<21){
               System.out.println("this ticket is for a adult of rupees:-"+846.61);                 
            }
            else if(i>60){
               System.out.println("this ticket is for a senior citizen of rupees:-"+846.61);                 
            }
            else if(i>=6&&i<8){
               System.out.println("this ticket is for a Fast track child of rupees:-"+1270.00);                 
            }
            else if(i>21&&i<60){
               System.out.println("this ticket is for a Fast track adult of rupees:-"+1270.00);                
            }
            else if(i>18&&i<21){
               System.out.println("this ticket is for a  adult with id card of rupees:-"+720.00);                
            }

        }
    }
}
