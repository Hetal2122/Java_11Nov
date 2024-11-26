package ClassObject;

/* 1 . Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively 
	by creating two objects of the class 'Student'.*/


class Student {
    int rollNo;
    String name;
    String phoneNumber;
    String address;

    // Method to set student details
    public void setDetails(int rollNo, String name, String phoneNumber, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println(); // For better readability
    }
}

public class StudentClass {
	
	public static void main(String[] args) {
		
		 Student std1 = new Student();
	        Student std2 = new Student();

	        
	        std1.setDetails(1, "Sam", "7878798278", "vyara");

	        
	        std2.setDetails(2, "John", "7202818456", "surat");

	        
	        System.out.println("Details of Student 1:");
	        std1.displayDetails();

	        
	        System.out.println("Details of Student 2:");
	        std2.displayDetails();
		
	}
	

}
