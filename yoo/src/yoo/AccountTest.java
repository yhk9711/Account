package yoo;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		checkingAccount account1 = new checkingAccount(500, 0.01, 0.07);
		checkingAccount account2 = new checkingAccount(500, 0.01, 0.07);
		
		account1.setBalance(100);
		account2.setBalance(100);
			
			System.out.printf("account1 balance : $ % .2f\n", account1.getBalance());
			System.out.printf("account2 balance : $ % .2f\n", account2.getBalance());
			
			
			System.out.print("Enter deposit amount for account1: ");
			double a=input.nextDouble();
			
			account1.credit(a);
			
			System.out.printf("account1 balance : $ % .2f\n", account1.getBalance());
			System.out.printf("account2 balance : $ % .2f\n", account2.getBalance());
			
			System.out.print("Enter withdrawal amount for account2: ");
			double b=input.nextDouble();
			
			account2.debit(b);
			
			System.out.printf("account1 balance : $ % .2f\n", account1.getBalance());
			System.out.printf("account2 balance : $ % .2f\n", account2.getBalance());
			
			System.out.print("next month!\n\n");
			
			System.out.printf("account1 balance : $ % .2f\n", account1.nextMonth());
			System.out.printf("account2 balance : $ % .2f\n", account2.nextMonth());
			
	}
}
