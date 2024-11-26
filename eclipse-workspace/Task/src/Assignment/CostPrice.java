package Assignment;

/* 9 .If the total selling price of 15 items and the total profit earned on them is input through the keyboard, write a program to 
find the cost price of one item.*/

public class CostPrice {
	
	public static void main(String[] args) {
		
		 double totalSellingPrice = 2700.0; 
	        double totalProfit = 300.0; 

	        
	        double totalCostPrice = totalSellingPrice - totalProfit;

	        
	        double costPricePerItem = totalCostPrice / 15;

	        
	        System.out.println("The cost price of one item is: " + costPricePerItem);
	}


}
