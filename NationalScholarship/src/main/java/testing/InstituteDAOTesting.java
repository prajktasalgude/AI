package testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.InstituteDAO;
import dao.InstituteDAOImplementation;
import entities.Institute;

public class InstituteDAOTesting {


	InstituteDAO instituteDAO = new InstituteDAOImplementation();

	@Test
	public void createStudentTest() {
		
		Institute institute = new Institute();
		Assertions.assertTrue(institute!=null);
		System.out.println("stud created....");
		
		institute.setInstituteCode("76889");
		institute.setInstituteName("Govt. Engineering College, Sambhajinagar");
		institute.setPrincipleName("A. S. Bhalchandra");
		institute.setLocation("Rural");
		institute.setInstitutePassword("Gecs@123");
		//institute.setVerified(false);
		
		instituteDAO.insertInstitute(institute);
		
	}
	
	@Test
	public void selectsTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(instituteDAO!=null);
		System.out.println("Got the DAO : "+instituteDAO);

		List<Institute> instituteObj = instituteDAO.selectInstitutes();
		for (Institute institute: instituteObj) 
			System.out.println("Institute Obj : "+institute);

		System.out.println("Test over...");
	}
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(instituteDAO!=null);
		System.out.println("Got the DAO : "+instituteDAO);

		Institute instituteObj = instituteDAO.selectInstitute("13844");
		
		System.out.println("Institute Obj : "+instituteObj);

		System.out.println("Test over...");
	}
	
	
	@Test
	public void modifyInstituteTest() {
		
		Institute institute =instituteDAO.selectInstitute("34675");
		Assertions.assertTrue(institute!=null);
		System.out.println("bank created....");
		institute.setVerified(true);
		//bank.setAccountNumber("23167287256");

		
		instituteDAO.updateInstitute(institute);
		
	}
}