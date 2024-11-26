package Assignment;

/*8. In a town, the percentage of men is 52. The percentage of total literacy is 48. If total percentage of literate men is 35 of 
the total population, write a program to find the total number of illiterate men and women if the population of the town is 
80,000.*/


public class LiteracyPercentage {
	
	 public static void main(String[] args) {
	        int totalPopulation = 80000;
	        double percentageMen = 52.0;
	        double percentageLiteracy = 48.0;
	        double percentageLiterateMen = 35.0;

	        // Calculate the number of men, women, literate men, and literate women
	        int men = (int) (totalPopulation * (percentageMen / 100.0));
	        int women = totalPopulation - men;
	        int literateMen = (int) (totalPopulation * (percentageLiterateMen / 100.0));
	        int literateWomen = (int) (totalPopulation * (percentageLiteracy / 100.0)) - literateMen;

	        // Calculate the number of illiterate men and women
	        int illiterateMen = men - literateMen;
	        int illiterateWomen = women - literateWomen;

	        System.out.println("Total number of illiterate men: " + illiterateMen);
	        System.out.println("Total number of illiterate women: " + illiterateWomen); 
	    }
	

}
