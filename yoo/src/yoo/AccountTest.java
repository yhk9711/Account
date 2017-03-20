package yoo;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Account account1=new Account(50);
		Account account2=new Account(0);
			
			System.out.printf("account1 balance : $%f\n", account1.getMoney());
			System.out.printf("account2 balance : $%f\n", account2.getMoney());
			
			Scanner aa = new Scanner(System.in);
			
			System.out.print("Enter withdrawal amount for account1: ");
			double withdraw1=aa.nextDouble();
			
			account1.withdraw(withdraw1);
			
			System.out.printf("account1 balance : $%f\n", account1.getMoney());
			System.out.printf("account2 balance : $%f\n", account2.getMoney());
			
			System.out.print("Enter withdrawal amount for account2: ");
			double withdraw2=aa.nextDouble();
			
			account2.withdraw(withdraw2);
			
			if(account2.getMoney()<0){
				System.out.println("Debit amount exceeded account balance");
				account2.setMoney(0);
			}
			System.out.printf("account1 balance : $%f\n", account1.getMoney());
			System.out.printf("account2 balance : $%f\n", account2.getMoney());
	}
}
