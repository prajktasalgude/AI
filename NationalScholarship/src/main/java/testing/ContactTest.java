package testing;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Contact;
import service.ContactService;
import service.ContactServiceImplementation;

public class ContactTest {
	ContactService contactSer=new ContactServiceImplementation();
	@Test
	public void createTest() {

		Contact contact=new Contact();
	Assertions.assertTrue(contact!=null);
	System.out.println("Contact is created....");
	contact.setAadharNumber("765865887998");
	contact.setInstituteCode("7689");
	contact.setState("Maharashtra");
	contact.setDistrict("Sambhajinagar");
	contact.setAddressLine("Kranti Chowk, Sambhajinagar");
	contact.setPincode("431005");
	contact.setMobileNumber("9787565345");
	contact.setEmail("ram@gmail.com");
	contactSer.createContactService(contact);
	}
	
	@Test
	 public void selectTest() {
		Contact contact=contactSer.findContactService("765865887998");
		System.out.println(contact);
	}
	
	@Test
	public void selectsTest() {
		List <Contact> contactList=contactSer.findContactsService();
		for(Contact contact:contactList) {
		System.out.println(contact);
		}
	}
}
