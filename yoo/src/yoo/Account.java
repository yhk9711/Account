package yoo;

public class Account {
	protected double balance;
	
	public Account(double s){
		balance=s;
	}
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double s){
		balance=s;
	}
	
	public void credit(double s){
		balance += s;
	}
	public void debit(double s){
		balance -= s;
		if(balance<0){
			System.out.println("Debit amount exceeded account balance");
			balance+=s;
			}
		}
}
