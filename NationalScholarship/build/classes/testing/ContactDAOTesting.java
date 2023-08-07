package testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.ContactDAO;
import dao.ContactDAOImplementation;
import entities.Contact;

public class ContactDAOTesting {


	ContactDAO contDAO = new ContactDAOImplementation();
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(contDAO!=null);
		System.out.println("Got the DAO : "+contDAO);

		Contact contObj = contDAO.selectContact("456289762312");
		
		System.out.println("Cont Obj : "+contObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void createContactTest() {
		
		Contact contObj = new Contact();
		Assertions.assertTrue(contObj!=null);
		System.out.println("edu created....");
		//contObj.setAadharNumber();
		contObj.setInstituteCode("34675");
		contObj.setState("");
		contObj.setDistrict("");		
		contObj.setAddressLine("");
		contObj.setPincode("");		
		contObj.setMobileNumber("");
		contObj.setEmail("");
		
		contDAO.insertContact(contObj);
	}
	
	@Test
	public void selectsTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(contDAO!=null);
		System.out.println("Got the DAO : "+contDAO);

		List<Contact> contObj = contDAO.selectContacts();
		for (Contact cont: contObj) 
			System.out.println("Student Obj : "+cont);

		System.out.println("Test over...");
	}

}