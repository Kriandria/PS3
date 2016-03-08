package base;

import java.util.Date;
import exceptions.InsufficientFundsException;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}



	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double getAnnualInterestRate() {
		return annualInterestRate;
	}



	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double monthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
	      if(amount <= balance)
	      {
	         balance -= amount;
	      }
	      else
	      {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}
