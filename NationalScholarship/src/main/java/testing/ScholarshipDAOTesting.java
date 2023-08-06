package testing;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.ScholarshipDAO;
import dao.ScholarshipDAOImplementation;
import entities.Scholarship;

public class ScholarshipDAOTesting {
	ScholarshipDAO schDAO = new ScholarshipDAOImplementation();
	
	@Test
	public void createScholarshipTest() {
		
		Scholarship sch = new Scholarship();
		Assertions.assertTrue(sch!=null);
		System.out.println("stud created....");
		
		sch.setAadharNumber("547658787998");
		sch.setNTSE("");		
		sch.setPragati("");
		sch.setPMS("");
		sch.setAlreadyNTSE(0);	
		sch.setAlreadyPragati(0);
		sch.setAlreadyPMS(0);
		schDAO.insertScholarship(sch);
		
	}
	
	@Test
	public void selectsTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(schDAO!=null);
		System.out.println("Got the DAO : "+schDAO);

		List<Scholarship> schObj = schDAO.selectScholarships();
		for (Scholarship sch: schObj) 
			System.out.println("Scholarship Obj : "+sch);

		System.out.println("Test over...");
	}
	
	@Test
	public void selectTest() {
		
		System.out.println("Test started..");
		Assertions.assertTrue(schDAO!=null);
		System.out.println("Got the DAO : "+schDAO);

		Scholarship schObj = schDAO.selectScholarship("547658787998");
		
		System.out.println("Scholarship Obj : "+schObj);

		System.out.println("Test over...");
	}
	
	@Test
	public void modifyInstituteTest() {
		
		Scholarship scholarship =schDAO.selectScholarship("547658787998");
		Assertions.assertTrue(scholarship!=null);
		System.out.println("bank created....");
		scholarship.setNTSE("Granted");
		//bank.setAccountNumber("23167287256");

		
		schDAO.updateScholarship(scholarship);
		
	}
}
