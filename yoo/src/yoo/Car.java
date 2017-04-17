package yoo;

public class Car implements Valuable{
	   private String name;
	   private double price;
	   private int m;
	   
	   public Car(String name,double price){
	      this.name=name;
	      this.price=price;
	   }
	   
	   public double EstimateValue(int month){
		   if(m==1){
			   price=price/(0.8*0.99);
		   }
		   price=price*0.8;
	      for(int i=0;i<month;i++){
	         price=price*0.99;
	      }     
		   return price;
	   }
	   
	   
	   public double EstimateValue(){
		   m=1;
		   price=price*0.8;
		   price=price*0.99;
		   return price;
	   }
	   
	   
	   public String toString(){
	      return String.format("car name: "+name+"\ninitial price: "+price);
	   }
	}