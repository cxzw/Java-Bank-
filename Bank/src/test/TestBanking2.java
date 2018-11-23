package test;



import banking.Account;
import banking.Customer;

public class TestBanking2 {

  public static void main(String[] args) {
    Customer customer;
    Account  account;

    // Create an account that can has a 500.00 balance.
    account = new Account(500);
    
    System.out.println("Creating the customer Jane Smith.");
    //code
    customer = new Customer("jane", "smith");
    		
    System.out.println("Creating her account with a 500.00 balance.");
    //code
    customer.setAccount(account);
    
    System.out.println("Withdraw 150.00");
    //code
    customer.getAccount().withdraw(150);
    
    System.out.println("Deposit 22.50");
  	//code
    customer.getAccount().deposit(22.5);
    
    System.out.println("Withdraw 47.62");
   	//code
    customer.getAccount().withdraw(47.62);
    
    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + account.getBalance());
  }
}
