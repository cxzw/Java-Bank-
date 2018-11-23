package test;
/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */


import banking3.Bank;
import banking3.Customer;

public class TestBanking4 {

  public static void main(String[] args) {
    Bank     bank = new Bank();

    // Add Customer Jane, Simms
	//code
    bank.addCustomer("Jane", "Simth");
    
    //Add Customer Owen, Bryant
	//code
    bank.addCustomer("Owen", "Byant");
    // Add Customer Tim, Soley
	//code
    bank.addCustomer("Tim", "Soley");
    
    // Add Customer Maria, Soley
	//code
    bank.addCustomer("Maria", "Soley");
    
    for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
      Customer customer = bank.getCustomer(i);

      System.out.println("Customer [" + (i+1) + "] is "
			 + customer.getLastName()
			 + ", " + customer.getFirstName());
    }
  }
}
