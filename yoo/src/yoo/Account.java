package yoo;

public class Account {
	protected double balance;
	
	public Account(double initailBalance){
		balance=initailBalance;
	}

	public double getBalance(){
		return balance;
	}
	public void setBalance(double m){
		balance = m;
	}
	
	public void credit(double m){
		balance += m;
	}
	public void debit(double m){
		balance -= m;
		
		}

	abstract double getWithdrawableAccount();
	
	
	abstract void passTime(int p);

}