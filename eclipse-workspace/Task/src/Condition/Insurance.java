package Condition;

/*  9. An Insurance company follows following rules to calculate premium. (1) If a person’s health is excellent and the person is
 *   between 25 and 35 years of age and lives in a city and is a male then the premium is Rs. 4 per thousand and his policy amount
 *   cannot exceed Rs. 2 lakhs.
 *   (2) If a person satisfies all the above conditions except that the sex is female then 
 *  the premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh.
 *   (3) If a person’s health is poor and the person is between 25 and 35 years of age and lives in a village and is a male
 *    then the premium is Rs. 6 per thousand and his policy cannot exceed Rs. 10,000. (4) In all other cases the person is not insured.
 *        Write a program to output whether the person should be insured or not,
 *  his/her premium rate and maximum amount for which he/she can be insured.  */

public class Insurance {
	
	public static void main(String[] args) {
		
		String health = "excellent"; 
        int age = 30; 
        String livein = "city"; 
        String gender = "female"; //

        // Determine insurance eligibility and calculate premium rate and maximum policy amount
        boolean isInsurable = false;
        int premiumRate = 0;
        int maxPolicyAmount = 0;

        if (health.equals("excellent") && age >= 25 && age <= 35 && livein.equals("city")) {
            if (gender.equals("male")) {
                isInsurable = true;
                premiumRate = 4;
                maxPolicyAmount = 200000;
            } else if (gender.equals("female")) {
                isInsurable = true;
                premiumRate = 3;
                maxPolicyAmount = 100000;
            }
        } else if (health.equals("poor") && age >= 25 && age <= 35 && livein.equals("village") && gender.equals("male")) {
            isInsurable = true;
            premiumRate = 6;
            maxPolicyAmount = 10000;
        }

        // Output the insurance information
        if (isInsurable) {
            System.out.println("The person should be insured.");
            System.out.println("Premium rate: Rs. " + premiumRate + " per thousand.");
            System.out.println("Maximum policy amount: Rs. " + maxPolicyAmount);
        } else {
            System.out.println("The person is not insurable.");
        }
		
		
	}

}
