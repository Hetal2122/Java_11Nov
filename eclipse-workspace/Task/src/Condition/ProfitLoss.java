package Condition;

/* 1. Condition- If cost price and selling price of an item is input through the keyboard, write a program to determine 
whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred. 
*/

public class ProfitLoss {
	
	public static void main(String[] args) {
		
	    double costPrice = 1500.0;
	    double sellingPrice = 1700.0;

	    
	    double profitOrLoss = sellingPrice - costPrice;

	    
	    if (profitOrLoss > 0) {
	        System.out.println("The seller made a profit of: " + profitOrLoss);
	    } else if (profitOrLoss < 0) {
	        System.out.println("The seller incurred a loss of: " + (-profitOrLoss));
	    } else {
	        System.out.println("No profit, no loss.");
	    }

	}

}
