class Account{
    double balance;
    void set_balance(double amt){
        balance=amt;
    }
    void deposit(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        if(balance>amt){
            balance=balance-amt;
            System.out.println("your amount is withdrawl");
        }else{
            System.out.println("insuffecient bank balance");
        }}
        double getbalance(){
            return balance;
        }
}
public class Methods_example2 {
   public static void main(String[] args) {
    Account c1=new Account();
    c1.set_balance(2000);
    c1.deposit(4000);
    System.out.println(c1.getbalance());
    c1.withdraw(4000);
    System.out.println(c1.getbalance());
   } 
}
