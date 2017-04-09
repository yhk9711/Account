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
	   
	   
	   public void debit(double with){
	      if(month<12){
	         System.out.print("아직은 출금할 수 없습니다 \n");
	      }else {
	         if(getBalance()-with>0){
	            setBalance(getBalance()-with);
	         }else {
	            System.out.print("한도를 초과했습니다\n");
	         }
	      }
	   }
	   
	   public double EstimateValue(int month){
	      setBalance(getBalance()*Math.pow((1+interest), month));
	      return getBalance();
	   }
	   
	   public String toString(){
	      return String.format("SavingAccount_price"+getBalance());
	   }
	}