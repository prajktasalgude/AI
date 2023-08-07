package service;
import java.util.List;
import entities.Contact;
import dao.ContactDAOImplementation;
import dao.ContactDAO;

public class ContactServiceImplementation implements ContactService {
	ContactDAO contDAO=new ContactDAOImplementation();
	public void createContactService(Contact contact) {
		contDAO.insertContact(contact);
	}
	public Contact findConactService(String aadharNumber){
		Contact cont=contDAO.selectContact(aadharNumber);
		return cont;
	}
	public List<Contact> findContactService(){
		List<Contact>contactList=contDAO.selectContacts();
		return contactList;
	}
    public void modifyContactService(Contact contact) {
    	
    }
    public void removeAccountService(String aadhartNumber) {
    	
    }
    /*public static void main(String[] args) {
    	ContactService contactSer=new ContactServiceImplementation();
    	Contact contact=new Contact();
    	System.out.println("Contact is created....");
    	contact.setAadharNumber();
    	contact.setInstituteCode();
    	contact.setState();
    	contact.setDistrict();
    	contact.setAddressLine();
    	contact.setsetPincode();
    	contact.setsetMobileNumber();
    	contact.setEmail();
    	List <Contact> contList=contactSer.selectContacts();
		for(Contact c1;contList) {
			System.out.println(c1);
		}
    }*/
}