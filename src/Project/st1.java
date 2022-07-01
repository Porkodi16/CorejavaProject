package Project;

import java.util.Scanner;  


class StudentDetails
{ 
	
	    private String name; 
	    private String branch;
	    private int rollno;
	    private long phoneno;
	    private String mailid;
	    private String balance;
	   
	    Scanner sc = new Scanner(System.in); 
	    
	    //method to login student details
	    
	    public void login() 
	    {  
	        System.out.println("Enter  Name: ");  
	        name = sc.nextLine();  
	        System.out.println("Enter Branch ");  
	        branch= sc.nextLine(); 
	        System.out.println("Enter RollNo: ");  
	        rollno = sc.nextInt();  
	        System.out.println("Enter Phone Number: ");  
	        phoneno= sc.nextLong();
	        System.out.println("Enter Mail Id:");
	        mailid=sc.nextLine(); 
	        System.out.println("Enter Balance:");
	        balance=sc.nextLine();  

	        
	    }  
	    
	    //method to student login details  
	    
	    public void showlogin()
	    
	    {  
	        System.out.println("Name of Student: " + name);  
	        System.out.println("Branch " + branch);  
	        System.out.println("Roll No of the Student: " + rollno);  
	        System.out.println("Phone Number: " + phoneno);
	        System.out.println("Mail Id:"+mailid);
	        System.out.println("Balance:"+balance);
	    } 
	    
	    
	    //Fees
	    
	     public void coursefees()
	     
	     {
	    	 int amt;
	    	 int fees=5000;
	         System.out.println("Enter the Amount you want to Pay: ");  
	         amt = sc.nextInt();  
	         
	         if(fees==amt)
	         {
	        	 System.out.println("You have Paid Full Amount.. So You can Join");
	         }
	       //  else
	      //   {
	      //  (amt<fees)
	        
	        	// System.out.println("Your balance amount is:"+balance);
	             	 
	         }
	         public void coursename()
	         
	         {
	        	 System.out.println("Java Developer");
	        	 System.out.println("Cloud");
	        	 System.out.println("Embedded"); 
	        	 
	         
	         
	         
	         


	    	 
	     }


	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
