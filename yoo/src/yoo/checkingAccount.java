package yoo;

public class checkingAccount extends Account  {
	   private double credit_limit;
	   private double interest;
	   private double loan_interest;
	   
	   
	   public checkingAccount(double balance, double limit, double interest, double loanInterest){
	      super(balance);
	      credit_limit=limit;
	      this.interest=interest;
	      loan_interest=loanInterest;
	   }
	   
	   public double getWithdrawableAccount(){
	      if (getBalance()-credit_limit>0) {
	         return getBalance()+credit_limit;
	      } else {
	         return  0.0;
	      }
	      
	   }
	   
	   public void passTime(int month){
	      if(getBalance()>0){
	         setBalance(getBalance()*(1+interest*month));
	      } else if(getBalance()<0){
	         setBalance(getBalance()*(1+loan_interest*month));
	      }
	   }
	   
	   public boolean isBankrupted(){
	      if(getBalance()<-credit_limit){
	         return false;
	      } else {
	         return true;
	      }
	   }
	   
	   @Override
	   public void debit(double with){
	      if(getBalance()-with<-credit_limit){
	         System.out.print("exceed limit\n");
	      }else if(getBalance()-with>=-credit_limit){
	         setBalance(getBalance()-with);
	      }
	   }

	   public void nextMonth(){
	      if(getBalance()>0) {
	         setBalance(getBalance()*(1+interest));
	      }else if(getBalance()<0) {
	         setBalance(getBalance()*(1+loan_interest));
	      }
	   }
	   
	   public double EstimateValue(int month){
	      passTime(month);
	      return getBalance();
	   }
	   
	   public String toString(){
	      return String.format("checkingAccount_price"+getBalance());
	   }
	}