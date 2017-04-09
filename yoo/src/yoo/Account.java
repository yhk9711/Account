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
   
   public void debit(double with){
      balance-=with;
      if(balance<0){
         balance+=with;
         System.out.print("Debit amount exceeded account balance.\n");
      }
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