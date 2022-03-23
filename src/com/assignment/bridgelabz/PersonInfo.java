/**
 * 
 */
package com.assignment.bridgelabz;

/**
 * @author 91824
 *
 */
public class PersonInfo {
	
	//Declaring instance variable
		private String firstName;
		

		
		private String lastName;
		private String address;
		private String city;
		private String state;
		private String zip;
		private String phoneNo;
		private String email;
		
		
		PersonInfo(String firstName, String lastName,String address,String city,String state,String zip,String phoneNo,String email){
			this.lastName = lastName;
			this.address = address;
			this.firstName = firstName;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phoneNo=phoneNo;
			this.email = email;
			
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getAddress() {
			return address;
		}
		
		public String getCity() {
			return city;
		}
		
		public String getState() {
			return state;
		}
		
		public String getZip() {
			return zip;
		}
		
		public String getPhoneNo() {
			return phoneNo;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String toStringcsv() {
			StringBuilder dataBuilder = new StringBuilder();
	        appendFieldValue(dataBuilder, firstName);
	        appendFieldValue(dataBuilder, lastName);
	        appendFieldValue(dataBuilder, address);
	        appendFieldValue(dataBuilder, city);
	        appendFieldValue(dataBuilder, state);
	        appendFieldValue(dataBuilder, zip);
	        appendFieldValue(dataBuilder, phoneNo);
	        appendFieldValue(dataBuilder, email);

	        return dataBuilder.toString();
		}
		private void appendFieldValue(StringBuilder dataBuilder, String fieldValue) {
	        if(fieldValue != null) {
	            dataBuilder.append(fieldValue).append(",");
	        } else {
	            dataBuilder.append("").append(",");
	        }
	    }
		@Override
		public String toString() {
			return "PersonInfo [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
		}
		
		
		

}
