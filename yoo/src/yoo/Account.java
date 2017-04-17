package yoo;

import java.util.Scanner;

abstract class Account implements Valuable{
   private double balance;
   
   public Account(double initialBalance) {
      balance=initialBalance;
   }


   public void credit(double add){
      balance+=add;
         }
   
   public void debit(double amount)throws Exception{
	   balance -=amount;
   }
      
   
   protected void setBalance(double b){
      balance=b;
      
   }
   public double getBalance(){
      return balance;
   }
   
   abstract double getWithdrawableAccount();
   
   abstract void passTime(int hours);

}