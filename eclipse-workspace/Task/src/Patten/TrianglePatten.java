package Patten;

/*   1   
    2   3   
  4   5   6   
7   8   9   10  
 
   */


public class TrianglePatten {
	public static void main(String[] args) {
		int a = 4;

        int b = 1; 

        
        for (int i = 1; i <= a; i++) {
            
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  "); 
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print(b + "   "); 
                b++; 
            }

            System.out.println(); 
        }
		
		
	}

}
