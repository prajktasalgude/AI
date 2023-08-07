package service;

import java.util.List;

import entities.Institute;

public interface InstituteService {
	void createInstituteService(Institute institute);
	Institute findInstituteService(String instituteCode);
	List<Institute> findInstitutesService();
	void modifyInstituteService(Institute institute);
	void removeInstituteService(String instituteCode);
}
