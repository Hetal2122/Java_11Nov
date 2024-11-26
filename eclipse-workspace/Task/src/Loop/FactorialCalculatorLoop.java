package Loop;

/*2 loop- Write a program to find the factorial value of any number entered through the keyboard.*/



public class FactorialCalculatorLoop {
 public static void main(String[] args) {
	 
	 int a = 8; // Predefined number
     long fact = 1;
     
     for (int i = 1; i <= a; i++) {
         fact *= i;
     }
     
     System.out.println("The factorial of " + a + " is: " + fact);
 

	
}
}
