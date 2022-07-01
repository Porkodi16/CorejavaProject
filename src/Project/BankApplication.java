package Project;

import java.util.Scanner;  

class BankDetails
{  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in); 
    
    //method to open new account  
    public void openAccount() 
    {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account Type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    
    //method to display account details  
    public void showAccount()
    {  
        System.out.println("Name of Account Holder: " + name);  
        System.out.println("Account No.: " + accno);  
        System.out.println("Account Type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    
    //method to deposit money  
    public void deposit()
    {  
        long amt;  
        System.out.println("Enter the Amount you want to Deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
        System.out.println("Balance After Deposit:"+balance);
    }  
    
    //method to withdraw money  
    public void withdrawal()
    {  
        long amt;  
        System.out.println("Enter the Amount you want to Withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance After Withdrawal: " + balance);  
        }
        else
        {  
            System.out.println("Your Balance is less than " + amt + "\tTransaction Failed...!!" );  
        }  
    }  
    
    //method to search an account number  
    public boolean search(String ac_no)
    {  
        if (accno.equals(ac_no))
        {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
} 

public class BankApplication{  
	
    public static void main(String arg[]) {  
    	
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many Number of Customers do you want to Input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) 
        {  
            C[i] = new BankDetails();  
            C[i].openAccount(); 
        }
        
        // loop runs until number 5 is not pressed to exit  
        int ch;  
        
        do
        {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all Account Details \n 2. Search by Account Number\n 3. Deposit the Amount \n 4. Withdraw the Amount \n 5.Exit ");  
            System.out.println("Enter your Choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                    	
                        for (int i = 0; i < C.length; i++)
                        {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                    	
                        System.out.print("Enter Account Number you want to Search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++)
                        {  
                            found = C[i].search(ac_no);  
                            if (found)
                            {  
                                break;  
                            }  
                        }  
                        if (!found)
                        {  
                            System.out.println("Search Failed! Account Doesn't Exist..!!");  
                        }  
                        break;  
                    case 3:  
                    	
                        System.out.print("Enter Account No. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++)
                        {  
                            found = C[i].search(ac_no);  
                            if (found)
                            {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found)
                        {  
                            System.out.println("Search Failed! Account Doesn't Exist..!!");  
                        }  
                        break;  
                    case 4:  
                    	
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++)
                        {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found)
                        {  
                            System.out.println("Search Failed! Account Doesn't Exist..!!");  
                        }  
                        break;  
                    case 5:  
                    	
                        System.out.println("SEE YOU SOON...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }

}






