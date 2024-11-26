package Loop;

/* 	5.  loop-Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is 
equal to the number itself, then the number is called an Armstrong number.
 For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 5 ) + ( 3 * 3 * 3 ) 
*/

public class ArmstrongNumbers {
	public static void main(String[] args) {
		
		for (int number = 1; number <= 500; number++) {
            int sumOfCubes = 0;
            int temp = number;

            
            for (; temp > 0; temp /= 10) {
                int digit = temp % 10;
                sumOfCubes += digit * digit * digit;
            }
            
            
            if (sumOfCubes == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
		
	}

}
