package com.assignment.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	
    //Declaring variable
	static String fname, lname, add, city, state, zip, phoneno, emailid;
	private String addressId;
	List<PersonInfo> infos;
	static List<PersonInfo> contact;


	public AddressBookMain() {
		contact = new ArrayList<PersonInfo>();
	}

	public String getaddressId() {
		return addressId;
	}

	public void setaddressId(String addressId) {
		this.addressId = addressId;
	}

	public List<PersonInfo> getPersonInfo() {
		return infos;
	}

	public void setPersonInfo(List<PersonInfo> infos) {
		this.infos = infos;
	}

	public void enterInform() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First name :");
		fname = sc.nextLine();
		System.out.println("Enter your Last name : ");
		lname = sc.nextLine();
		System.out.println("Enter your address :");
		add = sc.nextLine();
		System.out.println("Enter your city :");
		city = sc.nextLine();
		System.out.println("Enter your state :");
		state = sc.nextLine();
		System.out.println("Enter your zip :");
		zip = sc.nextLine();
		System.out.println("Enter your phoneno :");
		phoneno = sc.nextLine();
		System.out.println("Enter your email id :");
		emailid = sc.nextLine();


	}
   
	 public static void callMethod() {
		 PersonInfo person = new PersonInfo(fname, lname, add, city, state, zip, phoneno, emailid);
		 contact.add(person);
	 }
	 public void deletePerson() {
		 System.out.println("Enter the name of the person you want to delete");
			Scanner s = new Scanner(System.in);
			String name = s.nextLine();

			for (int j = 0; j < contact.size(); j++) {
				PersonInfo p = contact.get(j);
				if (name.equals(p.getFirstName())) {
					contact.removeAll(contact);
					for (PersonInfo gen1 : contact) {
						System.out.println("Updated information is "+gen1);
					}
					System.out.println("Information is deleted");
					System.out.println(contact.isEmpty());

				}
				else {
					System.out.println("The name is different");
				}
			}
	 }
	 
	
	
	public static void main(String[] args) {
		AddressBookMain address = new AddressBookMain();
		address.enterInform();
		callMethod();
		address.setPersonInfo(contact);
		
		for (PersonInfo gen : contact) {
			System.out.println(gen);
		}
		
		

		// Delete the information with name
		address.deletePerson();
	   //Edit person information
		System.out.println("Enter the name of the person you want to add");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();

		for (int j = 0; j < contact.size(); j++) {
			PersonInfo p = contact.get(j);
			if (name.equals(p.getFirstName())) {
				address.enterInform();
				PersonInfo person3 = new PersonInfo(fname, lname, add, city, state, zip, phoneno, emailid);
				contact.set(j, person3);

			}
			else {
				System.out.println("The name is different");
			}
		}
		for (PersonInfo gen1 : contact) {
			System.out.println("Updated information is "+gen1);
		}

		
	}

}