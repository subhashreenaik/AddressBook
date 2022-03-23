package com.assignment.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 * This class is created for defining IO related methods
 * @author subhashree
 *
 */
public class AddressBookIOService {
	
	
	/**
	 * This method is used to write the list of data into a textfile.
	 * @param contactlist -list of contact
	 */
		public void writeData(List<PersonInfo> contactlist) {
			StringBuffer temp=new StringBuffer();
			contactlist.forEach(person ->{
				String data=person.toString().concat("\n");
				temp.append(data);
			});
			try {
				Files.write(Paths.get("C:\\Users\\91824\\Desktop\\contact.txt"),temp.toString().getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * This method is used to print the list of data from a text file to console.
		 * 
		 */
		public void printData() {
			try {
				Files.lines(new File("C:\\Users\\91824\\Desktop\\contact.txt").toPath())
				.forEach(System.out::println);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}