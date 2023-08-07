package service;

import java.util.List;

import entities.Institute;
import dao.InstituteDAO;
import dao.InstituteDAOImplementation;

public class InstituteServiceImplementation implements InstituteService{

	InstituteDAO instDAO=new InstituteDAOImplementation();
	
	//for institute registration
	@Override
	public void createInstituteService(Institute institute) {
		// TODO Auto-generated method stub
		instDAO.insertInstitute(institute);
	}

	//for institute
	@Override
	public Institute findInstituteService(String instituteCode) {
		// TODO Auto-generated method stub
		Institute institute=instDAO.selectInstitute(instituteCode);
		return institute;
	}

	//for SNO
	@Override
	public List<Institute> findInstitutesService() {
		// TODO Auto-generated method stub
		List <Institute> instList=instDAO.selectInstitutes();
		return instList;
	}

	@Override
	public void modifyInstituteService(Institute institute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInstituteService(String instituteCode) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Institute institute = new Institute();
		InstituteService instSer=new InstituteServiceImplementation();
		System.out.println("institute created....");
		
		institute.setInstituteCode("7689");
		institute.setInstituteName("Govt. Engineering College, Sambhajinagar");
		institute.setPrincipleName("A. S. Bhalchandra");
		institute.setLocation("Rural");
		institute.setInstitutePassword("Gecs@123");
		institute.setVerified(false);
		instSer.createInstituteService(institute);
		
		Institute institut=instSer.findInstituteService(institute.getInstituteCode());
		System.out.println(institut);
		
		List <Institute> instList=instSer.findInstitutesService();
		for(Institute in:instList) {
			System.out.println(in);
		}
	}

}
