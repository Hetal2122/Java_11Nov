package com.basic;

/*for i
* initialization : First no of pattern
* Condition : Largest/Smallest no in pattern
* 			   Smallest to Largest <=
*    		   Largest to smallest >=
* Incree/Decree : <= then ++
* 				   >= then --
* for j
* initialization : First Col of each row
* 				   - Same no then that no only
* 				   - Diff no then upper loop name
* Condition : Last col of each row
* 			   - Same no then that no only
* 			   - Diff no then upper loop name
* Incree/Decree : <= then ++
* 				   >= then --
* 
* for k:
* - k completely depends on i
*/

public class PatternDemo {
	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 
		 * 5
		 * 54
		 * 543
		 * 5432
		 * 54321
		 * 
		 * 5
		 * 45
		 * 345
		 * 2345
		 * 12345
		 * 
		 * 1
		 * 21
		 * 321
		 * 4321
		 * 54321
		 * 
		 * 1
		 * 10
		 * 101
		 * 1010
		 * 10101
		 * 
		 *      1
		 *     1 2
		 *    1 2 3
		 *   1 2 3 4
		 *  1 2 3 4 5
		 * 
		 * odd/even formula
		 * for k: 
		 * completely depends on i
		 * 
		 *       *    1   2-1
		 *      ***   3   4-1
		 *     *****  5   6-1
		 *      ***
		 *       *
		 *       
		 *    a
		 *    ab
		 *    abc
		 *    abcd
		 *    abcde
		 *    
		 *    a
		 *    bc
		 *    def
		 *    ghij
		 *    klmno
		 */
		for (char i = 'a'; i <='e'; i++) {
//			for (int k = i; k <=3; k++) {
//				System.out.print(" ");
//			}
			for (char j = 'a'; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		for (int i = 2; i >=1; i--) {
//			for (int k = i; k <=3; k++) {
//				System.out.print(" ");
//			}
//			for (int j =i*2-1 ; j >=1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
	}

}
