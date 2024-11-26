package Array;


/* 3. Write a Java program to test if an array contains a specific value.*/

public class ConstainValue {
	
	public static boolean contains(int[] arr, int targetValue) {
        for (int num : arr) {
            if (num == targetValue) {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5, 7};
        int Value1 = 5;
        int Value2 = 8;

        if (contains(arr, Value1)) {
            System.out.println("Array contains " + Value1);
        } else {
            System.out.println("Array does not contain " + Value1);
        }

        if (contains(arr, Value2)) {
            System.out.println("Array contains " + Value2);
        } else {
            System.out.println("Array does not contain " + Value2);
        }
    }
		

}
