package yoo;

public class Account {
	private double money;
	
	public Account(double s){
		money=s;
	}
	public double getMoney(){
		return money;
	}
	public void setMoney(double s){
		money=s;
	}
	
	public void add(double s){
		money += s;
	}
	public void withdraw(double s){
		money -= s;
		
	}
}
