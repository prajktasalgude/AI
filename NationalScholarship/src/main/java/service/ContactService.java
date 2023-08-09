package service;

import java.util.List;

import entities.Contact;

public interface ContactService {
	void createContactService(Contact contact);
	Contact findContactService(String aadharNumber);
	List<Contact> findContactsService();
	void modifyContactService(Contact contact);
	void removeAccountService(String aadhartNumber);
}
