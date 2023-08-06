package service;

import java.util.List;

import entities.Contact;

public interface ContactService {
	void createContactService(Contact contact);
	Contact findConactService(String aadharNumber);
	List<Contact> findContactService();
	void modifyContactService(Contact contact);
	void removeAccountService(String aadhartNumber);
}
