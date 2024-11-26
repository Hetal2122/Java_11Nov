package Array;


/* 7	Write a Java program to find duplicate values in an array of string values.*/

public class FindDuplicate {
	
public static void main(String[] args) {
		
		
		String[] array = {"surat", "bardoli", "vyara", "surat", "songhad", "pune"};
        findDuplicates(array);
    }

    public static void findDuplicates(String[] array) {
        boolean hasDuplicates = false;
        System.out.println("Duplicate values:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    hasDuplicates = true;
                    break; 
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate values found.");
        }
	}


}
