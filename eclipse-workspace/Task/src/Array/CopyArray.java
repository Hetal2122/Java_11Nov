package Array;

/* 5. Write a Java program to copy an array by iterating the array. */

public class CopyArray {
	
	public static void main(String[] args) {
		int[] originalArray = {2, 8, 6, 49, 65};
        int[] copiedArray = new int[originalArray.length];

        
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        
        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nCopied Array:");
        printArray(copiedArray);
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
	}

}
