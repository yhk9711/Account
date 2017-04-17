package yoo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]){
		
		Account account1=new checkingAccount(100,50,0.01,0.07);
		Account account2=new SavingsAccount(100,0.05);
		Human h=new Human("Mark",20);
		Car c=new Car("MyCar", 5000);
		
		System.out.println("CheckingAccount_Balance: " + account1.getBalance() );
		System.out.printf("1 month later Value (Method Overloding, no parameter): %.2f\n" , account1.EstimateValue());
		System.out.printf("5 month later Value :%.2f\n" , account1.EstimateValue(5));
		
		System.out.println("SavingsAccount_Balance: " + account2.getBalance() );
		System.out.println("1 month later Value (Method Overloding, no parameter): " + account2.EstimateValue());
		System.out.printf("5 month later Value : %.2f\n " , account2.EstimateValue(5));
		
		System.out.println( h.toString());
		System.out.println("1 month later Value (Method Overloding, no parameter): " + h.EstimateValue());
		System.out.println("5 month later Value :" + h.EstimateValue(5));
		
		System.out.println(c.toString());
		System.out.printf("1 month later Value (Method Overloding, no parameter):%.2f\n " ,c.EstimateValue());
		System.out.printf("5 month later Value :%.2f\n " , c.EstimateValue(5));

		
		
		
		
		
		
	
		
		
		
		/*	Scanner scan = new Scanner(System.in);
		
		try{
			Scanner _scan = new Scanner(System.in);
			
			System.out.println("Enter deposit amount for Account1: ");
			double amount=scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n"+ e.toString());
		}catch(Exception e){
			System.out.println("예외발생  "+ e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2 month later account1 : "+ account1.getBalance());
		}*/
	}
}