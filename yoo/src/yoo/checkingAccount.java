package yoo;

public class checkingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	
	public checkingAccount (double balance, double limit, double interest, double loanInterest){
		super(balance);
		
		credit_limit=limit;
		this.interest = interest;
		loan_interest = loanInterest;
		}
	
	@Override
	public void debit(double a){
		if(a > credit_limit){
			System.out.print("Debit amount exceeded account balance.\n");
		}else{
			balance-=a;
			if(balance<0){
				System.out.print("Minus balance.\n\n");
			}
		}
	}
	
	public double nextMonth(){
		if(balance < 0){
			balance = balance + balance * loan_interest;
		}else{
			balance = balance + balance * interest;
		}
		return balance;
	}
}