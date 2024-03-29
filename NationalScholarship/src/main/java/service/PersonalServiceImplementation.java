package service;

import java.util.List;

import entities.Personal;
import dao.PersonalDAOImplementation;
import dao.PersonalDAO;

public class PersonalServiceImplementation implements PersonalService {
	PersonalDAO personalDAO=new PersonalDAOImplementation();
	@Override
	public void createPersonalService(Personal personal) {
		// TODO Auto-generated method stub
		personalDAO.insertPersonal(personal);
		
	}

	@Override
	public Personal findPersonalService(String aadharNumber) {
		// TODO Auto-generated method stub
		Personal personal=personalDAO.selectPersonal(aadharNumber);
		return personal;
	}

	@Override
	public List<Personal> findPersonalsService() {
		// TODO Auto-generated method stub
		List<Personal>personalList=personalDAO.selectPersonals();
		return personalList;
	}

	@Override
	public void modifyPersonalService(Personal personal) {
		// TODO Auto-generated method stub
		
		personalDAO.updatePersonal(personal);
		
	}

	@Override
	public void removePersonalService(String aadhartNumber) {
		// TODO Auto-generated method stub
		
	}

}