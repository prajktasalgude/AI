package service;

import java.util.List;

import dao.ScholarshipDAO;
import dao.ScholarshipDAOImplementation;
import entities.Scholarship;

public class ScholarshipServiceImplementation implements ScholarshipService {
	ScholarshipDAO scholarDAO=new ScholarshipDAOImplementation();
	@Override
	public void createScholarshipService(Scholarship sch) {
		// TODO Auto-generated method stub
		scholarDAO.insertScholarship(sch);
	}

	@Override
	public Scholarship findScholarshipService(String aadharNumber) {
		// TODO Auto-generated method stub
		Scholarship sch=scholarDAO.selectScholarship(aadharNumber);
		return sch;
	}

	@Override
	public List<Scholarship> findScholarshipsService() {
		// TODO Auto-generated method stub
		List <Scholarship> schList=scholarDAO.selectScholarships();
		return schList;
		
	}

	@Override
	public void modifyScholarshipService(Scholarship sch) {
		// TODO Auto-generated method stub
		scholarDAO.updateScholarship(sch);
	}

	@Override
	public void removeScholarshipService(String aadhartNumber) {
		// TODO Auto-generated method stub
		
	}

}
