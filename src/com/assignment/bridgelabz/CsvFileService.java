package com.assignment.bridgelabz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CsvFileService {
	/**
	 * This method is used to write the list of data into a csv file
	 * @param contactlist -list of contact
	 * @param header -array of string
	 */
	public void writeToCsv(List<PersonInfo> contactlist, String[] header) throws IOException {
        PrintWriter writer = new PrintWriter("C:\\Users\\91824\\Desktop\\contacts.csv");
        for(int i=0;i<header.length;i++) {
        writer.print(header[i]+"  ");
        }
        writer.print("\n");
        for (PersonInfo person : contactlist) {
            writer.println(person.toStringcsv());
        }
        writer.close();
    }
	/**
	 * This method is used to print the list of data from a csv  file to console.
	 * 
	 */
	public void ReadfromCSV() {
		List<List<String>> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91824\\Desktop\\contacts.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        records.add(Arrays.asList(values));
		    }
		    System.out.println(records);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
