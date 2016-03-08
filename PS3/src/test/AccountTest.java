package test;

import static org.junit.Assert.*;

import org.junit.Test;

import base.Account;
import exceptions.InsufficientFundsException;

public class AccountTest extends Account{

	@Test
	public void test() throws InsufficientFundsException {
		Account account = new Account(1122,20000,0.045);
		
		assertEquals(account.getId(),1122);
		assertEquals(account.getBalance(),20000,0.001);
		assertEquals(account.getAnnualInterestRate(),0.045,0.001);
		
		account.deposit(3000);
		try
	      {
	         account.withdraw(2500);
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"+ e.getAmount());
	      }
		
		
		System.out.println("The balance is " + account.getBalance());
		System.out.println("The monthly interest rate is " + account.monthlyInterestRate());
		System.out.println("The account's creation date is " + account.getDateCreated());
		
		try
	      {
	         account.withdraw(30000);
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"+ e.getAmount());
	      }
	}

}
