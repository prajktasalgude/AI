package service;

import java.util.List;

import entities.Scholarship;

public interface ScholarshipService {
	void createScholarshipService(Scholarship sch);
	Scholarship findScholarshipService(String aadharNumber);
	List<Scholarship> findScholarshipService();
	void modifyScholarshipService(Scholarship sch);
	void removeScholarshipService(String aadhartNumber);
}
