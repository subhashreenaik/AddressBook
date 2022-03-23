package com.assignment.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class AddressBookMain {
	
    //Declaring variable
	static String fname, lname, add, city, state, zip, phoneno, emailid;
	private static String addressId;
	List<PersonInfo> infos;
	static List<PersonInfo> contact;
	static Map<String, List<PersonInfo>> addressBook;


	public Map<String, List<PersonInfo>> getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(Map<String, List<PersonInfo>> addressBook) {
		this.addressBook = addressBook;
	}

	public AddressBookMain() {
		contact = new ArrayList<PersonInfo>();
		addressBook = new HashMap<>();
	}
	
	public String getaddressId() {
		return addressId;
	}

	public List<PersonInfo> getPersonInfo() {
		return infos;
	}

	public void setPersonInfo(List<PersonInfo> infos) {
		this.infos = infos;
	}
    /**
     * This method is used to enter the person's information
     */
	public static  void enterInform() {
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
		 addressBook.put(addressId, contact);
	 }
	 /**
	     * This method is used to delete the person's information
	     */
	 public void deletePerson() {
		 System.out.println("Enter the name of the person you want to delete");
			Scanner s = new Scanner(System.in);
			String name = s.nextLine();

			for (int j = 0; j < contact.size(); j++) {
				PersonInfo p = contact.get(j);
				if (name.equals(p.getFirstName())) {
					contact.remove(j);
					for (PersonInfo gen1 : contact) {
						System.out.println("Updated information is "+gen1);
					}
					System.out.println("Information is deleted");

				}
				else {
					System.out.println("The name is different");
				}
			}
	 }
	 /**
	     * This method is used to edit the person's information
	     */
	 
	 public  void editPerson() {
		
		 System.out.println("Enter the name of the person you want to edit");
			Scanner s = new Scanner(System.in);
			String name = s.nextLine();
			for (int j = 0; j < contact.size(); j++) {
				PersonInfo p = contact.get(j);
				if (name.equals(p.getFirstName())) {
					enterInform();
					PersonInfo person3 = new PersonInfo(fname, lname, add, city, state, zip, phoneno, emailid);
					contact.set(j, person3);

					for (PersonInfo gen1 : contact) {
						System.out.println("Updated information is "+gen1);
					}

				}
				else {
					System.out.println("The name is different");
				}
			}
//		
	 }
	 
	
	
	public static void main(String[] args) {
		AddressBookMain address = new AddressBookMain();
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many person's information You want to add");	
		int n=s.nextInt();
		
		
		
		System.out.println("Enter your address id :  address1 or address2");
		s.nextLine();
		addressId = s.nextLine();
		switch(addressId) {
		
		case "address1":
			
		for(int i=0;i<n;i++) {
			enterInform();
			callMethod();
			address.setPersonInfo(contact);
			address.setAddressBook(addressBook);
		}
		break;
		case "address2":
			for(int i=0;i<n;i++) {
				enterInform();
				callMethod();
				address.setPersonInfo(contact);
				address.setAddressBook(addressBook);
		
		}
			break;
		}
		/**
		 * calling the method to write the contact information to text file
		 */
		new AddressBookIOService().writeData(contact);
		/**
		 * calling the method to write the contact information to text file
		 */
		new AddressBookIOService().printData();
		/**
		 * printing the multiple person information
		 */
		for (PersonInfo gen : contact) {
			System.out.println(gen);
		}
		
		/**
		 * printing addressbook
		 */
		System.out.println(address.getAddressBook());
		
		
	    /**
	     * Edit person information
	     */
		address.editPerson();
		
		
		/**
		 * Delete the information with name
		 */
		address.deletePerson();
		
	}

}