package yoo;

public class Account {
	protected double balance;
	

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
}
