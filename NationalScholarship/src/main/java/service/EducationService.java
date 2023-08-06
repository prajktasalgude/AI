package service;

import java.util.List;

import entities.Education;

public interface EducationService {
	void createEducationService(Education edu);
	Education findEducationService(String aadharNumber);
	List<Education> findEducationService();
	void modifyEducationService(Education education);
	void removeEducationService(String aadhartNumber);
}
