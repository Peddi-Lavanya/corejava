package lavaproject;
import java.util.*;
class Account{
	public String name;
	protected String email;
	private String password;
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String pass) {
		this.password=pass;
	}
}

public class Package_bank {
     
	public static void main(String[] args) {
		Account account1=new Account();
		account1.name = "Lavanya";
		account1.email="peddilavanya@gmail.com";
        account1.setPassword("lava");
        System.out.println(account1.getPassword());
	}

}
