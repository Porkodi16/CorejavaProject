
package Project;

import java.util.Scanner;


public class Practice
{
	public void courseDetails(int choice)
	{
		switch(choice)
		{
		case 1: 
			System.out.println("1.Java Full Stack Developer"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 3 months");
			break;
		case 2: 
			System.out.println("2.Python"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 5 months");
			break;
		case 3: 
			System.out.println("3.Data Scientist"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 6 months");
			break;
		case 4: 
			System.out.println("4.Frond End Developer"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 3 months");
			break;
		case 5: 
			System.out.println("5.Back End Developer"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 3 months");
			break;
		case 6:
			System.out.println("Thank You...");
			break;
			
		}
	}
	
	public void StudentDetails(String name, String address, long mobileno, String emailid)
	
	{
		System.out.println("Student Name: " +name + "\nLocation: " + address + "\nMobile No: " +mobileno
				+ "\nEmail Id: "+ emailid);
	
		
	}
	public void courseFees(double fees)
	{
		
		if(fees==5000)
		{
			System.out.println("You have completed Full payment. Happy Learning!");
		}
		else
		{
			double balance = 5000 - fees;
			System.out.println("You have paid Rs." +fees + " " + "balance amount to be paid is Rs." + balance);
		}
	}
	
	 public static void main(String [] args)
	 {
		 Practice s = new Practice();
		 Scanner sc = new Scanner(System.in);
		 
		 int ch;

		 ch=sc.nextInt();
		    do
		 	 {
		           System.out.println("\n ***Student Management***");  
		           System.out.println("1. Course Details \n 2. Student Details\n 3. Course Fees\n 4.Exit ");  

		 	 }
		    while(ch  !=6);

	 
		 
		System.out.println("Welcome to Edubridge! The Trending Courses are: " + "\n1.Java Full Stack Developer" + "\n2.Python"
		 + "\n3.Data Scientist" + "\n4.Frond End Developer" + "\n5.Back End Developer");
		
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt();
		s.courseDetails(choice);
		
		System.out.println("Enter Your Name:");
		 String name = sc.next();
		 
		System.out.println("Enter Your Address:");
		 String address = sc.next();
		 
		System.out.println("Enter Your Mobile No:");
		 long mobileno = sc.nextLong();
		 
		System.out.println("Enter your Email Id:");
		 String emailid = sc.next();
		 
		 //sc.close();
		s.StudentDetails(name,address,mobileno,emailid);
		System.out.println("Your Course Amount is Rs.5000/-");
		System.out.println("Please Enter Your Payment:");
		 double fees = sc.nextDouble();
		s.courseFees(fees);
	 }
}
  
  
    


