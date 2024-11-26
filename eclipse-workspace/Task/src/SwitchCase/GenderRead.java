package SwitchCase;

/*4. Write a program to read gender(M/F) and print the corresponding gender using a switch statement  */

public class GenderRead {
	public static void main(String[] args) {
        // Define the gender (M/F)
        char gender = 'F'; 

       
        String genderName;
        switch (gender) {
            case 'M':
            case 'm':
                genderName = "Male";
                break;
            case 'F':
            case 'f':
                genderName = "Female";
                break;
            default:
                genderName = "Invalid gender";
                break;
        }

      
        System.out.println("Gender: " + genderName);
    }

}
