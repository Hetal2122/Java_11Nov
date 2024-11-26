package Assignment;

/*   3. If the marks obtained by a student in five different subjects  are input through the keyboard, find out the aggregate marks 
and percentage marks obtained by the student. Assume that the maximum marks that can be obtained by a student in each subject is 100.*/


public class Marks {
	
	public static void main(String[] args) {
		int sub1= 84;
		System.out.println("DAA marks is:"+sub1);
		
		int sub2= 75;
		System.out.println("ML marks is:"+sub2);
		
		int sub3= 88;
		System.out.println("CC marks is:"+sub3);
		
		int sub4= 65;
		System.out.println("SE marks is:"+sub4);
		
		int sub5= 92;
		System.out.println("NCS marks is:"+sub5);
		
		int TotalMarks= sub1+ sub2+ sub3+ sub4+ sub5;
		float Percentage= TotalMarks*100/500;
		
		System.out.println("Total Marks is:"+ TotalMarks +"\n and Percentage is:"+ Percentage + "%");
	
	}

}
