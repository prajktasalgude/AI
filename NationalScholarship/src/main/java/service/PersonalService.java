package service;

import java.util.List;

import entities.Personal;

public interface PersonalService {
	void createPersonalService(Personal personal);
	Personal findPersonalService(String aadharNumber);
	List<Personal> findPersonalService();
	void modifyPersonalService(Personal personal);
	void removePersonalService(String aadhartNumber);
}
