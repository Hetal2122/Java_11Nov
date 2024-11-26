package Condition;

/*  6 If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three.  */


public class YoungestOfThreee {
	public static void main(String[] args) {
		
		int Ram = 27;
        int Shyam = 24;
        int Ajay = 29;

        if (Ram <= Shyam && Ram <= Ajay) {
            System.out.println("Ram is the youngest among the three.");
        } else if (Shyam <= Ram && Shyam <= Ajay) {
            System.out.println("Shyam is the youngest among the three.");
        } else {
            System.out.println("Ajay is the youngest among the three.");
        }
		
	}

}
