package Array;

import java.util.Arrays;

/* 4. Write a Java program to remove a specific element from an array. */

public class RemoveElement {
	
	public static void main(String[] args) {
    	
        int[] array = {11, 22, 3, 17, 5, 6, 76, 7, 33};
        int elementToRemove = 6;
        int[] resultArray = removeElement(array, elementToRemove);

        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(resultArray));
    }

    public static int[] removeElement(int[] array, int elementToRemove) {
        int count = 0;

        
        for (int value : array) {
            if (value == elementToRemove) {
                count++;
            }
        }

        
        int[] result = new int[array.length - count];
        int index = 0;

        
        for (int value : array) {
            if (value != elementToRemove) {
                result[index++] = value;
            }
        }
		return result;
    }

}
