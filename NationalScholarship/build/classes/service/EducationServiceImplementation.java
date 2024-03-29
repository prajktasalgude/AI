package service;
import entities.Education;
import dao.EducationDAOImplementation;

import java.util.List;

import dao.EducationDAO;

public class EducationServiceImplementation implements EducationService {
	EducationDAO eduDAO=new EducationDAOImplementation();
	@Override
	public void createEducationService(Education edu) {
		// TODO Auto-generated method stub
		eduDAO.createEducation(edu);
		
	}

	@Override
	public Education findEducationService(String aadharNumber) {
		// TODO Auto-generated method stub
		Education education=eduDAO.selectEducation(aadharNumber);
		return education;
	}

	@Override
	public List<Education> findEducationService() {
		// TODO Auto-generated method stub
		List<Education> eduList=eduDAO.selectEducations();
		return eduList;
	}

	@Override
	public void modifyEducationService(Education education) {
		// TODO Auto-generated method stub
		  eduDAO.updateEducation(education);
		
	}

	@Override
	public void removeEducationService(String aadhartNumber) {
		// TODO Auto-generated method stub
		
	}

}