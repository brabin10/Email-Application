package com.rabincodes;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
	}
	// Ask for the department
	private String setDepartment() {
		System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "Sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else { return ""; }
		}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789$!@#%";
		char[] password = new char[length];
		for(int i = 0; i< length; i++) {
			int rand = (int)Math.random()* passwordSet.length();
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	// Set the alternate email
	
	// Change the password

}
