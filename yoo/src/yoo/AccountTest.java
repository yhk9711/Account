package yoo;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Account account1=new Account(100);
		Account account2=new Account(100);
			
			System.out.printf("account1 balance : $%f\n", account1.getBalance());
			System.out.printf("account2 balance : $%f\n", account2.getBalance());
			
			Scanner aa = new Scanner(System.in);
			
			System.out.print("Enter deposit amount for account1: ");
			double withdraw1=aa.nextDouble();
			
			account1.debit(withdraw1);
			
			System.out.printf("account1 balance : $%f\n", account1.getBalance());
			System.out.printf("account2 balance : $%f\n", account2.getBalance());
			
			System.out.print("Enter withdrawal amount for account2: ");
			double withdraw2=aa.nextDouble();
			
			account2.debit(withdraw2);
			
			if(account2.getBalance()<0){
				System.out.println("Debit amount exceeded account balance");
				account2.setBalance(0);
			}
			System.out.printf("account1 balance : $%f\n", account1.getBalance());
			System.out.printf("account2 balance : $%f\n", account2.getBalance());
	}
}
