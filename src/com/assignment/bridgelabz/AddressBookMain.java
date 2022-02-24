package com.assignment.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	
	//Declaring variable
	static String fname,lname,add,city,state,zip,phoneno,emailid;
	private String addressId;
    List<PersonInfo> infos;
    static List<PersonInfo> contact;
    
    
   
   //constructor 
    public AddressBookMain(){
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
    public  void setPersonInfo(List<PersonInfo> infos) {
        this.infos = infos;
    }
    
	//Adding information of a person
	  public PersonInfo enterInform() {
		Scanner sc =new Scanner(System.in);
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
	    zip= sc.nextLine();
		System.out.println("Enter your phoneno :");
	    phoneno = sc.nextLine();
		System.out.println("Enter your email id :");
	    emailid = sc.nextLine();
	    
	    PersonInfo person = new PersonInfo(fname,lname,add,city,state,zip,phoneno,emailid);
		contact.add(person);
		return person;
		
	
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		AddressBookMain  address = new AddressBookMain();
		
		//for person1
		address.enterInform();
		address.setPersonInfo(contact);
		
		//for person 2
		address.enterInform();
		address.setPersonInfo(contact);
		
		for(PersonInfo gen : address.getPersonInfo())
		{
		    System.out.println(gen);
		}		
	}

}
