package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Contact;

public class ContactDAOImplementation extends BaseDAO implements ContactDAO{
	public ContactDAOImplementation() {
		super();
	}
	@Override
	public void insertContact(Contact contact) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO CONTACT_DETAILS VALUES (?,?,?,?,?,?,?,?)");
			
			
			pst.setString(1, contact.getAadharNumber());
			pst.setString(2, contact.getInstituteCode());
			pst.setString(3, contact.getState());
			pst.setString(4, contact.getDistrict());
			pst.setString(5, contact.getAddressLine());
			pst.setString(6, contact.getPincode());
			pst.setString(7, contact.getMobileNumber());
			pst.setString(8, contact.getEmail());
			

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement 
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Contact selectContact(String aadharNumber) {
		Contact contact =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement 
			ResultSet result = statement.executeQuery("SELECT * FROM CONTACT_DETAILS WHERE AADHAR_NUMBER="+aadharNumber);
			
			//5. process the result if any
			if(result.next()) {
				contact = new Contact(); //blank object
				
				contact.setAadharNumber(result.getString(1));
				contact.setInstituteCode(result.getString(2));
				contact.setState(result.getString(3));
				contact.setDistrict(result.getString(4));
				contact.setAddressLine(result.getString(5));
				contact.setPincode(result.getString(6));
				contact.setMobileNumber(result.getString(7));
				contact.setEmail(result.getString(8));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contact;
	}

	@Override
	public List<Contact> selectContacts() {
		// TODO Auto-generated method stub
		List<Contact> contactList = new ArrayList<Contact>();
		try {
			
			Statement statement = conn.createStatement();
			//System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM CONTACT_DETAILS");
			
			//5. process the result if any
			while(result.next()) {
				Contact contact = new Contact(); //blank object
				
				contact.setAadharNumber(result.getString(1));
				contact.setInstituteCode(result.getString(2));
				contact.setState(result.getString(3));
				contact.setDistrict(result.getString(4));
				contact.setAddressLine(result.getString(5));
				contact.setPincode(result.getString(6));
				contact.setMobileNumber(result.getString(7));
				contact.setEmail(result.getString(8));
				contactList.add(contact); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactList;
	}

//	@Override
//	public void updateContact(Contact contact) {
//		// TODO Auto-generated method stub
//		try {
//			PreparedStatement pst = 
//					conn.prepareStatement("UPDATE CONTACT_DETAILS set state=?,district=?,addressLine=?,institute_code=?,pincode=?,mobileNumber=?,email=? where aadhar_number=?");
//			
//			
//			pst.setString(1, contact.getAadharNumber());
//			pst.setString(2, contact.getInstituteCode());
//			pst.setString(3, contact.getState());
//			pst.setString(5,contact.getDistrict());
//			pst.setString(6, contact.getAddressLine());
//			pst.setString(7, contact.getPincode());
//			pst.setString(7, contact.getMobileNumber());
//			pst.setString(7, contact.getEmail());
//			
//			System.out.println("PreparedStatement is created : "+ pst);
//			
//			//4. execute that statement //  UR TABLENAME IS MYDEPT120
//			int rows = pst.executeUpdate();
//			
//			System.out.println("Row MODIFIED : "+rows);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	

}