package dao;

import java.util.List;

import entities.Contact;

public interface ContactDAO {
	public void insertContact(Contact contact);
	public Contact selectContact(String aadaharNumber);
	public List<Contact> selectContacts();
	//public void updateContact(Contact contact);
	
}