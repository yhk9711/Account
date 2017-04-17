package yoo;

public class SavingsAccount extends Account {

	   private double interest;
	   private int month;
	   
	   public SavingsAccount(double balance, double interest){
	      super(balance);
	      this.interest=interest;
	   }
	   
	   public double getWithdrawableAccount() {
	      if(month>12){
	         return getBalance();
	      } else {
	         return 0.0;
	      }
	   }
	   
	   public void passTime(int m){
	      month=month+m;
	      if(month==12){
	         setBalance(getBalance()*Math.pow((1+interest), month));
	      }
	   }
	   
	   public void passTime(){
		   setBalance(getBalance()*(1+interest));
	   }
	   
	   
	   public void debit(double amount)throws Exception{
		   if(amount<0){
			   throw new Exception("음수입력!");
		   }
		   if(getBalance()-amount<0){
			   throw new Exception("Debit amount exceeded account balance.");
		   }
	      if(month<12){
	         throw new Exception("아직은 출금할 수 없습니다 \n");
	      }else {
	         if(getBalance()-amount>0){
	            setBalance(getBalance()-amount);
	         }else {
	            System.out.print("한도를 초과했습니다\n");
	         }
	      }
	   }
	   
	   public double EstimateValue(int month){
	      setBalance(getBalance()*Math.pow((1+interest), month-1));
	      return getBalance();
	   }
	   
	   public double EstimateValue(){
		   setBalance(getBalance()*(1+interest));
		   return getBalance();
	   }
	   
	   public String toString(){
	      return String.format("SavingAccount_price"+getBalance());
	   }
	}