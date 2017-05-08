package yoo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
   
   public static double sumForAccount(ArrayList<? extends Account> list){
	   double sum =0;
	   
	   for(Account account : list){
		   sum+=account.getBalance();
	   }
	   return sum;
   }
   
   public static void passTimeForList(ArrayList<? extends Account> list, int month){
	   for(Account account : list){
		   account.passTime(month);
	   }
   }
}