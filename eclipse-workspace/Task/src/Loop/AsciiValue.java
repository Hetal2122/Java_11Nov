package Loop;

/*  4.loop-Write a program to print all the ASCII values and their equivalent characters using a while loop. The ASCII values vary from 0 to 255. */


public class AsciiValue {

public static void main(String[] args) {
	
	 // Initialize the starting value of ASCII
    int asciiValue = 0;
    
    // Use a while loop to iterate through ASCII values from 0 to 255
    while (asciiValue <= 255) {
    	
    	
        // Print the ASCII value and its corresponding character
        System.out.printf("ASCII Value: %d, Character: %c%n", asciiValue, (char) asciiValue);
        
        // Increment the ASCII value
        asciiValue++;
    }
	
}

}
